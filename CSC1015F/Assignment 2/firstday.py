# The first day in the range of years 
# Yacoob Legong
# 09 March 2015
first_year = eval(input("Enter the first year: "))
second_year = eval(input("Enter the second year: "))
for Year in range (first_year,second_year+1):
    day = 1
    day = day + 5*((Year-1)%(4))
    day = day + 4*((Year-1)%(100))
    day = day + 6*((Year-1)%(400))
    day = ((day)%(7))
    if day==0:
        day = "Sunday."
    elif day==1:
        day= "Monday."
    elif day==2:
        day = "Tuesday."
    elif day==3:
        day = "Wednesday."
    elif day==4:
        day= "Thursday."
    elif day==5:
        day = "Friday."
    elif day==6:
        day = "Saturday."
    print("The 1st of January",Year,"falls on a",day)
    