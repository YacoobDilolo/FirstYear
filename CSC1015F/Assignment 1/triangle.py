# Program to calculate the are of a triangle
# Yacoob Legong
# 06 March 2015
# Variables to store the sides 
a = eval( input("Enter the length of the first side: "))
b = eval( input("Enter the length of the second side: "))
c = eval( input("Enter the length of the third side: "))
# Formula to calculate the are 
s = (a+b+c)/2
import math
Area = math.sqrt(s*(s-a)*(s-b)*(s-c))
print ("The area of the triangle with sides of length",a, "and", b, "and",c, "is", Area,end=".")



  
