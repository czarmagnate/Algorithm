a,b = map(int,input().split())

for num in range(a,b+1):
    isPrime = True    
    for i in range(2,int(num**0.5)+1):    
        if num % i == 0:
            isPrime = False            
            break            
    if isPrime:
        if num!=1:
            print(num)