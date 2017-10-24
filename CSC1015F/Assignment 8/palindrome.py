def Recpalindrome(string):
    if len(string)==0 or len(string)==1:
        return ("Palindrome!")
    elif string[0]==string[-1]:
        return(Recpalindrome(string[1:][:-1]))
    else:
        return ("Not a palindrome!")
def main():
    string = input("Enter a string:\n")
    print(Recpalindrome(string))


if __name__== '__main__':
    main()