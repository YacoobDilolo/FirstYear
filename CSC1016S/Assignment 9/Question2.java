import java.util.*;

 public class Question2{

   public static  boolean check(char bracket){
      boolean checks = true;
      switch(bracket){
         case '(': case '{': case '[': case '<':
            checks = true;
            break;
        case ')': case ']': case '}': case '>':
            checks =false;
             break;
        }
      return checks;
   }
   public static char corresponding(char bracket){
            char checks = ' ';
            switch(bracket){
                  case '(':
                      checks = ')';
                      break;    
                  case '[':
                     checks = ']';
                      break; 
                  case '{':
                     checks = '}';
                      break; 
                  case '<':
                     checks = '>';
                      break;
                  case ')':
                     checks = '(';
                      break;
                  case ']':
                     checks = '[';
                      break;
                  case '}':
                     checks = '{';
                      break;
                  case '>':
                     checks = '<'; 
                      break;               
            } 
          return checks;  
   }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Stack<Character> stk = new Stack();
        Stack<Character> stkOpen = new Stack();
        Stack<Character> stkClosed = new Stack();
        System.out.println("Enter a string to test:");
        String string = scan.nextLine();
        String tempString = string.replaceAll(" ","");
        for (int i=0;i<tempString.length();i++){
            char ch = tempString.charAt(i);
            stk.push(ch);
        }
        if(check(stk.peek())){
               System.out.println("error at end: opening bracket '"+stk.peek()+"' remains unclosed.");
               System.exit(0);
        }
        boolean inspect = false;
        while (!stk.isEmpty()){
           char chr = (char)stk.peek();
           if(stkOpen.isEmpty()& stkClosed.isEmpty()){
               if(check(chr))
                  stkOpen.push(chr);
               else if(!check(chr))
                 stkClosed.push(chr);
               stk.pop();      
           }else{
               if(check(chr)){
                     if(!stkClosed.isEmpty()){
                       if(corresponding(chr)==(char)stkClosed.peek()){
                              stkClosed.pop();
                              stk.pop();
                       }else{
                         System.out.println("error: '"+stkClosed.pop()+"' does not match with '"+chr+"'.");
                              inspect = true;
                              break;
                       }
                     
                    }else{
                        stkOpen.push(chr);
                        stk.pop();
                     }        
             }else if(!check(chr)){
                  if(!stkOpen.isEmpty()){
                       if(corresponding(chr)==(char)stkOpen.peek()){
                              stkOpen.pop();
                              stk.pop();
                      
                       }else{
                         System.out.println("error: '"+stkOpen.pop()+"' does not match with '"+chr+"'.");
                             inspect = true;
                              break;
                       }
                  }else{
                      stkClosed.push(chr);
                        stk.pop();
                  }
             }
       }
    }
   if(stkOpen.isEmpty()& stkClosed.isEmpty() & !inspect){
         System.out.println("The string is correct! There are no mismatched brackets.");
      }else{
         while(!stkOpen.isEmpty() &!inspect){
            System.out.println("error at end: opening bracket '"+stkOpen.pop()+"' remains unclosed.");
         }
         while(!stkClosed.isEmpty()&!inspect){
            System.out.println("error at end: the close bracket '"+stkClosed.pop()+"' does not have a corresponding opening bracket.");
         }
     }
   }
}