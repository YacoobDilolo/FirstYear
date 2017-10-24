public class Vector{
private double x,y;

   public Vector(double x,double y){
      this.x = x;this.y=y;
   }
   
   public String toString(){
      return "v = ("+String.format("%.2f",x)+", "+String.format("%.2f",y)+")";
   }
   public double getMagnitude(){
      return Math.sqrt(x*x+y*y);
   }
   
   public Vector flip(){
      return new Vector((-1)*x,(-1)*y);
   }
   public Vector add(Vector other){
      return new Vector (this.x+other.x,this.y+other.y);
   }
   public boolean equals(Object other){
      if (other ==null){
         return false;
      }else if (this.getClass()==other.getClass()){
      
         Vector p = (Vector)other;
         return (this.x==p.x&&this.y==p.y);
      }else{
         return false;
      }
   }
}