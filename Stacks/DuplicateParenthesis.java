import java.util.Stack;
public class DuplicateParenthesis {
    public static boolean findDuplicateParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // pop the opening parenthesis
                }
                if (count == 0) {
                    return true; // found duplicate parentheses
                }
            } else {
                stack.push(ch);
            }
        }
        return false; // no duplicate parentheses found
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "(a+(b)/c)";
        String str3 = "(a+b*(c-d))";

        System.out.println(findDuplicateParenthesis(str1)); // Output: true
        System.out.println(findDuplicateParenthesis(str2)); // Output: false
        System.out.println(findDuplicateParenthesis(str3)); // Output: false
    }
}