public class hiii{
    static int total;
   static int sub_sum(int arr[],int i,int sum){
    if(i==arr.length){
       total+=sum;
        return total;
    }
    sub_sum(arr,i+1,sum+arr[i]);
    sub_sum(arr, i+1, sum);
    return total;
   }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        System.out.println(sub_sum(arr1, 0, 0));
    }
}