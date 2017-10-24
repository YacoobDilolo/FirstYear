public class Rectangle extends VectorObject{
   private int length, width;
   Rectangle(int id,int x, int y,int leng,int width) {
   //Set your parameters
      super(id,x,y);
      this.length = leng;
      this.width = width;
   }//return id
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

       for ( int n = 0 ;n <(length); n++){
               for (int m =0;m <(width);m++){
                   matrix[y+n][x+m]='*';
               }
      }
 }
}