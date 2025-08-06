import java.util.*;
public class Inbuilt {
    public static void sort(Integer n[])
    {
        // Using Java's built-in sort method
        java.util.Arrays.sort(n, Collections.reverseOrder());
    }
    public static void print(Integer n[])
    {
        for (Integer n1 : n) {
            System.out.print(n1 + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer n[] = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Unsorted array:");
        print(n);
        sort(n);
        System.out.println("Sorted array:");
        print(n);
    }
}
