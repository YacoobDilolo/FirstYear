# program to guess a secret number
# Yacoob Legong
# 27 february 2015
# variables to store width and height
width_1 = 0
height_1 = 0
width_2 = 0
height_2 = 0
width_1 = eval(input("Enter width 1: ")) # Enter width 1
height_1 = eval(input("Enter height 1: ")) #  Enter height 1
width_2 = eval(input("Enter width 2: ")) #  Enter width 2
height_2 = eval(input("Enter height 2: ")) #  Enter height 2
price_per_metre = eval(input("Enter price per metre: ")) #  Enter width 2
the_total_fence_required = (width_1*2)+height_1+(height_1-height_2)+(width_2*2)+height_2
# calculate the total fence required and stores it
print ("The total fence required =",the_total_fence_required,"metres") 
the_total_price = the_total_fence_required*price_per_metre
print ("The total price = R",the_total_price)
