public class tf {
    static boolean check(int arr[],int key,int index){
        if(arr.length==index){
            return false;
        }
        if(arr[index]==key){
            return true;
        }
        return check(arr, key, index+1);
    }
    public static void main(String[] args) {
        int a[]={1,3,7,98,65,6};
        int key=6;
        System.out.println(check(a, key, 0));
    }
}
