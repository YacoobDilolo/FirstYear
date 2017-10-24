public class CounterDisplay{
/*A CounterDisplay object is a counter that cycles over a fixed range. It contains a current value and an upper
limit, and it provides methods for setting the current value, advancing it, examining it, and obtaining it in
the form of a 2 digit String.
Instance variables*/
private int value;
private int limit;
//Constructors
public CounterDisplay(int pLimit){
   value = 0;
   limit = pLimit;
// Create a new CounterDisplay, set counter value to 0, and set the limit to pLimit.
}
//Methods
public void setValue(int pValue){
// Set the current counter value to pValue.
   value = pValue;
}
public int getValue(){
// Get the current value.
    return value;
   }
public void increment(){
// Advance the counter by 1, rolling over to 0 if the limit is reached.
   value++;
   if (limit<=value){
      value = 0;
   }
}
public String getDisplayValue(){
// Obtain the display value i.e. the current counter value in the form of a 2 digit string
      String tempString=""; 
      if(value<=9){
            tempString= "0"+value;
      }else{
         tempString = Integer.toString(value);   
      }
      return tempString;
   }
}