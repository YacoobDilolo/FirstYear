
/**
 * A Collator object stores statistics on a series 
 * of readings, specifically, the number, maximum, minimum, and average.
 * A Collator has a label, usually the name of the phenomenon that the readings
 * represent e.g. temperature, pressure.
 * 
 * @author Stephan Jamieson
 * @version 31/7/15
 */
public class Collator {

    private final String label;
    private int numReadings;
    private double average;
    private double maximum;
    private double minimum;

    public Collator(final String label) {
        this.numReadings = 0;
        this.label = label;
    }

    public String label() { return label; }
    
    public void recordReading(final double reading) {
        if (numReadings<1) {
            // This must be the first reading
            this.average = reading;
            this.maximum = reading;
            this.minimum = reading;
            this.numReadings = 1;
        }
        else {
            // Calculate the current total
            double total;
            total = this.average*this.numReadings;
    
            // Calculate the new total and update the number of readings
            total = total+reading;
            this.numReadings++;

            // Calculate the new average
            this.average = total/this.numReadings;

            // Check for a new maximum
            if (reading>this.maximum) {
                this.maximum = reading;
            }

            // Check for a new minimum
            if (reading<this.minimum) {
                this.minimum = reading;
            }
        } 
    }
   
    public double maximum() {
        assert this.numReadings>0 : "Collator:maximum(): number of readings is zero.";
        return this.maximum;
    }

    public double minimum() {
        assert this.numReadings>0 : "Collator:minimum(): number of readings is zero.";
        return this.minimum;
    }
    
    public double average() {
        assert this.numReadings>0 : "Collator:average(): number of readings is zero.";
        return this.average;
    }
    
    public int numberOfReadings() { return this.numReadings; } 

}

