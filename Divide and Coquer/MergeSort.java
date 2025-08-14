public class MergeSort {
    public static void print(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }   
    }
    public static void sort(int n[], int s, int e)
    {
        if(s>=e)
            return;
        int m = s+(e-s)/2;
        sort(n, s, m);
        sort(n, m+1, e);
        merge(n, s, m, e);
    }
    public static void merge(int n[], int s, int m, int e)
    {
        int t[] = new int[e-s+1];
        int i = s, j = m + 1, k = 0;
        while(i <= m && j <= e)
        {
            if(n[i] <= n[j])
            {
                t[k++] = n[i++];
            }
            else
            {
                t[k++] = n[j++];
            }
        }
        while(i <= m)
        {
            t[k++] = n[i++];
        }
        while(j <= e)
        {
            t[k++] = n[j++];
        }
        for(i = s, k = 0; i <= e; i++, k++)
        {
            n[i] = t[k];
        }
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
