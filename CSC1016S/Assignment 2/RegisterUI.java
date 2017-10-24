import java.util.Scanner;
public class RegisterUI{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      CashRegister item = new CashRegister();
      int num_program = 0;
      double amount;
      System.out.println("Cash Register");
      System.out.printf("%s","Running total: ");
      System.out.printf("%s%.2f","R",item.runningTotal());
      System.out.println();
      while(num_program!=4){
         System.out.println("1. Ring up item.");
         System.out.println("2. Enter amount tendered. ");
         System.out.println("3. New transaction.");
         System.out.println("4. Quit");
         num_program = s.nextInt();
          if (num_program==1){
            System.out.println("Enter amount:"); 
            amount = s.nextDouble();
            item. recordItem(amount); 
            System.out.printf("%s","Running total: ");
            System.out.printf("%s%.2f","R",item.runningTotal());
            System.out.println(); 
         }else if(num_program==2){
            System.out.println("Enter amount:"); 
            amount = s.nextDouble();
            System.out.printf("%s","Running total: ");
            System.out.printf("%s%.2f","R",item.runningTotal());
            System.out.println();
            System.out.printf("%s","Amount tendered: ");
            System.out.printf("%s%.2f","R",amount);
            System.out.println();
            System.out.printf("%s","Change due: ");
            System.out.printf("%s%.2f","R",item.change(amount));
            System.out.println();
         }else if(num_program==3){
            System.out.printf("%s","Running total: ");
            System.out.printf("%s%.2f","R",item.initializeRunningTotal());
            System.out.println();
            item.initializeChange();
            }
         }
     }
 }