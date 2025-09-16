import java.util.*;
public class Reversal {
    public static Queue<Integer> reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        
        // Step 1: Dequeue all elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        
        // Step 2: Pop all elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original Queue: " + q);
        Queue<Integer> reversedQueue = reverse(q);
        System.out.println("Reversed Queue: " + reversedQueue); 
    }
    
}
