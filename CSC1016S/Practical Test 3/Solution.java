public class Solution extends LinkedList{
   private int sum,count;
   private Node current;
   private Node after;
   
   public Solution(){super();}
   
   public int numLessThan(int Nth){
     count = 0;
     sum = 0;     
     current = head;
     if (current!=null){
         after = head.getNext();
       }
     while(current!=null){
          count++; 
         if (current.getData()<(Nth)){
            sum++;
            count = 0;
          }
   
          current = after;
          if (after!=null){
            after = after.getNext();
          }
        }
     return sum;
   }
}
