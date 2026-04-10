public class maxstr {
    public static void main(String[] args){
        String str="abf456nf80m35";
        String s="";
        int max=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=58){
                s=s+str.charAt(i);
            }
        }
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit>max){
                max=digit;
            }
        }
        System.out.println(max);
    }
}
