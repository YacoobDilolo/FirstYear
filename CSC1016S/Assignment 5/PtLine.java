public class PtLine extends VectorObject{
   private int x1,y1;
   public PtLine(int id,int x, int y, int x1, int y1 ) {
   //Set your parameters
      super(id,x,y);
      this.x1 = x1;
      this.y1 = y1;
   }
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
  //set equation of the line and the approximated points *
      int dx=x1-x;
      int dy=y1-y;
      if (dx>0&dy<0){
        int D = 2*dy - dx;
        matrix[y][x]='*';
        int y0=y;
        for (int x0=(x+1); x0<(x1+1);x0++){
          if (D > 0){
            matrix[y0][x0]='*';
            D = D + (2*dy-2*dx);
            }else{
            y0 = y0-1;
            matrix[y0][x0]='*';
            D = D + (2*dy);
            }
        }
      
      
      }
     else if (((dx>0)&(dy>0))||((dx/(double)dy)>0)){
      int D = 2*dy - dx;
        matrix[y][x]='*';
        int y0=y;
      
        for (int x0=x+1; x0<(x1+1);x0++){
          if (D > 0){
            y0 = y0+1;
            matrix[y0][x0]='*';
            D = D + (2*dy-2*dx);
            }else{
            matrix[y0][x0]='*';
            D = D + (2*dy);
            }
        }
    }else if((dx/(double)dy)<0){
        int D = 2*dy - dx;
        matrix[y1][x1]='*';
        int y0=y1;
      
        for (int x0=x1+1; x0<(x+1);x0++){
          if (D > 0){
            y0 = y0-1;
            matrix[y0][x0]='*';
            D = D + (2*dy-2*dx);
            }else{
            matrix[y0][x0]='*';
            D = D + (2*dy);
            }
        }
    
    }else if((dx==0) &(dy>0)){
        for (int y0=y; y0<(y1+1);y0++){
            matrix[y0][x]='*';
            }
     }else if((dy==0) &(dx>0)){
        for (int x0=x; x0<(x1+1);x0++){
            matrix[y][x0]='*';
            }
     }else if((dx==0) &(dy<0)){
        for (int y0=y1; y0<(y+1);y0++){
            matrix[y0][x]='*';
            }
     }else if((dy==0) &(dx<0)){
        for (int x0=x1; x0<(x+1);x0++){
            matrix[y][x0]='*';
            }
     }else if((dx==0) &(dy==0)){
            matrix[y][x]='*';
      }
   }
}  
  