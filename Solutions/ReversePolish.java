import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int output = 0;

        for(String t : tokens){

            if(t.equals("+")){
                int num1 = stack.peek();
                stack.pop();

                int num2 = stack.peek();
                stack.pop();

                int sum = num1+num2;

                stack.push(sum);
                output = sum;
            }
            else if (t.equals("-")){
                int num1 = stack.peek();
                stack.pop();

                int num2 = stack.peek();
                stack.pop();

                int diff = num2 - num1;

                stack.push(diff);

                output = diff;
            }

            else if (t.equals("*")){
                int num1 = stack.peek();
                stack.pop();

                int num2 = stack.peek();
                stack.pop();

                int prod = num2 * num1;

                stack.push(prod);
                
                output = prod;
            }

            else if (t.equals("/")){
                int num1 = stack.peek();
                stack.pop();

                int num2 = stack.peek();
                stack.pop();

                int quot = num2 / num1;

                stack.push(quot);

                output = quot;
            }
            else{
            int number = Integer.parseInt(t);
            stack.push(number);
            }

        }

        return stack.pop();
    }
}
