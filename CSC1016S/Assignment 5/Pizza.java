public class Pizza extends Menu{
   private String base;
   private String extra_cheese;
   public String extra_garlic; 
  
  public Pizza(String item_number, String size, String base, String extra_cheese,String extra_garlic){
   super(item_number,size);
   this.base = base;
   this.extra_cheese = extra_cheese;
   this.extra_garlic = extra_garlic;
   }
  public String getItem_Number(){
    return item_number;
  }
  public String toString(){
    return "Pizza: "+ super.toString()+", "+base+", "+extra_cheese+", "+extra_garlic;
  }
}
 
 