import java.util.Scanner;
import java.util.ArrayList;
public class Question2{
   public static void main(String[] args){
   ArrayList<Menu> menu = new ArrayList<Menu>();
   Scanner s = new Scanner(System.in);
   Menu menus= new Menu("0","0"); 
   System.out.println("Welcome to Great International Food Court");
   String  menus_Selection = "";
   while (!menus_Selection.equalsIgnoreCase("Q")){
     System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
      menus_Selection =  s.nextLine();
      if (menus_Selection.equals("P")||menus_Selection.equals("p")){
         System.out.println("Enter the menu item number");
         String item_number = s.nextLine();
         System.out.println("Enter the size");
         String size = s.nextLine();         
         System.out.println("Enter the base");
         String base = s.nextLine();
         System.out.println("Enter extra cheese");
         String extra_cheese = s.nextLine();
         System.out.println("Enter extra garlic");
         String extra_garlic = s.nextLine();
         Pizza pizza = new Pizza(item_number,size, base, extra_cheese,extra_garlic);
         menu.add(pizza);
          System.out.println("Done");
      }else if(menus_Selection.equals("C")||menus_Selection.equals("c")){
            System.out.println("Enter the menu item number");
            String item_number = s.nextLine();
            System.out.println("Enter the size");
            String size = s.nextLine();
            System.out.println("Enter the curry type");
            String curry_type = s.nextLine();
            Curry curry = new Curry(item_number,size,curry_type);
            menu.add(curry);
            System.out.println("Done");
      }else if(menus_Selection.equals("S")||menus_Selection.equals("s")){
            System.out.println("Enter the menu item number");
            String item_number = s.nextLine();
            System.out.println("Enter the size");
             String size = s.nextLine();
         System.out.println("Enter the flavour");
         String flavour = s.nextLine();
         System.out.println("Enter whether it is a bottle or can");
         String bottle_or_can = s.nextLine();
         SoftDrink softdrinks = new SoftDrink(item_number,size,flavour,bottle_or_can);
         menu.add(softdrinks);
         System.out.println("Done");
     }else if(menus_Selection.equals("D")||menus_Selection.equals("d")){
             System.out.println("Enter the menu item number");
    String item_number = s.nextLine();
          boolean visible=false;
         for(Menu x: menu){
            if(x.getItem_Number().equalsIgnoreCase(item_number)){
               menu.remove(x);
                  visible=true;
               break;
            }
         }
         if(!visible){
         System.out.println("Not found");
         }else{ System.out.println("Done");}
    }
     else if(menus_Selection.equals("l")||menus_Selection.equals("L")){
        for(Menu x: menu){
             System.out.println(x.toString());
      }
      System.out.println("Done");
     }
   }
 }
}