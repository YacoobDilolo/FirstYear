
/**
 * Simple representation of a rational number.
 * 
 * @author Stephan Jamieson
 * @version 31/7/15
 */
public class Rational {

    private int numerator;
    private int denominator;

    /* Operations */
    
    
    public Rational add(Rational other) {
       if (denominator==other.denominator){
         //  this.numerator= numerator + other.numerator;
           //this.denominator = denominator;
           return new Rational(this.numerator + other.numerator,this.denominator);
       }else{
          //this.numerator = numerator * other.denominator + denominator * other.numerator;
          //this.denominator = denominator * other.denominator;
          return new Rational(this.numerator * other.denominator + this.denominator * other.numerator,this.denominator*other.denominator);
    
    }
        // Your code here.
    
    }              
    
   public Rational multiply(Rational other) {
           //numerator = numerator*other.numerator;
           //denominator = denominator*other.denominator;
           return new Rational( numerator*other.numerator,denominator*other.denominator);
        // Your code here.
    }
    
    /* Accessor methods */
    
    public int numerator() { return numerator; }
    public int denominator() { return denominator; }

    /*  Constructors and helper methods. */
    
    public Rational(final String value) {
        String[] values = value.split("/");
        if (values.length!=2
            || !values[0].matches("\\s*[1-9][0-9]*\\s*")
            || !values[1].matches("\\s*[1-9][0-9]*\\s*") ) { 
                throw new IllegalArgumentException("Rational("+value+"): malformed expression."); 
        } 
        else {
            numerator = Integer.parseInt(values[0]);
            denominator = Integer.parseInt(values[1]);
            this.simplify();
        }
    }
    
    public Rational(final int numerator, final int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    private void simplify() {
        if (this.denominator<0) {
            // Ensure that denominator value is always positive 
            // and that sign is represented by the numerator. 
            this.numerator = this.numerator*-1;
            this.denominator = this.denominator*-1;
        }
        // Find the greatest common denominator and divide.
        int a = Math.abs(numerator), b = Math.abs(denominator);
        while (a!=b) { 
            if (a>b) {  a=a-b; } else { b=b-a; } 
        }
        this.numerator = this.numerator/a;
        this.denominator = this.denominator/b;
    }
    
    public String toString() {
        return numerator+"/"+denominator;
    }
}
