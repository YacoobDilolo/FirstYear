try:
    yList = []
    x=open("EnglishWords.txt",'r')
    a =x.readlines()
    x.close()
    c =a[a.index("START\n")+1:]
    for i in range(len(c)):
        item=c[i].replace('\n','')
        yList.append(item)
    print("***** Anagram Finder *****")
    q= input("Enter a word:\n")
    y ={}
    for e in q:
        if e not in y:
            y[e]=1
        else:
            y[e]=y[e]+1
    xList=[]
    for i in range(len(yList)):
        x = {}
        for k in range(len(yList[i])):
            if yList[i][k] not in x:
                x[yList[i][k]]=1
            else:
                x[yList[i][k]]=x[yList[i][k]]+1
        if x==y:
            xList.append(yList[i])
            if q in xList:
                xList.remove(q)
            xList.sort()
    if xList==[]:
            print("Sorry, anagrams of"+" "+"'"+q+"'"+" "+"could not be found.")
    else:
        print(xList)
except FileNotFoundError:
    print("***** Anagram Finder *****")
    print("Sorry, could not find file 'EnglishWords.txt'.")
