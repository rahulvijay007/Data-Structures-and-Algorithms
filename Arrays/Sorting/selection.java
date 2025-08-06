public class selection
{
    public static void sort(int n[])
    {
        for(int i = 0; i<n.length-1; i++)
        {
            
            int minp = 0;
            for(int j = i+1; j<n.length-1; j++)
            {
                if(n[minp] > n[j])
                {
                    minp = j;
                }
            }
            int t = n[minp];
            n[minp] = n[i];
            n[i] = t;
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
    

