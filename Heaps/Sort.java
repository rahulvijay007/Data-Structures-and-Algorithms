public class Sort {
    public static void heapSort(int ar[])
    {
        int n = ar.length;
        for(int i = (n/2)-1; i>=0; i++)
            heapify(ar, i, n);
        
        for(int i = n-1; i>=0; i--)
        {
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;
            heapify(ar, 0, i);
        }
    }
    public static void heapify(int ar[], int i, int n)
    {
        int l = 2*i + 1;
        int r = 2*i + 2;    
        int largest = i;
        if(l < n && ar[l] > ar[largest])
            largest = l;
        if(r < n && ar[r] > ar[largest])
            largest = r;
        if(largest != i)
        {
            int temp = ar[i];
            ar[i] = ar[largest];
            ar[largest] = temp;
            heapify(ar, largest, n);
        }
    }
    public static void main(String args[])
    {
        int ar[] = {12, 11, 13, 5, 6, 7};
        heapSort(ar);
        System.out.println("Sorted array is");
        for(int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
    }
    
}
