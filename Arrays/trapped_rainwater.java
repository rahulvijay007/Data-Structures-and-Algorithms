

public class trapped_rainwater
{
    public static int trapped(int h[])
    {
        int n = h.length;
        if(n == 0) return 0;
        int lh[] = new int[n];
        for(int i=1;i<n;i++)
        {
            lh[i] = Math.max(lh[i-1], h[i]);
        }
        int rh[] = new int[n];
        for(int i=n-2;i>=0;i--){
            rh[i] = Math.max(rh[i+1], h[i]);
        }
        int wt = 0;
        for(int i=0;i<n;i++)
        {
            wt += Math.min(lh[i], rh[i]) - h[i];
        }
        return wt;

    }
    public static void main(String[] args)
    {
        int h[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water: " + trapped(h));
    }
}
    