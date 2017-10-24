import java.util.Scanner;
public class Meteorology
{
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      Collator temperature_reading = new Collator();
      Collator pressure_reading = new Collator();
      Collator humidity_reading = new Collator();
      int num_program = 0;
      int value;
      System.out.println("Meteorology Program");
      while(num_program!=7){
         System.out.println("Make a selection and press return:");
         System.out.println("1. Record a temperature reading. ");
         System.out.println("2. Record a pressure reading.");
         System.out.println("3. Record a humidity reading.");
         System.out.println("4. Print maximum values.");
         System.out.println("5. Print minimum values.");
         System.out.println("6. Print average values.");
         System.out.println("7. Quit");
         num_program = s.nextInt();
         if (num_program==1){
            System.out.println("Enter value:"); 
            value = s.nextInt();
            temperature_reading.recordReading(value);  
         }else if(num_program==2){
            System.out.println("Enter value:"); 
            value = s.nextInt();
            pressure_reading.recordReading(value);
         }else if(num_program==3){
            System.out.println("Enter value:"); 
            value = s.nextInt();
            humidity_reading.recordReading(value);
         }else if(num_program==4){
             if (temperature_reading.maximum()>0){
               System.out.println("Maximum temperature: "+temperature_reading.maximum());
             }else if (temperature_reading.maximum()==0){
               System.out.println("Maximum temperature: "+"-");
             }
              if (pressure_reading.maximum()>0){
               System.out.println("Maximum pressure: "+pressure_reading.maximum()); 
             }else if (pressure_reading.maximum()==0){
               System.out.println("Maximum pressure: "+"-");
             }if(humidity_reading.maximum()>0){
               System.out.println("Maximum humidity: "+humidity_reading.maximum()); 
             }else if (humidity_reading.maximum()==0){
               System.out.println("Maximum humidity: "+"-");
             }          
          }else if(num_program==5){
             if (temperature_reading.minimum()>0){
               System.out.println("Minimum temperature: "+temperature_reading.minimum());
             }else if (temperature_reading.minimum()==0){
               System.out.println("Minimum temperature: "+"-");
             }if (pressure_reading.minimum()>0){
               System.out.println("Minimum pressure: "+pressure_reading.minimum()); 
             }else if (pressure_reading.minimum()==0){
               System.out.println("Minimum pressure: "+"-");
             }if(humidity_reading.minimum()>0){
               System.out.println("Minimum humidity: "+humidity_reading.minimum()); 
             }else if (humidity_reading.minimum()==0){
               System.out.println("Minimum humidity: "+"-");
             }
          } else if(num_program==6){
               if (temperature_reading.numberOfReadings()>0){
                     if (temperature_reading.average()>0){
                        System.out.println("Average temperature: "+temperature_reading.average());
                       }
               }else if (temperature_reading.numberOfReadings()==0){
                  System.out.println("Average temperature: "+"-");
               }if (pressure_reading.numberOfReadings()>0){
                     if (pressure_reading.average()>0){
                        System.out.println("Average pressure: "+pressure_reading.average());
                        }
               }else if (pressure_reading.numberOfReadings()==0){
                  System.out.println("Average pressure: "+"-");
               }if (humidity_reading.numberOfReadings()>0){
                     if (humidity_reading.average()>0){
                         System.out.println("Average humidity: "+humidity_reading.average());
                         }
               }else if (humidity_reading.numberOfReadings()==0){
                  System.out.println("Average humidity: "+"-");
                  }
               }
         }
       }
  }