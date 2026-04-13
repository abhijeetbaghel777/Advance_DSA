public class main2 {
    static int sum=0;
    static int sum_even(int arr[],int index){
        if(arr.length==index){
            return sum;
        }
        if(arr[index]%2==0){
            sum=sum+arr[index];
        }
        return sum_even(arr, index+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,5,3,4,2,4,2,8,6};
        System.out.println(sum_even(a,0));
    }
}
