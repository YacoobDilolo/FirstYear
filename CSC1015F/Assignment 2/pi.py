# Calculating the aproximation of pi and coputing the area
# Yacoob Legong
# 13 March 2015
import math
den = math.sqrt(2)
y = 2/den
term = 2
while y != 1:
    term *= y
    den = math.sqrt(2+den)
    y = 2/den
    
print("Approximation of pi:",round(term,3))
A = eval(input("Enter the radius:\n",))
print("Area:",round(term*(A*A),3))
    

    


    

