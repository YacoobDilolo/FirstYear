#PRINT FUNCTION
# Yacoob Legong
# 20 April 2015
import math
fx = input("Enter a function f(x):\n")
for y in range(10,-11,-1):
    a =-10
    print("",end="")
    for x in range(-10,11):
        b =eval(fx)
        if y==round(b) and x==a:
            print("o",end="")
        elif x!=0 and y!=0:
            print(" ",end="")
        elif x==0 and y==0:
            print("+",end="")
        elif x==0:
            print("|", end="")
        elif y==0:
            print("-",end="")
        a +=1
    print()
    