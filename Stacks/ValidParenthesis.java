import java.util.*;
public class ValidParenthesis
{
    public static boolean check(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='['))
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(check(s));
        String t = "{[(])}";
        System.out.println(check(t));
    }
}