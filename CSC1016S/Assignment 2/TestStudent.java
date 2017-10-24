import java.util.Scanner;
public class TestStudent{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first name:");
      String first = s.nextLine();
      System.out.println("Enter middle name:");
      String middle = s.nextLine();
      System.out.println("Enter last name:");
      String last = s.nextLine();
      Student you;
      you = new Student();
      you.setNames(first, middle, last);
      //Print out
      System.out.println("The full name is: "+you.getFullName());      
  }
}