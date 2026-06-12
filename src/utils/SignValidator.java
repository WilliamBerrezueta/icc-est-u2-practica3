package utils;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String aux){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < aux.length(); i++){
            char c = aux.charAt(i);

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char ultimo = stack.pop();
                if(c == ')' && ultimo != '('){
                    return false;
                }
                if(c == ']' && ultimo != '['){
                    return false;
                }
                if(c == '}' && ultimo != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
}
