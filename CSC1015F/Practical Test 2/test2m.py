length = eval((input("Enter the length of the sequence:\n")))
a = "1"
L = []
while length>0:
    w= input("Enter word"+" "+a+":"+"\n")
    a = int(a)
    a +=1
    a = str(a)
    L.append(w)
    length -=1
X = L
L.sort()
if X == L.reverse():
    print("The words are in reverse alphabetical order.")
else:
    print("The words are not in reverse alphabetical order.")
    

    
    
