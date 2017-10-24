# ask the user for a month name and start day and then prints the calendar for that month in a 6 row by 7 column grid
# Yacoob Legong
# 27 March 2015
m = input("Enter the month ('January', ..., 'December'): ")
d = input("Enter the start day ('Monday', ..., 'Sunday'): ")
print(m)
print("{0} {1} {2} {3} {4} {5} {6}".format("Mo","Tu","We","Th","Fr","Sa","Su",sep=" ",end=""))
if m=="January" or m=="March"or m=="May" or m=="July" or m=="August" or m=="October" or m=="December":
    days = 32
if m=="February":
    days = 29
if m=="April":
    days = 31
if m=="June":
    days = 31
if m=="September":
    days = 31
if m=="November":
    days = 31    
    
    
if d=="Monday":
    for i in range(1,8):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m                          
        print("{0:<3}".format (i),end="")
    print()
    for i in range(1+7,1+7+7):
        if len(str(i))==1:
                    m =" "
                    m +=str(i)
                    i=m           
        print("{0:<3}".format (i),end="")
    print()        
    for i in range(1+7+7,7+7+7+1):
        print("{0:<3}".format (i),end="")
    print()   
    for i in range(1+7+7+7,7+7+7+7+1):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(1+7+7+7+7,days):
        print("{0:<3}".format (i),end="")     
if d=="Tuesday":
    for i in range(1,2):
        print("{0:>5}".format (i),end=" ")
    for i in range(2,7):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7,7+7):
        if len(str(i))==1:
                    m =" "
                    m +=str(i)
                    i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+7,7+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+7+7,7+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(7+7+7+7,days):
        print("{0:<3}".format (i),end="")
if d=="Wednesday":
    for i in range(1,2):
        print("{0:>8}".format (i),end=" ")
    for i in range(2,6):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
        print("{0:<3}".format (i),end="")
    print()
    for i in range(6,7+6):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+6,6+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(6+7+7,6+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(6+7+7+7,days):
        print("{0:<3}".format (i),end="")
    
if d=="Thursday":
    for i in range(1,2):
        print("{0:>11}".format (i),end=" ")
    for i in range(2,5):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
            print("{0:<3}".format (i),end="")
    print()
    for i in range(5,7+5):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+5,5+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(5+7+7,5+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(5+7+7+7,days):
        print("{0:<3}".format (i),end="")
                
if d=="Friday":
    for i in range(1,2):
        print("{0:>14}".format (i),end=" ")
    for i in range(2,4):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
        print("{0:<3}".format (i),end="")
    print()
    for i in range(4,7+4):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+4,4+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(4+7+7,4+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(4+7+7+7,days):
        print("{0:<3}".format (i),end="")
                        
                        
if d=="Saturday" and not m=="February":
    for i in range(1,2):
        print("{0:>17}".format (i),end=" ")
    for i in range(2,3):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
            print("{0:<3}".format (i),end="")
    print()
    for i in range(3,7+3):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
            print("{0:<3}".format (i),end="")
    print()
    for i in range(7+3,3+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(3+7+7,3+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(3+7+7+7,3+7+7+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(3+7+7+7+7,days):
        print("{0:<3}".format (i),end="")        

if d=="Saturday" and m=="February":
    for i in range(1,2):
        print("{0:>17}".format (i),end=" ")
    for i in range(2,3):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m            
        print("{0:<3}".format (i),end="")
    print()
    for i in range(3,7+3):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+3,3+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(3+7+7,3+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(3+7+7+7,days):
        print("{0:<3}".format (i),end="")       
if d=="Sunday"and not m=="February":
    for i in range(1,2):
        print("{0:>20}".format (i),end=" ")
    print()
    for i in range(2,7+2):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+2,2+7+7):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m                    
        print("{0:<3}".format (i),end="")
    print()
    for i in range(2+7+7,2+7+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(2+7+7+7,2+7+7+7+7):
        print("{0:<3}".format (i),end="")
    print()
    for i in range(2+7+7+7+7,days):
        print("{0:<3}".format (i),end="")    
if m=="February" and d=="Sunday":
    for i in range(1,2):
        print("{0:>20}".format (i),end=" ")
    print()
    for i in range(2,7+2):
        if len(str(i))==1:
                m =" "
                m +=str(i)
                i=m             
        print("{0:<3}".format (i),end="")
    print()
    for i in range(7+2,2+7+7):
        if len(str(i))==1:
            m =" "
            m +=str(i)
            i=m                    
        print("{0:<3}".format (i),end="")
    print()
    for i in range(2+7+7,2+7+7+7):
        print("{0:<3}".format (i),end="")  
    print() 
    for i in range(2+7+7+7,days):
        print("{0:<3}".format (i),end="")
        
                                        
                                        