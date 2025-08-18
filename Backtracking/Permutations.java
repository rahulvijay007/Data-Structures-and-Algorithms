public class Permutations {
    public static void find(String s, String a) {
        // base case
        if (s.isEmpty()) {
            System.out.println("[" + a + "]");
            return;
        }
        
        // recursive case
        for (int i = 0; i < s.length(); i++) {
            // choose character at index i
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            
            // pass a + ch (new string, no need to un-choose)
            find(remaining, a + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        find(s, "");
    }
}
