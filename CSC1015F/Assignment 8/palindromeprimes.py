import math
import sys
sys.setrecursionlimit (30000)
# finding all palindromic primes between two supplied as input (start and end points are excluded).
# Yacoob Legong
#08 May 2015
def main():
    N = eval(input("Enter the starting point N:\n"))
    M = eval(input("Enter the ending point M:\n"))
    d = 2
    print("The palindromic primes are:")
    palindromicprime(N,M,d)
    
def palindromicprime(N,M,d):
    if N==M:
        if (Recpalindromic(N)):
            if (prime(N,d)):
                print(N)
            else:
                return           
        else:
            return
        
    elif (Recpalindromic(N)):
        if (prime(N,d)):
            print(N)
            return palindromicprime(N+1,M,d)
        else:
            return palindromicprime(N+1,M,d)        
        
    else:
        return palindromicprime(N+1,M,d)
def prime(N,d):
    if d>math.sqrt(N):
        return True
    elif N%d==0:
        return False
    else:
        return prime(N,d+1)
def Recpalindromic(N):
    if len(str(N))==0 or len(str(N))==1:
        return True 
    else: 
        if str(N)[0]==str(N)[-1]:
            return Recpalindromic(str(N)[1:-1])
        else:
            return False    

if __name__=='__main__':
    main()
    
    

           