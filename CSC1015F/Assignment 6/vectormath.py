# vector math 
# Yacoob Legong
# 24 April 2015
import math
A = input("Enter vector A:\n")
B = input("Enter vector B:\n")
x = A.split(" ")
y = B.split(" ")
lst=[]
for i in range(len(x)):
    for k in range(len(y)):
        if i==0 and k ==0:
            a=int(x[0])+int(y[0])
            lst.append(a)
        elif i==1 and k ==1:
            b=int(x[1])+int(y[1])
            lst.append(b) 
            continue
        elif i==2 and k ==2:
            c=int(x[2])+int(y[2])
            lst.append(c)
    z = lst
print("A+B =",z)
d = 0
for i in range(len(x)):
    for k in range(len(y)):
        if i==0 and k ==0:
            a=int(x[0])*int(y[0])
            d +=a
        elif i==1 and k ==1:
            b=int(x[1])*int(y[1])
            d +=b
            continue
        elif i==2 and k ==2:
            c=int(x[2])*int(y[2])
            d +=c
    z = d
print("A.B =",z)
x = A.split(" ")
d = 0
for i in range(len(x)):
        if i==0:
            a=int(x[0])**2
            d +=a
        elif i==1:
            b=int(x[1])**2
            d +=b
            continue
        elif i==2:
            c=int(x[2])**2
            d +=c
z = math.sqrt(d)
print("|A| =","{0:3.2f}".format (z))
y = B.split(" ")
d = 0
for i in range(len(y)):
        if i==0:
            a=int(y[0])**2
            d +=a
        elif i==1:
            b=int(y[1])**2
            d +=b
            continue
        elif i==2:
            c=int(y[2])**2
            d +=c
z = math.sqrt(d)
print("|B| =","{0:3.2f}".format (z))

     
