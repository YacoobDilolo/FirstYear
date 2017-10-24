import java.util.*;

public class Question1{
   
 public static void main(String[] args){
   Queue queue = new LinkedList<String>();
   Scanner s = new Scanner(System.in);
   String inputs =s.nextLine(); 
   while(!inputs.equals("X")){
     if (inputs.equals("O")){
       if(queue.isEmpty()){
         System.out.println("Buffer empty");
       }else{
         System.out.println("Data: " + queue.remove());
       }
   }else{
      queue.add(inputs);
     } 
   inputs =s.nextLine(); 
  }
 } 
}