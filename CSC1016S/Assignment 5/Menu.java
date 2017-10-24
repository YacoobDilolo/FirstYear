import java.util.Scanner;
public class Menu{
   public String item_number;
   private String size;
   public Scanner s = new Scanner(System.in);
    
   public Menu( String itemNumber, String Size){
      this.item_number = itemNumber; 
      this.size = Size;
   }
   public String getItem_Number(){
    return item_number;
   }
   public String toString(){
    return item_number+", "+size;
   }
    
}