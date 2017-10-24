public class Collator
{
  private int max;
  private int min;
  private int num_readings;
  private int sum;
//Constructors
   public  Collator(){
//Methods
   num_readings = 0;
            sum = 0;
            min = 0;
            max = 0;
             }
  public void recordReading(int reading){
               num_readings++;
                sum+=reading;
            if (num_readings == 1){
               min = reading;
               max = reading;
        } else if (reading < min){
               min = reading;
        } else if (reading > max){
               max = reading;
          }
  }
      public int maximum(){
            return max;        
     }
      public int minimum(){
            return min;
     }
      public int average(){
         return (int)Math.round(sum/(double)num_readings);
      }
      public int numberOfReadings(){
             return num_readings;
      }
}