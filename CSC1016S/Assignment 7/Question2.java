import java.util.ArrayList;
import java.util.Scanner ;
public class Question2 {
   static ArrayList<String> sounds = new  ArrayList<String>();
   private static int getSelection(Scanner scanner) {
        System.out.println("What animal do you see? (1) Cat (2) Dog (3) Cow (4) quit:");
      return scanner.nextInt();
   }
   public static void main(String[] args){
         Scanner s = new Scanner(System.in);
         int option = getSelection(s) ;
         while(option!=4){
                  if (option==1){
                     Cat cat = new Cat();
                     sounds.add(cat.makeNoise());
                   }else if(option==2){
                     Dog dog= new Dog();
                     sounds.add(dog.makeNoise());
                   }else if(option==3){
                     Cow cow = new Cow();
                     sounds.add(cow.makeNoise());
                   }
                   option = getSelection(s) ;
   
         }
         for (String x:sounds){
                 System.out.println(x);
           } 
       }
 }  
