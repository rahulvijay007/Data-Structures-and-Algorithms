import java.util.*;
public class PairSum2
{
    public static boolean bruteForce(ArrayList<Integer> l, int t)
    {
        for(int i = 0;i<l.size();i++)
        {
            for(int j = i+1;j<l.size();j++)
            {
                if(l.get(i)+l.get(j)==t)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean twoPointer(ArrayList<Integer> l, int t)
    {
        int lp=0, rp=0;
        for(int i = 0;i<l.size();i++)
        {
            if(l.get(i)>l.get(i+1))
            {
                lp = i+1;
                rp = i;
                break;
            }
        }
        while(lp!=rp)
        {
            if(l.get(lp)+l.get(rp)==t)
            {
                return true;
            }
            else if(l.get(lp)+l.get(rp)<t)
            {
                lp = (lp+1)%l.size();
            }
            else
            {
                rp = (l.size()+rp-1)%l.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(6, 7,1,2,3,4,5));
        int t = 99;
        System.out.println(bruteForce(l,t));
    }
}