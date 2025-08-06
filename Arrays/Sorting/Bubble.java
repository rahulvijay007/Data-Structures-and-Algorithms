public class Bubble
{
    public static void sort(int n[])
    {
        for(int i = 0; i<n.length-1; i++)
        {
            int s = 0;
            for(int j = 0; j<n.length-1-i; j++)
            {
                if(n[j] > n[j+1])
                {
                    // Swap n[j] and n[j+1]
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    s++;
                }
            }
            if(s == 0)
            {
                break; // No swaps means the array is sorted
            }
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
        int n[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Unsorted array:");
        print(n);
        sort(n);
        System.out.println("Sorted array:");
        print(n);
    }
}