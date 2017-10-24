import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Question2 {
      public static void main(String[] args) {

      try {
            LinkedList<String> results = FileToArray.read(args[0]);
            LinkedList<Sorting> sorted = new LinkedList<Sorting>();
            for (String word :results) {
              sorted.add(new Sorting(word));  
            }
            Collections.sort(sorted);
            int temp = 0;
           for (Sorting word :sorted) {
                String betterWord = word.toString().replaceAll(" ","");
                System.out.println((sorted.indexOf(word)+1)+"/"+(betterWord.length())+": "+word.toString());
                temp++;
                sorted.set(sorted.indexOf(word),new Sorting(temp+""));
             }
            
        }
        catch (Exception exception) {
            System.out.println("Whoops, file error:");
            System.out.println(exception);
        }
     }
}