public class RandomGenerator{
   private long x;
//Constructors
   public RandomGenerator(long seed){
      x = seed;
   }
//Methods
   public int nextInt(){
      x = (48271*x)%2147483647;
      return (int)x;
   } 
   public double nextDouble(){
      return (nextInt()/(double)2147483647);
   }
   public int nextInt(int i){
     return (int)(nextDouble()*i);
   }
}