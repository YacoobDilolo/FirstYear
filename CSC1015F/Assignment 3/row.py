# The asks the user to enter a number, n, where -6<n<93.The program will print a sequence of 7 numbers, starting from that value. 
# Yacoob Legong
# 27 March 2015
n = eval(input("Enter the start number:"))
if -6<n and n<93:
    for i in range(7):
        print("{0:>3}".format (i+n),end="")

                         
