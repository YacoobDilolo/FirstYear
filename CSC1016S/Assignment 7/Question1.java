import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner ;
public class Question1 {
   static ArrayList<SoftDrink> drinks = new  ArrayList<SoftDrink>();
   private static int getSelection(Scanner scanner) {
        System.out.println("Enter option: (1) add soft drink (2) quit:");
      return scanner.nextInt();
   }
   private static SoftDrink makeSoftDrink(Scanner scanner) {
        System.out.println("Enter name, colour and volume in ml separated by space");
        return new SoftDrink(scanner.next(),scanner.next(),scanner.nextInt());
    }
   public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int option = getSelection(s) ;
         while(option!=2){
                  if (option==1){
                     SoftDrink nw = makeSoftDrink(s);
                     drinks.add(nw);
                   }
                  option = getSelection(s) ;
   
         }
          Collections.sort(drinks);
         for (SoftDrink x:drinks){
                 System.out.println(x);
           } 

   }  
                   
}