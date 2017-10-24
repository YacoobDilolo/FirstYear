def to_pig_latin(s):
    d =""
    y = 1
    z=""
    m= 0
    for i in s:
        if i!=" ":
            y = 1
            d+=i
            x = d
        elif i==" ":
            x = d
            if x[0]=="a" or x[0]=="e" or x[0]=="i" or x[0]=="o" or x[0]=="u":
                x = d+"way"+" "
                z +=x
                d =""
            else:
                for j in d:
                    if j!="a" and j!="e" and j!="i" and j!="o" and j!="u" and y!=0:
                        m +=1
                    elif j=="a" or j=="e" or j=="i" or j=="o" or j=="u":
                        y = 0
                            
                x =d[m:]+"a"+ d[:m]+"ay"+" "
                z +=x
                d = ""
                m=0
    
    if x[0]=="a" or x[0]=="e" or x[0]=="i" or x[0]=="o" or x[0]=="u":
        x = d+"way"
        z +=x
        d =""
    else:
        for j in d:
            if j!="a" and j!="e" and j!="i" and j!="o" and j!="u" and y!=0:
                m +=1
            elif j=="a" or j=="e" or j=="i" or j=="o" or j=="u":
                y = 0
        x =d[m:]+"a"+ d[:m]+"ay"+" "
        z +=x 
        d = ""
        m=0
    return  z
def to_english(s):
    a = ""
    b = ""
    c = ""
    z=""
    d = ""
    y=""
    o =1
    m = 0
    d = ""
    y=""
    q =""
    for i in s:
        if i!=" ":
            d +=i
        
        elif i==" ":
            for k in d:
                if k=="w":
                    z= d.index("w")
                    x = d[:z]+" "
                    y +=x
            if d[len(d)-3]!="w":
                x = d[:len(d)-2]
                q = x[::-1]
                for j in q:
                    if j!="a" and j!="e" and j!="i" and j!="o" and j!="u"  and o!=0:
                        m +=1
                    elif j=="a" or j=="e" or j=="i" or j=="o" or j=="u":
                        o = 0
                b = x[len(x)-m:]
                c = x[:len(x)-(m+1)]
                z = b+c+" "
                y +=z 
                d = ""
                m = 0
                o = 1
            d = ""
              
    for k in d:
        if k=="w":
            z= d.index("w")
            x = d[:z]
            y +=x
       
    if d[len(d)-3]!="w":
        x = d[:len(d)-2]
        q = x[::-1]
        for j in q:
            if j!="a" and j!="e" and j!="i" and j!="o" and j!="u" and o!=0:
                m +=1
            elif j=="a" or j=="e" or j=="i" or j=="o" or j=="u":
                o = 0
        b = x[len(x)-m:]
        c = x[:len(x)-(m+1)]
        z = b+c+" "
        y +=z 
        d = ""
        m = 0
        o = 1
    d =""
           
    return y
