num = int(input())
arr = list(map(int,input().split()))
answer = 0
arr.sort()

for i in range(1,num+1):
    answer+=sum(arr[0:i])
    
print(answer)