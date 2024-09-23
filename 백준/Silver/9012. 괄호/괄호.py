n = int(input())
for i in range(n):
    stack = []
    m = input()    
    for j in m:
        if j == '(':
            stack.append(j)
        else:
            if len(stack) != 0:
                stack.pop()
            else:
                stack.append(j)
                break
    if len(stack) == 0:
        print('YES')
    else:
        print('NO')            
