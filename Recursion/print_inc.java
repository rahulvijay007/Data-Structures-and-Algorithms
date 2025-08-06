public class print_inc
{
    public static void print(int n)
    {
        if(n==1)
        {
            System.out.print(n + " ");
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args)
    {
        int n = 5; // Example input
        print(n);
    }
}