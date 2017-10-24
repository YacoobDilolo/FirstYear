public class MonitoringStation{
//Instance variables
private String name;
private Collator[] phenomena;
//Constructors
public MonitoringStation(String name, String[] phenomenaNames)
{
      phenomena = new Collator[phenomenaNames.length];
      for (int i = 0;i<phenomena.length;i++){
               phenomena[i] = new Collator(phenomenaNames[i]);
      }    

   this.name = name;  
}
//Methods
public void recordReading(String phenomenonName, double reading)
// Update the records for the given phenomenon.
{
   
   for (int i = 0;i<phenomena.length;i++){
           if (phenomena[i].label().equals(phenomenonName)){
                phenomena[i].recordReading(reading);
             }  
 }
}
public double average(String phenomeonName){
// Get the current v
      double temp = 0;
      for (int i = 0;i<phenomena.length;i++){
           if (phenomena[i].label().equals(phenomeonName)){
               temp =  phenomena[i].average();
             }
  
      }
      return temp;
}
}