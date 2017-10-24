import math
# finding all palindromic primes between two supplied as input (start and end points are excluded).
# Yacoob Legong
# 27 March
N = eval(input("Enter the start point N:\n"))
M = eval(input("Enter the end point M:\n"))
print("The palindromic primes are:")

for i in range(N+1,M):
    factor = 0
    
    x = int(math.sqrt(i)+1)
    for k in range(1,x):
        check = i%k
        if check==0:
            factor +=1  
    if factor==1:
        S1 = str(i)
        S2 = S1[::-1]
        
        if S1 == S2:
            print(S1)
           
     

    
    
    
        
    
    
    
   
        
    
    
    
      