import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){

            char current = s.charAt(i);

            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }
            else{
                if(stack.size()==0){return false;}
                char top = stack.pop();

                if(current == ')' && top !='('){
                    return false;
                }
                if(current == ']' && top !='['){
                    return false;
                }
                if(current == '}' && top !='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }
}
