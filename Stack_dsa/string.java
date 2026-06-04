import java.util.Stack;

public class string {
    public static void main(String[] args) {
        
       String str="Abhijeet";
        Stack<Character> st= new Stack<>();
        for(char i:str.toCharArray()){
            
            st.push(i);
        }
        String rev="";
        int count=0;
        while(st.isEmpty()!=true){
            st.pop();
            count++;
        }
    //     if(str==rev){
    //         System.out.println("pallindrome hai...");
    //     }
    //     else{
    //         System.out.println("nahi hai...");
    //     }
    System.out.println("size of stack= "+count);
     }
    
}
