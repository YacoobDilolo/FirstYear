
/**
 * Simple Test Program for MonitoringStation
 * 
 * @author Stephan Jamieson
 * @version 31/7/15
 */
import java.util.Scanner;
//
public class StationUI {

    private StationUI() {}
    
    
    public static void main(final String[] args) {
        System.out.println("Monitoring Station Test Harness");
        final Scanner scanner = new Scanner(System.in);
     
        System.out.println("Enter the station name:");
        final String stationName = scanner.nextLine().trim();
        
        System.out.println("Enter a comma separated list of the phenomena to be recorded:");
        final String[] phenomena = scanner.nextLine().split("\\s*,\\s*");

        final MonitoringStation station = new MonitoringStation(stationName, phenomena);
        
        System.out.println("\nMake a selection and press return:");
        System.out.println("0.	Quit");
        System.out.println("1.	Record a phenomenon measurement.");
        System.out.println("2.	View the average reading for a phenomeon.");
        
        int selection = scanner.nextInt();
        
        while (selection!=0) {
            if (selection==1) {
                System.out.println("Enter the phenomenon name and value (e.g. 'temperature 7'):");
                if (scanner.hasNext()) {
                    final String phenomenon = scanner.next();
                    if (scanner.hasNextDouble()) {
                        final double reading = scanner.nextDouble();
                        station.recordReading(phenomenon, reading);
                    }
                    else {
                        System.out.println("Couldn't process phenomenon reading. Something wrong?");
                    }
                }
                else {
                    System.out.println("Couldn't process phenomeon name. Something wrong?");
                }                
            }
            else if (selection==2) {
                System.out.println("Enter the phenomenon name:");
                if (scanner.hasNext()) {
                    final String phenomenon = scanner.next();
                    System.out.printf("The average value for phenomeon %s is %.2f.\n", phenomenon , station.average(phenomenon));                }
                else {
                    System.out.println("Couldn't process phenomeon name. Something wrong?");
                }                
                
            }
            else {
                System.out.println("That selection was not recognised.");
            }

            System.out.println("\nMake a selection and press return:");
            System.out.println("0.	Quit");
            System.out.println("1.	Record a phenomenon measurement.");
            System.out.println("2.	View the average reading for a phenomeon.");
            
            selection = scanner.nextInt();
        }
        
        scanner.close();
    }

}
