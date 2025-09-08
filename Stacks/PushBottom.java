import java.util.Stack;
public class PushBottom {
    public void solution(Stack<Integer> s, int d)
    {
        if(s.isEmpty())
        {
            s.push(d);
            return;
        }
        int top = s.pop();
        solution(s,d);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        int d = 5;
        PushBottom obj = new PushBottom();
        obj.solution(s,d);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
    
}
