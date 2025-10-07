public class IndianCoins
{
    public static void main(String[] args) {
        int amount = 590;
        int den[] = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int n = den.length;
        int count = 0;
        System.out.println("The minimum number of coins required to make the change for " + amount + " is:");
        for(int i = 0;i<n; i++)
        {
            if(den[i]<amount)
            {
                while(amount>=den[i])
                {
                    amount = amount - den[i];
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}