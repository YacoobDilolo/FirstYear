
/**
 * Write a description of class TestCounterDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
//
public class TestCounterDisplay {

    private TestCounterDisplay() {}
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose from the following options:");
        System.out.println("0. quit.");
        System.out.println("1. new CounterDisplay(limit).");
        System.out.println("2. getValue().");
        System.out.println("3. setValue(value).");
        System.out.println("4. increment().");
        System.out.println("5. getDisplayValue().");
        
        CounterDisplay counterDisplay=null;
        
        int selection = scanner.nextInt();
        while  (selection!=0) {
            if (selection==1 || selection==3) {
                System.out.println("Enter value:");
                int value = scanner.nextInt();
                if (selection==1){
                    counterDisplay = new CounterDisplay(value);
                }
                else{
                    counterDisplay.setValue(value);
                }
            }
            else if (selection==2) {
                System.out.println("The current value is "+counterDisplay.getValue());
            }
            else if (selection==4) {
                System.out.println("Incrementing CounterDisplay.");
                counterDisplay.increment();
            }
            else if (selection==5) {
                System.out.println(counterDisplay.getDisplayValue());
            }
            else {
                System.out.println("That selection was not recognised.");
            }
            
            System.out.println("Choose from the following options:");
            System.out.println("0. quit.");
            System.out.println("1. new CounterDisplay(limit).");
            System.out.println("2. getValue().");
            System.out.println("3. setValue(value).");
            System.out.println("4. increment().");
            System.out.println("5. getDisplayValue().");
                        
            selection = scanner.nextInt();
        }    
    }


}
