public class QuickSort {
    public static void print(int n[])
    {
        for(int i=0;i<n.length;i++)
            System.out.print(n[i]+" ");  
    }
    public static void sort(int n[], int s, int e)
    {
        if(s>=e)
            return;
        int p = partition(n, s, e);
        sort(n, s, p-1);
        sort(n, p+1, e);
    }
    public static int partition(int n[], int s, int e)
    {
        int p = n[e];
        int i = s-1;
        for(int j = s; j < e; j++)
        {
            if(n[j] <= p)
            {
                i++;
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }
        }
        int temp = n[i+1];
        n[i+1] = n[e]; 
        n[e] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int n[] = {12, 11, 13, 5, 6, 7};
        System.out.println("Given array is:");
        print(n);
        sort(n, 0, n.length - 1);
        System.out.println("\nSorted array is:");
        print(n);
    }
}
