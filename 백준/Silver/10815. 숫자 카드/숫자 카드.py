n = int(input())
arr_set = set(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

result = []
for num in arr2:
    if num in arr_set:
        result.append('1')
    else:
        result.append('0')

print(' '.join(result))