import java.util.*;
public class FirstNonRepeatingLetter 
{
    public static Character find(String s)
    {
        int f[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            f[ch - 'a']++;
            q.add(ch);
            while(!q.isEmpty() && f[q.peek() - 'a'] > 1)
            {
                q.remove();
            }
        }
        if(!q.isEmpty())
        {
            return q.peek();
        }
        else
        {
            return null;
        }
    }
    public static void main(String[] args) 
    {
        String input = "swiss";
        Character result = find(input);
        if (result != null) {
            System.out.println("The first non-repeating letter is: " + result);
        } else {
            System.out.println("All letters are repeating.");
        }
    }

    
    
}
