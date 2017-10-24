# t asks the user to enter a number, n, where -6<n<2.Starting from n, the program will print out every 7th number in the range n to n+41.
# Yacoob Legong
# 27 March 2015
n = eval(input("Enter a number: "))
# n, where -6<n<100
if -6<n and n<2:
    for i in range(n,n+41,7):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m                   
        print("{0:<3}".format (i))       
           
    