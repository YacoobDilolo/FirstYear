
/**
 * Write a description of class TestCollator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
//
public class TestCollator
{
    private TestCollator() {}
    
    public static void main(final String[] args) {
        System.out.println("Creating collator");
        final Collator collator = new Collator();
 
        final Scanner input = new Scanner(System.in);
        System.out.println("How many readings?");
        final int num_readings = input.nextInt();
        
        for (int i=1; i<=num_readings; i++) {
            System.out.println("Enter reading no. "+i+":");
            final int reading = input.nextInt();
            collator.recordReading(reading);
        }

        System.out.println("numberOfReadings(): "+collator.numberOfReadings());
        if (num_readings>0) {
            System.out.printf("maximum(): %d\n", collator.maximum());
            System.out.printf("minimum(): %d\n", collator.minimum());
            System.out.printf("average(): %d\n", collator.average());
        }            
    }
}
