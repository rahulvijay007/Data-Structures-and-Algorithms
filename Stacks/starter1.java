import java.util.*;

public class starter1 {
    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
