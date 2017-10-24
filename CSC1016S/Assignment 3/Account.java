public class Account { 
    private double balance;
    private String plan;
    private double rate;
    Plan p = new Plan();
    public Account(String plan_Name,double CallRate) {
        this.balance = 0;
        plan = plan_Name;
        rate = CallRate;
        p.getCallRate(rate);
        
    }
    
    public void recordCall(double duration){
      if(balance>=CheckCost(duration)){
         System.out.println("Calling.....");
         balance -=CheckCost(duration);
      }else{
         System.out.println("Not enough funds");
      }
      
    }
    public void TopUp(double amount){
      balance +=amount;
    }
    public double CheckCost(double duration){
     p.Calculation(duration);
     return p.totalCost();
    }
    public double getBalance(){
      return balance;
     }
}