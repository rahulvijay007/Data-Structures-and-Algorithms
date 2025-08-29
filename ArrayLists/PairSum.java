import java.util.ArrayList;
public class PairSum
{
    public static boolean hasPair1(ArrayList<Integer> l, int t)
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
    public static boolean hasPair2(ArrayList<Integer> l, int t)
    {
        int i = 0;
        int j = l.size()-1;
        while(i<j)
        {
            if(l.get(i)+l.get(j)==t)
            {
                return true;
            }
            else if(l.get(i)+l.get(j)<t)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        int t = 9;
        System.out.println(hasPair2(l,t));
    }
}