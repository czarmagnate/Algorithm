def solution(s,skip,index):
    result = ''
    s = [ord(i) - 97 for i in s]
    skip = [ord(i) - 97 for i in skip]

    for a in s:
        cnt = 0
        plus = 1
        while True:
            if (a + plus) % 26 not in skip:
                cnt+=1
            if cnt == index:
                result += chr((a+plus)%26 + 97)
                break
            plus+=1

    return result
