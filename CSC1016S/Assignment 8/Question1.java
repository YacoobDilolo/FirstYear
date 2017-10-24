import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Question1{
   public static void main(String[] args) {

       try {
            int temp = 0;
            LinkedList<String> results =  FileToArray.read(args[0]);
            for (String word : results) {
                  String betterWord = word.replaceAll(" ","");
                System.out.println((results.indexOf(word)+1)+"/"+(betterWord.length())+": "+word);
                temp++;
                results.set(results.indexOf(word),temp+"");
            }
        }
        catch (Exception exception) {
            System.out.println("Whoops, file error:");
            System.out.println(exception);
        }
     }

}