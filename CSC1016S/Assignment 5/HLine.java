public class HLine extends VectorObject{
   private int x_length;
   public HLine(int id ,int x, int y,int x_length) {
   //Set your parameters
      super(id ,x,y);
      this.x_length = x_length;
    }
    //return id
  public int getId (){
      return id;
      }
  public  void setNewCoords ( int newx, int newy )
   //set new cordinates for moving the object
   {
      x = newx;
      y = newy;
   }
  public  void draw ( char [][] matrix ){
  //set cordinates and make index equal *
       for ( int n = 0 ;n <(x_length); n++){
            matrix[y][x+n]='*';
       }
   }
 }