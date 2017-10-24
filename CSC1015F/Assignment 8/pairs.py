y = 0
c = 0
def Recpairs(string):
      x = 0
      global y
      global c
      if len(string)==1 or len(string)==0:
            return c
      else:
            if string[x]==string[x+1]:
                  y += 1
                  if y==1:
                        c += 1
                        y = 0
                        return(Recpairs(string[2:]))
            else:     
                  return(Recpairs(string[1:]))
def main():
      string = input("Enter a message:\n")
      a = string.split(" ")
      string = ' '.join(a)
      print("Number of pairs:",Recpairs(string))
if __name__ =='__main__':
      main()  
                      
  