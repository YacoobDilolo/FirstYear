public class VLine extends VectorObject{
   private int y_length;
   public VLine(int id ,int x, int y,int y_length) {
   //Set your parameters
      super(id, x,y);
      this.y_length = y_length;
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
       for ( int n = 0 ;n <(y_length); n++){
             matrix[y+n][x]='*';
       }
   }      
}