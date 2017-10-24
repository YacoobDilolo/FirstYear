public class SoftDrink extends Menu{
   private String flavour;
   private String bottle_or_can;
  
  public SoftDrink(String item_number, String size, String flavour, String bottle_or_can){
   super(item_number,size);
   this.flavour = flavour;
   this.bottle_or_can = bottle_or_can;
   }
  public String getItem_Number(){
    return item_number;
  }
  public String toString(){
    return "Soft Drink: "+ super.toString()+", "+flavour+", "+bottle_or_can;
  }
}