import java.util.Scanner;
public class Test1B{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the value of x:");
      double x = input.nextDouble();
      System.out.println("Enter the value of y:");
      double y = input.nextDouble();
      double z = x*x+2*x*y+y*y;
      System.out.printf("%s%.2f","The answer is ",z);
      System.out.println();
   }
}