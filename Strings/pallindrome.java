public class pallindrome {
    public static void pallin(String s)
    {
        for(int i = 0; i<s.length()/2; i++)
        {
            int n = s.length();
            if(s.charAt(i) != s.charAt(n-i-1))
            {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        String s = "mada";
        pallin(s);
    }
}
