def  bukiyip_to_decimal (num):
    num = str(num)
    num1 = 0
    num2 = 0
    num3 = 0
    if len(num)==1:
        new_num =int(num)
    elif len(num)==2:
        num1 = int(num[0] )
        num2 = int(num[1] )
        new_num =num1*3+num2
    elif len(num)==3:
        num1 = int(num[0] )
        num2 = int(num[1] )
        num3 = int(num[2])
        new_num =num1*9+num2*3+num3
    return new_num

def decimal_to_bukiyip(num):
    a = 0
    b = 0
    c = 0
    d = 0
    e = 0
    f = 0
    new_num =""
    a = num
    while (243>=a>81):
        a -=81
        f +=1
        
    while (81>=a>27):
        a -=27
        e +=1
    while (27>=a>=9):
        a -=9
        b +=1
    if a>3 or a==3:
        while a>3 or a==3:
            a -=3
            c +=1
    else:
        while a>0:
            a -=1
            d +=1
    while a>0:
        a -=1
        d +=1 
    new_num =str(f)+str(e)+str(b)+str(c)+str(d)
    return int(new_num)       
def bukiyip_add(num1, num2):
    def bukiyip_add0(num1):
        num1 = str(num1)
        num4 = 0
        num5 = 0
        num3 = 0
        new_num1 = 0
        if len(num1)==1:
            new_num1 =int(num1)
        elif len(num1)==2:
            num4 = int(num1[0] )
            num5 = int(num1[1] )
            new_num1 =num4*3+num5
        elif len(num1)==3:
            num4 = int(num1[0] )
            num5 = int(num1[1] )
            num3 = int(num1[2])
            new_num1 =num4*9+num5*3+num3
        return new_num1
    def bukiyip_add1(num2):
        num2 = str(num2)
        new_num2 = 0
        if len(num2)==1:
            new_num2 =int(num2)
        elif len(num2)==2:
            num4 = int(num2[0] )
            num5 = int(num2[1] )
            new_num2 =num4*3+num5
        elif len(num2)==3:
            num4 = int(num2[0] )
            num5 = int(num2[1] )
            num3 = int(num2[2])
            new_num2 =num4*9+num5*3+num3
        return new_num2
    x = bukiyip_add0(num1)+bukiyip_add1(num2)
    a = 0
    b = 0
    c = 0
    d = 0
    e = 0
    f = 0
    new_num_added=""
    a = x
    while (243>=a>81):
        a -=81
        f +=1
        
    while (81>=a>27):
        a -=27
        e +=1
    while (27>=a>=9):
        a -=9
        b +=1
    if a>3 or a==3:
        while a>3 or a==3:
            a -=3
            c +=1
    else:
        while a>0:
            a -=1
            d +=1
    while a>0:
        a -=1
        d +=1 
    new_num_added =str(f)+str(e)+str(b)+str(c)+str(d)
    return int(new_num_added)

def bukiyip_multiply(num1, num2):
    def bukiyip_multiply0(num1):
        num1 = str(num1)
        num4 = 0
        num5 = 0
        num3 = 0
        new_num1 = 0
        if len(num1)==1:
            new_num1 =int(num1)
        elif len(num1)==2:
            num4 = int(num1[0] )
            num5 = int(num1[1] )
            new_num1 =num4*3+num5
        elif len(num1)==3:
            num4 = int(num1[0] )
            num5 = int(num1[1] )
            num3 = int(num1[2])
            new_num1 =num4*9+num5*3+num3
        return new_num1
    def bukiyip_multiply1(num2):
        num2 = str(num2)
        new_num2 = 0
        if len(num2)==1:
            new_num2 =int(num2)
        elif len(num2)==2:
            num4 = int(num2[0] )
            num5 = int(num2[1] )
            new_num2 =num4*3+num5
        elif len(num2)==3:
            num4 = int(num2[0] )
            num5 = int(num2[1] )
            num3 = int(num2[2])
            new_num2 =num4*9+num5*3+num3
        return new_num2
    x = bukiyip_multiply0(num1)*bukiyip_multiply1(num2)
    a = 0
    b = 0
    c = 0
    d = 0
    e = 0
    f = 0
    new_num_multiplied=""
    a = x
    while (243>=a>81):
        a -=81
        f +=1
        
    while (81>=a>27):
        a -=27
        e +=1
    while (27>=a>=9):
        a -=9
        b +=1
    if a>3 or a==3:
        while a>3 or a==3:
            a -=3
            c +=1
    else:
        while a>0:
            a -=1
            d +=1
    while a>0:
        a -=1
        d +=1 
    new_num_multiplied =str(f)+str(e)+str(b)+str(c)+str(d)
    return int(new_num_multiplied)

   
   
   
   