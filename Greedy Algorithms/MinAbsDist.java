import java.util.*;
public class MinAbsDist{
    public static void main(String[] args) 
    {
        int A[] = {3, 5, 4, 2};
        int B[] = {4, 1, 2, 10};
        Arrays.sort(A);
        Arrays.sort(B);
        int ans = 0;
        for(int i=0; i<A.length; i++)
        {
            ans += Math.abs(A[i] - B[i]);
        }
        System.out.println(ans);
    }
}