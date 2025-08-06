public class Insertion
{
    public static void sort(int n[])
    {
        for(int i=1; i<n.length; i++)
        {
            int c = i;
            int p = i-1;
            while(p>=0 && n[p]>n[c])
            {
                n[p+1] = n[p]; // Shift larger element to the right
                p--;
            }
            n[p+1] = n[c];
        }
    }
    public static void print(int n[])
    {
        for(int i = 0; i<n.length; i++)
        {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int n[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Unsorted array:");
        print(n);
        sort(n);
        System.out.println("Sorted array:");
        print(n);
    }
}