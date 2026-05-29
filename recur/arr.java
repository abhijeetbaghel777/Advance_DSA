public class arr {
    
    static int count(int n){
        if(n<=1){
            return 1;
        }
        return count(n-1)+count(n-2);
    } 
    public static void main(String[] args) {
        int num=4;
        System.out.println(count(num));
    }
}
