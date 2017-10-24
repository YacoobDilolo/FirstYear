
public class CSC1016S implements Student{
   private String name;
   private int pracs,practests,tests,exam;
   
   @Override 
   public void setName( String name ){
      this.name=name;
   
   }
   
    @Override 
   public String getName(){
      return name;
   }
   
   @Override 
  public void setMark(String category, int mark ){
         if (category.equals("pracs")){
            pracs = mark;
         }else if(category.equals("practests")){
            practests = mark;
         }else if(category.equals("tests")){
            tests = mark;
         }else if(category.equals("exam")){
            exam = mark;
         }
      }
      
    @Override 
   public float getFinal(){
      return (float)(pracs*0.15+practests*0.10+tests*0.15+exam*0.60);
   } 
}