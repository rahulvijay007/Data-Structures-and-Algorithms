import java.util.*;
public class MyDeque
{
    public static void main(String args[])
    {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addLast(2);
        q.addFirst(3);
        q.addLast(4);
        System.out.println(q);
        q.removeFirst();
        q.removeLast();
        System.out.println(q);
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        
    }
}