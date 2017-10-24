public class Plane extends Vehicle {
   private String manufacturer;
   private int model;
   
   public Plane(String colour,int passengers,String manufacturer,int model){
      super(passengers,colour);
      this.manufacturer = manufacturer;
      this.model = model;
      }
   
   public String toString() {
     return super.toString()+" "+manufacturer+" "+model;
     }
}