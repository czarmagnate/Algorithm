n,m = map(int,input().split())
arr = [list(input().strip()) for i in range(n)]
answer = -1

def isSquareNum(x):
    x = int(x)
    return int(x**0.5)**2 == x

for i in range(n):
    for j in range(m):
        for diff_x in range(-n,n):
            for diff_y in range(-m,m):
                temp = ""
                x,y = i,j
                if diff_x == 0 and diff_y == 0:
                    continue
                while 0 <= x < n and 0<=y<m:
                    temp += arr[x][y]
                    if isSquareNum(int(temp)):
                        answer=max(answer,int(temp))
                    x+=diff_x
                    y+=diff_y
print(answer)