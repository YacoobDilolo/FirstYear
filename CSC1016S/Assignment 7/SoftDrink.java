import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SoftDrink implements Comparable<SoftDrink>{
      private String name,colour; private int volume;
      
      public SoftDrink(String n,String c,int v){
         this.name = n;this.colour=c;this.volume = v;
      }
      

      public String toString(){
         return name+" "+colour+" "+volume;
      }
      
      
    public boolean equals(Object other) {
        if (!(other instanceof SoftDrink))
            return false;
        SoftDrink nw = (SoftDrink)other;
        return nw.name.equals(this.name) && nw.colour.equals(this.colour) && nw.volume==this.volume;
    }
      
    public int compareTo(SoftDrink other) {
        int FirstOrder = this.name.compareTo(other.name);
        int SecondOrder =this.colour.compareTo(other.colour);
        int ThirdOrder =Integer.compare(this.volume, other.volume);
        return (FirstOrder != 0 ? FirstOrder :SecondOrder != 0? SecondOrder :ThirdOrder != 0?ThirdOrder:ThirdOrder);
    }
 }