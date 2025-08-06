public class setith
{
    public static int get(int n, int i)
    {
        return n|(1<<i) ;
    }
    public static void main(String[] args)
    {
        int n = 5; // Binary: 101
        int i = 2; // We want to get the 2nd bit (0-indexed)
        int bit = get(n, i);
        System.out.println("The number after setting the " + i + "th bit is: " + bit);

    }
}