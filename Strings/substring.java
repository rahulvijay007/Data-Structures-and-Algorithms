public class substring
{
    public static String Substring(String s, int a, int b)
    {
        String s1= "";
        for(int i=a;i<b;i++)
        {
            s1 += s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        String s = "Hello World!";
        int start = 6;
        int end = 12;
        String result = Substring(s, start, end);
        System.out.println("Substring from index " + start + " to " + end + ": " + result);
        System.out.println(s.substring(end));
    }
}