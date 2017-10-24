import java.util.Scanner;
public class ImperialMetric{
   public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the minimum number of feet (not less than 0):");
   int min_feet = s.nextInt();
   System.out.println("Enter the maximum number of feet (not more than 30):");
   int max_feet = s.nextInt();
   int imaginary_inches = 0;
   System.out.print("   "+"|");
   while(imaginary_inches<=11){
      System.out.printf("%5d%s",imaginary_inches,"\"");
      imaginary_inches++;
      
   }   
   System.out.println();
   int feet= min_feet;
   int inches = 0;
   while(feet<=max_feet){
         if (feet<10){
            System.out.print(feet+"'"+" "+"|");
         }else{
            System.out.print(feet+"'"+"|");
         } 
         while(inches<=11){
               
               double metres = (feet*12+inches)*0.0254;
               System.out.printf("%6.3f",metres);
               inches++;
         }
         System.out.println();
         inches = 0;
         feet++;
   }
   }

}