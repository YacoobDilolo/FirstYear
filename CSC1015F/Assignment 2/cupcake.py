# determining whether or not you should eat the food 
# Yacoob Legong 
# 13 March 2014
print("Welcome to the 30 Second Rule Expert")
print("------------------------------------")
print("Answer the following questions by selecting from among the options.")
a = input("Did anyone see you? (yes/no) ") 
print()
if a== "yes":
 b = input("Was it a boss/lover/parent? (yes/no) ")
 print()
 if b== "yes":
  c = input("Was it expensive? (yes/no) ")
  print()
  if c== "yes":
   d = input("Can you cut off the part that touched the floor? (yes/no) ")
   print()
   if d== "yes":
    print("Decision: Eat it.")
   elif d== "no":
    print("Decision: Your call.")
  elif c== "no":
   e = input("Is it chocolate? (yes/no) ")
   print()
   if e== "yes": 
    print("Decision: Eat it.")
   elif e== "no":
    print("Decision: Don't eat it.")
 elif b== "no":
  print("Decision: Eat it.")
elif a== "no":
 f = input("Was it sticky? (yes/no) ")
 print()
 if f== "yes":
  g = input("Is it a raw steak? (yes/no) ")
  print()
  if g== "yes":
   h = input("Are you a puma? (yes/no) ")
   print()
   if h== "yes":
    print("Decision: Eat it.")
   elif h== "no":
    print("Decision: Don't eat it.")
  elif g== "no":
   i = input("Did the cat lick it? (yes/no) ")
   print()
   if i== "yes":
    j = input("Is your cat healthy? (yes/no) ") 
    print()
    if j== "yes":
     print("Decision: Eat it.")
    elif j== "no":
     print("Decision: Your call.")
   elif i== "no":
    print("Decision: Eat it.")
 elif f== "no":
  k = input("Is it an Emausaurus? (yes/no) ")
  print()
  if k== "no":
   l = input("Did the cat lick it? (yes/no) ")
   print()
   if l== "no": 
    print("Decision: Eat it.")
   elif l== "yes":
    m = input("Is your cat healthy? (yes/no) ")
    print()
    if m== "yes":
     print("Decision: Eat it.")
    elif m== "no":
     print("Decision: Your call.")
  elif k== "yes":
   n = input("Are you a Megalosaurus? (yes/no) ")
   print()
   if n== "no": 
    print("Decision: Don't eat it.")
   elif n== "yes":
    print("Decision: Eat it.")
            
            
                    
                
                
                
            
        
                    
                    
                
                
                
    
    