
print("***** Anagram Set Search *****")
yList = []
x=open("EnglishWords.txt",'r')
a =x.readlines()
x.close()
c =a[60:]
for i in range(len(c)):
  item=c[i].replace('\n','')
  yList.append(item)
n = eval(input("Enter word length:\n"))
print("Searching...")
m = []
for i in range(len(yList)):
  if len(yList[i])==n:
    m.append(yList[i])
xList=[]
for i in range(len(m)):
  x = {}
  for k in range(len(m[i])):
          if m[i][k] not in x:
              x[m[i][k]]=1
          else:
              x[m[i][k]]=x[m[i][k]]+1
  xList.append(x)
filename = input("Enter file name:\n")
print("Writing results...")
myFile=open(filename,'w')  #open first in 'w' mode to clear the file
myFile.close()
w =[]
b =0
for i in xList:
    l =[]
    for k in range(len(xList)):
        if i==xList[k]:
            l.append(m[k])
            l.sort()
            xList[k]=b
            b+=1   
    if len(l)>1:
      w.append(l)
      w.sort()
myFile=open(filename,'a')
for i in w:
  print(i,file=myFile)
myFile.close()
  
    

    
    
      