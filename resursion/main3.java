public class main3 {
    static int max=0;
    static int ind=0;
    static int maximum(int arr[],int index){
        if(arr.length==index){
            return ind;
        }
        if(arr[index]>max){
            max=arr[index];
            ind=index;
        }
        return maximum(arr, index+1);
    }
    public static void main(String[] args) {
        int a[]={10,34,23,56,98,60};
        System.out.println(maximum(a,0));
    }
}
