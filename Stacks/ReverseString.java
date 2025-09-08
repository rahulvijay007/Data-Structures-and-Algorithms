import java.util.*;
public class ReverseString {
    public void reverse(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            s.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        System.out.println(sb.toString());
    }    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse:");
            String str = sc.nextLine();
            ReverseString rs = new ReverseString();
            rs.reverse(str);
        }
    }
    
}
