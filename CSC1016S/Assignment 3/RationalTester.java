public class RationalTester{
   public static void main(String[] args){
      Rational r1 = new Rational(1, 4);
      Rational r2 = new Rational(1, 8);
      Rational r3 = r1.add(r2);
      Rational r4 = r1.multiply(r2);
      System.out.println(r3);
      System.out.println(r4);
   }
}