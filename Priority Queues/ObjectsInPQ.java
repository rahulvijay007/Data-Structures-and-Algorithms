import java.util.*;
public class ObjectsInPQ
{
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name, int rank)
        {
        
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s)
        {
            return this.rank - s.rank; // Ascending order based on rank
        }

    }
    public static void main(String[] args)
    {
            java.util.PriorityQueue<Student> pq = new java.util.PriorityQueue<>();

            pq.add(new Student("Alice", 3));
            pq.add(new Student("Bob", 1));
            pq.add(new Student("Charlie", 2));

            while (!pq.isEmpty())
            {
                Student s = pq.poll();
                System.out.println("Name: " + s.name + ", Rank: " + s.rank);
            }
        }
}