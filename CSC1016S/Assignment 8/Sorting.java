import java.util.*;
public class Sorting implements Comparable<Sorting>{
      private String word;
      private int lengthOfWord;
      public Sorting(String word){
            this.word=word;
            lengthOfWord=word.length();
      
      } 
      public boolean equals(Object Obj){
      Sorting testMus = (Sorting) Obj;
      if (testMus.word.equals(word))
      return(true); else return false;
      }
      public String toString(){
         return word;
      }
      public int compareTo(Sorting other){
           return this.lengthOfWord-other.lengthOfWord;
       }

   } 
