import java.util.*;
public class Classroom
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}