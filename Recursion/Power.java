public class Power
{
    public static int power1(int x, int n)
    {
        if(n==0)
            return 1;
        return (x * power1(x, n - 1));
    }
    public static int power2(int x, int n)
    {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return power2(x * x, n / 2);
        else
            return x * power2(x * x, (n - 1) / 2);
    }

    public static void main(String[] args)
    {
        int x = 2, n = 3;
        System.out.println("Power of " + x + " raised to " + n + " is: " + power2(x, n));
    }
}
