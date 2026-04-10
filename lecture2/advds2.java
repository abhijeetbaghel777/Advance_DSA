public class advds2 {
    public static void main(String[] args){
        String str="madam";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i, j);
                System.out.println(sub);
                if(sub.charAt(0)==sub.charAt(sub.length()-1) && sub.length()!=1
            ){
                    count++;
                }
                
            }
        }
        System.out.println(count);

    }
}
