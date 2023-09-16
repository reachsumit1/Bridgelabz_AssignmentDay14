package AssignmentDay14.AssignmentDay14_1;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(30);
        st.push(70);
        System.out.println(st);
        System.out.println("Top most element: "+st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("Top most element: "+st.peek());
    }
}