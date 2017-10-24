#accepts a number, n, where -6<n<2. The program will print out the numbers n to n+41 as 6 rows of 7 numbers
#The first row will contain the values n to n+6 the second, the values n+7 to n+7+6, and so on.
# Yacoob Legong
# 27 March 2015
n = eval(input("Enter the start number: "))
# n, where -6<n<2
if -6<n and n<2:
            for i in range(n,n+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                               
                        print(i,"",end="")
            print()
            for i in range(n+7,n+7+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                               
                        print(i,"",end="")
            print()
            for i in range(n+7+7,n+7+7+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                                  
                        print(i,"",end="")
            print()
            for i in range(n+7+7+7,n+7+7+7+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                                  
                        print(i,"",end="")
            print()
            for i in range(n+7+7+7+7,n+7+7+7+7+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                                  
                        print(i,"",end="")
            print()
            for i in range(n+7+7+7+7+7,n+7+7+7+7+7+7):
                        if len(str(i))==1:
                                    m =" "
                                    m +=str(i)
                                    i=m                                  
                        print(i,"",end="")                    
                                    
            
    