# List of somehelp responses 
# Yacoob Legong
# 24 April 2015
a =["Are the drivers up to date?","Ah, the blue screen of death. And then what happened?","You should consider installing anti-virus software.","Have you tried mouthwash?","Ah, I think I see your problem. What version?","You do mean the computer kind don't you?","You should see if your mail client can filter messages.","Contact Telkom.","Curious, tell me more."]
x = ["crashed","blue","hacked","bluetooth","windows","apple","spam","connection"]
def welcome():
    print('Welcome to the automated technical support system.')
    print('Please describe your problem:')
def get_input():
    return input().lower()
def b_position(x, query):
    for i in range(len(x)):
        if x[i]==query:
            return i
    else:
        i = 8
        return i
            
def main():
    welcome()
    query = get_input()
    while (not query=="quit"):
        i = b_position(x, query)
        answer = a[i]
        print(answer)
        query = get_input()
        
if __name__=='__main__':
    main()