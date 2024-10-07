n, m = map(int,input().split())
arr_dict = {}
arr = []

for i in range(n):
    s = input()
    arr_dict[s] = i + 1
    arr.append(s)
    
for _ in range(m):
    x = input()
    if x.isdigit():
        print(arr[int(x)-1])
    else:
        print(arr_dict.get(x))

