import java.util.Scanner;
public class PalinPerfect{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the starting point N:");
      int min_point = s.nextInt();
      System.out.println("Enter the ending point M:");
      int max_point = s.nextInt();
      int reversedInt = 0;
      int div;
      float squared_num;
      System.out.println("The palindromic perfect squares are as follows:");
      for(int i = min_point+1;i<=max_point; i++) {
         div = i;
         while (div != 0) {
            reversedInt = reversedInt * 10 + div% 10;
            div = div / 10;
         }
         squared_num = (float)Math.sqrt(i);
         if (i==reversedInt){
            if ((float)(squared_num%1)==0){
               System.out.println(i);
            } 
         }
         reversedInt = 0;
      }
   }
}
   
   
   
   
