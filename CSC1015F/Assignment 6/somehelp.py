# List of somehelp responses 
# Yacoob Legong
# 24 April 2015
import random
def welcome():
    print('Welcome to the automated technical support system.')
    print('Please describe your problem:')
def get_input():
    return input().lower()

def main():
    a = "Have you tried it on a different operating system?"
    b = "Did you reboot it?"
    c = "What colour is it?"
    d = "You should consider installing anti-virus software."
    e = "Contact Telkom."
    f = "I'd get that looked at if I were you."
    x = [a,b,c,d,e,f]
    welcome()
    query = get_input()
    while (not query=="quit"):
        y = random.randint(0,5)
        print(x[y])
        query = get_input()
        
if __name__=='__main__':
    main()    

        
        
        

    
    
    
    

    