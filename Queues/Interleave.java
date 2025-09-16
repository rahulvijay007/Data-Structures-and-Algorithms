import java.util.*;
public class Interleave{
    public static Queue<Integer> Operation(Queue<Integer> q1)
    {
        int s = q1.size();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<s/2;i++)
        {
            q2.add(q1.remove());
        }
        while(!q2.isEmpty())
        {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
        return q1;
    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        System.out.println(Operation(q1));
    }

    
}