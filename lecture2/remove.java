public class remove  {
    public static void main(String[] args) {
        String str="baderia global";
        char rem='a';
        String s="";
        System.out.println("Before removing: "+str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=rem){
                s=s+str.charAt(i);
            }
        }
        System.out.println("After removing: "+s);
        
    }
}
