import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);

        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println("removed value: "+st.pop());
        System.out.println(st);
        System.out.println(st.peek());// gives which element is at top
        //System.out.println(st.peek());
        System.out.println(st.isEmpty());// checks whether the stack is empty
        System.out.println(st.size());// return the size of the stack
        // stack printing in reverse
        while(st.isEmpty()!=true){
            System.out.println(st.pop());
        }
    }
}
