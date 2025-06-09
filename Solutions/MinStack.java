import java.util.Stack;

class MinStack {

    Stack<Integer> myStack;
    Stack<Integer> minStack;

    public MinStack() {
        myStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(myStack.isEmpty()){
            myStack.push(val);
            minStack.push(val);
            return;
        }

        myStack.push(val);
        minStack.push(Math.min(val,minStack.peek()));
    }
    
    public void pop() {
        myStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
