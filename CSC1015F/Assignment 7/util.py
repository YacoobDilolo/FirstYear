import copy
def create_grid(grid):
      i = 4
      while i>0:
            grid.insert(0,[0,0,0,0])
            i -=1
      return grid
"""create a 4x4 array of zeroes within grid"""
def print_grid(grid):
      t = "+" + 20*"-"  + "+\n"
      
      for i in range(len(grid)):
            t += "|"
            for k in range(len(grid[i])):
                  if grid[i][k]==0:
                        grid[i][k]=" "
                  #print("{0:<5}".format (grid[i][k]),end="")
                  t += "{0:<5}".format (grid[i][k])
            t += "|\n"
      t += "+" + 20*"-"  + "+\n"
            #print()
      print(t,end="")
"""print out a 4x4 grid in 5-width columns within a box"""
def check_lost (grid):
      d = 0
      n =0
      c = 0
      for i in range(len(grid)):
            for k in range(len(grid[i])):
                  if grid[i][k]==0:
                        n +=1
      #checks columns for equal adjacent values
      for i in range(len(grid)-1):
            for k in range(len(grid[i])-1): 
                  if grid[i][k]==grid[i+1][k]:
                        d +=1
      #checks rows for equal adjacent values
      for i in range(len(grid)-1):
            for k in range(len(grid[i])-1): 
                  if grid[i][k]==grid[i][k+1]:
                        c +=1
      if (d==0 and c==0) and n==0:
            return("True")
      else:
            return("False")
                  
"""return True if there are no 0 values and there are no
      adjacent values that are equal; otherwise False"""
def check_won (grid):
      d = 0
      n =0
      xList = []
      for i in range(len(grid)):
            xList +=grid[i]
      for k in range(len(xList)):
            if xList[k]>=32:
                  d +=1
      if d!=0:
            return("True")
      else:
            return("False")


      
      """return True if a value>=32 is found in the grid; otherwise
      False"""
def copy_grid (grid):
      return copy.deepcopy(grid)
      
      
      
"""return a copy of the given grid"""
def grid_equal (grid1, grid2):
      s = ""
      t = ""
      for i in range(len(grid1)):
            for k in range(len(grid1[i])):
                  s +=str(grid1[i][k])
      for i in range(len(grid2)):
            for k in range(len(grid2[i])):
                  t +=str(grid2[i][k])
      if s==t:
            return("True")
      else:
            return("False")
"""check if 2 grids are equal - return boolean value"""