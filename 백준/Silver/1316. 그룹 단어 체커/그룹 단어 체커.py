n = int(input())
cnt = n

for i in range(n):
    temp = input()
    for j in range(len(temp)-1):
        if temp[j]==temp[j+1]:
            pass
        elif temp[j] in temp[j+1:]:
            cnt-=1
            break

print(cnt)