n = int(input())
queue = []
for i in range(n):
    a = input()    
    if a.startswith('push'):
        a,b = a.split()
        b = int(b)
        queue.append(b)
    elif a == 'pop':
        if len(queue)!=0:
            print(queue.pop(0))
        else :
            print(-1)
    elif a == 'size':
        print(len(queue))
    elif a == 'empty':
        if len(queue)==0:
            print(1)
        else:
            print(0)
    elif a == 'front':
        if len(queue)!=0:
            print(queue[0])
        else:
            print(-1)
    elif a == 'back':
        if len(queue)!=0:
            print(queue[len(queue)-1])
        else:
            print(-1)
    else :
        print("잘못된 입력")