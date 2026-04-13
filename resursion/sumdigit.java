public class sumdigit {
    static int sum=0;
    static int sum(int num){
        if(num==0){
            return sum;
        }
        int x=num%10;
        sum=sum+x;
       return sum(num/10);
    }
    public static void main(String[] args){
        int n=1234;
        System.out.println(sum(n));
    }
}
