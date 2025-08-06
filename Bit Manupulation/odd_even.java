
public class odd_even
{
    public static void check(int n)
    {
        int b = 1;
        if((n&b) == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
    public static void main(String[] args)
    {
        int n = 5; // Example input
        check(n);
         n = 8; // Another example input
        check(n);
    }
}