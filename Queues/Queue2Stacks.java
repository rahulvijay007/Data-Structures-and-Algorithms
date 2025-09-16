import java.util.*;
public class Queue2Stacks {
    public static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public Queue(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        public void push(int x){
            stack1.push(x);
        }
        public int pop(){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }
        public int peek(){
            if(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
        public boolean empty(){
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue
         queue = new Queue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek()); // returns 1
        System.out.println(queue.pop());  // returns 1
        System.out.println(queue.empty()); // returns false
        
    }

    
}
