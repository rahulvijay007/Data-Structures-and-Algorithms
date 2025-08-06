public class binaryString {
    public static void print(int n, int lp, StringBuilder s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        if(lp==0)
        {
            s.append("0");
            print(n-1, 0, s);
            s.deleteCharAt(s.length()-1);
            s.append("1");
            print(n-1, 1, s);
            s.deleteCharAt(s.length()-1);
        }
        else if(lp==1)
        {
            s.append("0");
            print(n-1, 0, s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public static void main(String[] args) {
        int n = 3; // Length of binary strings
        StringBuilder s = new StringBuilder();
        print(n, 0, s); // Start with no last printed character
    }
}
