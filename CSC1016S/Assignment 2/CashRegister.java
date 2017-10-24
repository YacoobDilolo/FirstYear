public class CashRegister{
  private double sum;
  private double change;
 
//Constructors
 public  CashRegister(){
            sum = 0;
            change = 0;
             }
 //Methods
 public void recordItem(double item){
         sum +=item; 
  }
 public double change(double amount){
      change = amount;
      change -=sum;
      return change;
 }
 public double runningTotal(){
      return (sum);
      }
 public double initializeRunningTotal(){
   sum = 0;
   return sum;
 }
  public double initializeChange(){
   change = 0;
   return change;
   }
 }