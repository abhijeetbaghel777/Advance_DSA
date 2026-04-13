public class main1 {
     static int count=0;
    static void fun(int arr[],int key,int index){
       if(arr.length==index){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return;
       }
        if(arr[index]==key)arr[index]=5;
         fun(arr, key, index+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,2,4,5,3,2,};
        int key=2;
        fun(a, key, 0);
    }
}
