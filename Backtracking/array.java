public class array
{
    public static void change(int a[], int i, int v)
    {
        if(i == a.length)
        {
            print(a);
            return;
        }
        a[i] = v;
        change(a, i+1, v + 1);
        a[i] = a[i] - 2;
       
    }
    public static void print(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int a[] = new int[5];
        change(a, 0, 1);
        System.out.println("Final array:");
        print(a);
    }
}