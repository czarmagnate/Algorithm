def solution(wallpaper):
    answer = []
    left = len(wallpaper[0])
    right = 0
    start = len(wallpaper)
    end = 0
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if '#' in wallpaper[i] and i <= start:
                start = i
            if '#' in wallpaper[i] and i >= end:
                end = i
            if wallpaper[i][j] == '#' and j <= left:
                left = j
            if wallpaper[i][j] == '#' and j >= right:
                right = j
    
    answer.append(start)
    answer.append(left)
    answer.append(end+1)
    answer.append(right+1)
    
    return answer