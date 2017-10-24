import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class SimpleLinkedListTest {
   
         /*private int expected,index;
   
      public SimpleLinkedListTest(int expected,int index){
         this.expected= expected;this.index=index;
        }
      
      
      @Parameters
      public static Collection<Integer[]> getValues() {
   		return Arrays.asList(new Integer[][] { {1,0 }, {2,1},
   				{ 3,2}, {4,3},{5,4} });
      }*/
      @Test public void testLinkedListContainsItems(){
         SimpleLinkedList test = new SimpleLinkedList(new Integer[] {1,2,3,4,5});
            assertTrue(1==(int)test.get(0)&2==(int)test.get(1)&3==(int)test.get(2)&4==(int)test.get(3)&5==(int)test.get(4));
         } 
      
    @Test public void testIndexOf(){
      SimpleLinkedList test1 = new SimpleLinkedList(new Integer[] {8,6,3,4,8,15,55,100,88,70,50});
       assertEquals(6,test1.indexOf(55));
      }
      
      
   @Test public void testInsert(){
      SimpleLinkedList test3 = new SimpleLinkedList(new Integer[] {8,6,3,4,8,15,55,100,88,70,50,99,70});
      test3.insert(5,122);
      assertEquals(5,test3.indexOf((int)122));
      }
   @Test public void testTrimToSize(){
      SimpleLinkedList test2 = new SimpleLinkedList(new Integer[] {8,6,3,4,8,15,55,100,88,70,50});
      test2.trimToSize(3);
      assertEquals(3,test2.size());
      }
   
}
