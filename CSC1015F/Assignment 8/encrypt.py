z = ""
def Recencypt(string):
    if len(string)==0:
        global z
        if "!" in z or "/" in z:
            a = z.replace("!"," ")
            b = a.replace("/",".")
            return b
    
        else:
            return z
    else:
        y = ord(string[0])
        y+=1
        if y> ord("z"):
            y -=26
        z +=chr(y)
        return Recencypt(string[1:])
def main():
    string = input("Enter a message:\n")
    if string.islower():
        print("Encrypted message:\n"+Recencypt(string))
    else:
        print("Encrypted message:\n"+string)
if __name__ =='__main__':
    main()