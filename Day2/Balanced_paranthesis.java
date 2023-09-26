package Day2;

import java.util.Stack;

public class Balanced_paranthesis {
    public static boolean isBalanced(String expression) {
        //Your code goes here

       Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char exp=expression.charAt(i);
            if(exp == '(' ){
                stack.push(exp);
            }
            else if(exp == ')' ){
                
                if(stack.size() == 0){
                    return false; //closing brackets more condn
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.size() > 0){
            return false; //opening brackets more condition
        }else{
            return true;
        }
    }
}
