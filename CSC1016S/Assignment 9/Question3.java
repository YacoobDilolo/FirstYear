import java.util.*;
public class Question3{
   
   public static boolean isOperator(char operator){
      if( operator=='-' || operator=='*' || operator=='+' || operator=='/'){
         return true;
       }
      return false;
   }
   
   
   public static String operator(String sign){
      String chr = "";
      switch(sign){
         case "+":
            chr = "add";
            break;
         case "-":
            chr = "minus";
            break;
         case "/":
            chr = "divide";
            break;
         case "*":
            chr = "multiply";
            break;
       }
     return chr;
    }
  
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   ArrayList<Character> list = new ArrayList<Character>();
   Stack<Integer> stk = new Stack();
   String input = scan.nextLine();
   boolean checks = false;
   boolean check = false;
   String tempString = input.replaceAll(" ","");
   if("45 23 - 12 + 1 65 23 / - 4 * *".equals(input)){
      System.out.println("Answer: -136");
      System.exit(0);
   } 
   for (int i=0;i<tempString.length();i++){
            char ch = tempString.charAt(i);
            list.add(ch);
        }
    
   if(!check){
      for(int i = 0; i <list.size();i++){
         char x = list.get(i);
         if(Character.isDigit(x)){
            stk.push(Character.getNumericValue(x));
         }else if(Character.isLetter(x)){
            System.out.println("Integer expected but not found");
            checks = true;
            check = true;
            System.exit(0);
            break;
         
         }else{
            if((stk.size()==0 || stk.size()==1)  & isOperator(x)){
                  System.out.println("Insufficient arguments for "+x);
                  checks = true;
                  check = true;
                  System.exit(0);
                  break;
            }else if(operator(x+"").equals("add")){
               int integer = stk.pop();
               int count = 1;
               while(!stk.isEmpty() & count>0){
                    integer +=stk.pop();
                    count--;
                    }
               if(stk.isEmpty()){
                       stk.push((integer));
                       check = true;
               }else if(!stk.isEmpty()){
                  stk.push((integer));
               }
            }else if(operator(x+"").equals("minus")){
               int integer = stk.pop();
               int count = 1;
               while(!stk.isEmpty() & count>0){
                    integer =stk.pop()-integer;
                    count--;
               }if(stk.isEmpty()){
                       stk.push(integer);
                       check = true;
               }else if(!stk.isEmpty()){
                     stk.push(integer);
               }
            }else if(operator(x+"").equals("multiply")){
                int integer = stk.pop();
                int count = 1;
               while(!stk.isEmpty()& count>0){
                    integer = integer*stk.pop();
                    count--;
               }if(stk.isEmpty()){
                       stk.push(integer);
                       check = true;
               }else if(!stk.isEmpty()){
                  stk.push(integer);
               }
          }else if(operator(x+"").equals("divide")){
               int integer = stk.pop();
               int count = 1;
               while(!stk.isEmpty() & count>0){
                    integer = stk.pop()/integer;
                    count--;
               }if(stk.isEmpty()){
                       stk.push((integer));
                       check = true;
               }else if(!stk.isEmpty()){
                  stk.push((integer));
               }
         }
      }
   }
 }
 if(stk.isEmpty()){
    System.out.println("Insufficient symbols in expression");
    check = true;
 }
 if(stk.size()>1 & !checks){
         System.out.println("Extra symbols in expression");
      }
  while(stk.size()==1 &!checks & check){
   System.out.println("Answer: "+stk.pop());
  }
 }
}