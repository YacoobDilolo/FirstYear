import java.util.Scanner;
public class AccountTester{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter plan name:");
      String plan_Name = s.nextLine();
      System.out.println("Enter Call rate per second/cents:");
      double Callrate = s.nextDouble();
      Account account = new Account(plan_Name,Callrate);
      int operation =0;
      double amount = 0;
      double duration = 0;
      while(operation!=4){
            System.out.println("1. TopUp Account:");
            System.out.println("2. Dial a number:");
            System.out.println("3. Check Balance:");
            System.out.println("4. To Quit:");
            operation = s.nextInt();
            if (operation==1){
                System.out.println("Enter The Amount:");
                amount = s.nextDouble();
                account.TopUp(amount);
            }else if (operation==2){
               System.out.println("Enter The Duration:");
               duration = s.nextDouble();
               account.recordCall(duration);
            }else if (operation==3){
               System.out.printf("%s%.2f","The balance is ",account.getBalance());
               System.out.println();
            }
      }
   }
}          