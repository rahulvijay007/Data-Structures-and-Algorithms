import java.util.*;
public class containerWithMostWaterBruteForce {
    public static int bruteForce(ArrayList<Integer> h)
    {
        int m = 0;
        for(int i = 0; i < h.size(); i++)
        {
            for(int j = i + 1; j < h.size(); j++)
            {
                int area = Math.min(h.get(i), h.get(j)) * (j - i);
                m = Math.max(m, area);
            }
        }
        return m;
    }
    public static int twoPointer(ArrayList<Integer> h)
    {
        int m = 0;
        int i = 0, j = h.size() - 1;
        while(i < j)
        {
            int a = Math.min(h.get(i), h.get(j)) * (j - i);
            m = Math.max(m, a);
            if(h.get(i) < h.get(j))
                i++;
            else
                j--;
        }
        return m;
    }
    public static void main(String[] args) {
        ArrayList<Integer> h = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(twoPointer(h));
    }
    
}
