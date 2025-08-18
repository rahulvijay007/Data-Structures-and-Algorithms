public class subsets {
    public static void find(String s, String a, int i)
    {
        //base
        if (i == s.length()) {
            if (a.isEmpty()) {
                System.out.println("[ ]");
            }
            else{
                System.out.println("["+a +"]");
            }
            return;
            
        }

        find(s, a+s.charAt(i), i+1);
        find(s, a, i+1);

    }
    public static void main(String args[])
    {
        String s = "abc";
        String a = "";
        find(s, a, 0);
    }
    
}
