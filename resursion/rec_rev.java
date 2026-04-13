public class rec_rev {
    static int reve=0;
    static int rev(int num){
        if(num==0){
            return reve;
        }
        reve=reve*10+num%10;
        return  rev(num/10);
        

    }
    public static void main(String[] args){
           int a=123;
         int result=rev(a);
         System.out.println(result);
    }
}
