public class rec {
    static int pow(int x,int m){
        if(m==0){
            return 1;
        }
       
        return x*pow(x, m-1);
    }
    public static void main(String[] args) {
        int base=2;
        int expo=3;
        int result=pow(base, expo);
        System.out.println(result);
    }
}
