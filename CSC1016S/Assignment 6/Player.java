public class Player{
   private String word;
   private int points;
   
   //every letter worth 10 points but bonus points for every word constructed with 5 o more letters
   
   public Player(String word){
      this.word=word;
      if (this.word.length()>4){
         points = (this.word).length()*15;
       }
     else{
     points = (this.word).length()*10;
     }
      
   }
   
   public int getPoints(){
      return points;
   }
   
   public String toString(){
    return "Score: "+points;
      }
  
}