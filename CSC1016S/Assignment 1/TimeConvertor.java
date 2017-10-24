import java.util.Scanner;
public class TimeConvertor{
   public static void main (String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a time ([h]h:mm [am|pm]):");
      String time = s.nextLine();
      int index_colon = time.indexOf(":");
      String time_cut = time.substring(time.length()-1,time.length());
      String time_cut2 = time.substring(time.length()-2,time.length());
      String time_cut3 = time.substring(0,index_colon);
      String time_cut4 = time.substring(index_colon,5);
      int timeInt = Integer.parseInt(time_cut3);
      //System.out.println(time_cut3);
      if (time_cut.equals("m"))
      {
         if (timeInt==12 & time_cut2.equals("am")){
            timeInt -=12;
            Integer.toString(timeInt);
            System.out.println("0"+timeInt+time_cut4);
         }else if (timeInt==12 & time_cut2.equals("pm")){
            System.out.println(time.substring(0,time.length()-2));
         }else if (time_cut2.equals("am")){
            System.out.println("0"+time.substring(0,time.length()-3));
            
         }else if (time_cut2.equals("pm")){
            timeInt +=12 ;
            Integer.toString(timeInt); 
            System.out.println(timeInt+time_cut4);
      

         }
      }else{
         if (timeInt==00){
            timeInt +=12 ;
            Integer.toString(timeInt); 
            System.out.println(timeInt+time_cut4+" "+"am");
      
         }else if (timeInt==12){
            System.out.println(time+" "+"pm");
         }else if (timeInt>12){
            timeInt -=12;
            Integer.toString(timeInt); 
            System.out.println(timeInt+time_cut4+" "+"pm");

         }else if (timeInt<12){ 
             System.out.println(time.substring(1,time.length())+" "+"am");
         }
      }
   }
}