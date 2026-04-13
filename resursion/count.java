public class count {
    static int c=0;
    static int count(int num){
        if(num==0){
            return c;
        }
        c++;
        return count(num/10);
    }
    public static void main(String[] args) {
        int a=1234;
        int res=count(a);
        System.out.println(res);
    }
}
