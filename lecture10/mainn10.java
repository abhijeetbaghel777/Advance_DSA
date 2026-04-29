public class mainn10 {
   static int sum=0;
   static int count=0;
   static void digit_count(int n){
   int check=n;
    if(n<=0){
        System.out.println("sum of digit->"+sum);
        System.out.println("count->"+count);
        return;
    }
    count++;
    sum=sum+check%10;
    digit_count(n/10);
    return;

   }
    public static void main(String[] args) {
       digit_count(146);
       
}
