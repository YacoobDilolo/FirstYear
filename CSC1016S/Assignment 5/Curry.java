public class Curry extends Menu{
   private String curry_type;
  
  public Curry(String item_number, String size, String curry_type){
   super(item_number,size);
   this.curry_type = curry_type;
   }
  public String getItem_Number(){
    return item_number;
  }
  public String toString(){
    return "Curry: "+ super.toString()+", "+curry_type;
  }
}