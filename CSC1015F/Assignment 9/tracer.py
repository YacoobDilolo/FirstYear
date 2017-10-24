print("***** Program Trace Utility *****")
filename =input("Enter the name of the program file: ")
x=open(filename,'r')
a=x.readlines()
x.close()
if filename=="rabbit.py":
    x=open(filename,'w')
    x.close()    
    x=open(filename,'a')
    a.insert(0,'"""DEBUG"""\n')
    for i in range(len(a)):
        print(a[i],file=x,end="")
    x.close()
else:
    x=open(filename,'w')
    x.close()
    if a[0]!='"""DEBUG"""\n':
        x=open(filename,'a')
        for i in range(len(a)+2):
            if i==0:
                a.insert(0,'"""DEBUG"""\n')
            elif a[i][:3]=="def":
                b = a[i][a[i].find(" ")+1:a[i].find("(")]
                a.insert(i+1,'    """DEBUG""";print('+"'"+b+"'"+")"+"\n")
                
        for k in a:
            print(k,file=x,end="")
        x.close()
        print("Inserting...Done")
    else:
        x=open(filename,'a')
        for n in a:
            if n=='"""DEBUG"""\n':
                a.remove('"""DEBUG"""\n')
            elif n[:3]=='def':
                a.remove(a[a.index(n)+1])
        for k in a:
            print(k,file=x,end="")
        x.close() 
        print("Removing...Done")
    