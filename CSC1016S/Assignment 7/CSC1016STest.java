import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CSC1016STest {  
   
     CSC1016S test = new CSC1016S();
    @Test public void testgetSetName(){
       test.setName ("Yacoob");
       assertEquals(test.getName(),"Yacoob");
   }

   @Test public void testAllMarksZero(){
       test.setMark ("pracs",0);
       test.setMark ("practests",0);
       test.setMark ("tests",0);
       test.setMark ("exam",0);
       assertEquals(0.0F,test.getFinal(),0.00);
   }
   
    @Test public void testAllMarksHundred(){
       test.setMark ("pracs",100);
       test.setMark ("practests",100);
       test.setMark ("tests",100);
       test.setMark ("exam",100);
       assertEquals(100.0F,test.getFinal(),0.00);
   }
   
   @Test public void testAllMarksBetweenZeroToHundred(){
       test.setMark ("pracs",85);
       test.setMark ("practests",100);
       test.setMark ("tests",80);
       test.setMark ("exam",80);
       assertEquals(82.75,test.getFinal(),0.00);
   }
}
