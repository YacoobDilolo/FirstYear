# writing a program to test validity of time 
# Yacoob Legong
# 06 March 2015
# Variables to store users inputs
hours = eval(input("Enter the hours: ")) 
minutes = eval(input("Enter the minutes: ")) 
seconds = eval(input("Enter the seconds: ")) 
# check for validity
if (hours >= 0 and hours <= 23 and minutes >= 0 and minutes <= 59 and seconds >= 0 and seconds <= 59):
    print("Your time is valid.")
else: print("Your time is invalid.")




