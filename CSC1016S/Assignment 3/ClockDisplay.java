public class ClockDisplay{
/*A ClockDisplay object is a holder for the current time in hours and minutes. It provides methods for
advancing the current time and for obtaining the value as a formatted string.
Instance variables*/
private CounterDisplay hours;
private CounterDisplay minutes;
//Constructors
public ClockDisplay(int pHours, int pMinutes){
// Create a new ClockDisplay and set the display value to pHours and pMinutes.
      hours = new CounterDisplay(24);
      minutes = new CounterDisplay(60);
      hours.setValue(pHours);
      minutes.setValue(pMinutes);
      }
//Methods
public void setTime(int pHours, int pMinutes){
// Set the display value to pHours and pMinutes.
        hours.setValue(pHours);
      minutes.setValue(pMinutes);  
}
public void tick(){
// Advance the display time by one minute.
    if (minutes.getValue()==59){    
            hours.increment();
      }
    minutes.increment();
}
public String getDisplayValue(){
// Obtain the display value; a String composed of 2 digits for hours then a colon, then 2 digits for minutes
   return (hours.getDisplayValue()+":"+minutes.getDisplayValue());
}
}