public class Colour{
   private int red,green,blue;
   
   public Colour(int red, int green ,int blue){
      this.red=red;this.green=green;this.blue=blue;
   }
   
   public String toString(){
      return "(r="+red+", g="+green+", b="+blue+")";
   }
   public int getRed(){
      return red;
   }
   
   public int getGreen(){
      return green;
   }
   
  public int getBlue(){
      return blue;
   }
   
 public Colour invert(){
    return new Colour((255-red),(255-green),(255-blue));
 }
 
 public Colour add(Colour other){
   return new Colour(Math.min(this.red+other.red,255),Math.min(this.green+other.green,255),Math.min(this.blue+other.blue,255));
 }
 
 public boolean equals(Object other){
   Colour another = (Colour)other;
   if (another==this){
      return true;
      }
    return false;
 }
}
