public class Plan{
   private double totalCost;
   private double CallRate;
    
   public Plan(){
      this.totalCost = 0;
      this.CallRate = 0;
      
   }
   
   public void Calculation(double duration){
      totalCost = CallRate*duration;
      
   }
   public double totalCost(){
      return totalCost;
   }
   public double getCallRate(double CallRate){
      this.CallRate=CallRate;
      return CallRate;
   }
}
 
