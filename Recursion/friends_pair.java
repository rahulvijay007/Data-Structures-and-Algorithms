public class friends_pair
{
    public static int pair(int n)
    {
        if(n==1 || n==2)
            return n;
        // If the first friend is not paired, we can pair the remaining n-1 friends
        // If the first friend is paired with one of the remaining (n-1) friends
        return pair(n-1) + ((n-1)*(pair(n-2)));
    }
    public static void main(String[] args)
    {
        int n = 3; // Example input
        System.out.println("Number of ways to pair " + n + " friends: " + pair(n));
    }
}