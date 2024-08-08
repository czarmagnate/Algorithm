def solution(num, total):    
    middle = total // num
    middle 
    start = middle - ((num - 1) // 2)
    end = middle + (num // 2)
    answer = [i for i in range(start,end+1)]
    return answer