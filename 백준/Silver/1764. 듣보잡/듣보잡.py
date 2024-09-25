num1,num2 = map(int,input().split())
hear = set(input() for _ in range(num1))
see = set(input() for _ in range(num2))
hear_see = sorted(hear & see)

print(len(hear_see))
for name in hear_see:
    print(name)