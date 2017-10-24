public class Currency{
private String symbol;
private String code;
private int minorPerMajor;
public Currency(String symbol, String code, int minorPerMajor){
   this.code = code;
   this.minorPerMajor = minorPerMajor;
   this.symbol = symbol;
  }
public String symbol(){
   return symbol;
   }
public String code(){
   return code;
 }
public int minorPerMajor(){
   return minorPerMajor;
   }
public String format(long amount){
   return (symbol+String.format("%.2f",(amount/(double)minorPerMajor)));
   }
public long parse(String amount){
   double m =(Double.parseDouble(amount.substring(1,amount.length())));
   long x = (long)(m*minorPerMajor);
   return x;
   }
}