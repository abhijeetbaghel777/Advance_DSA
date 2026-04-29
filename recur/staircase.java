import java.util.*;
import java.util.Arrays;

public class staircase {
    static int facto(int n,int dp[]){
        if(n==0) return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]=n*facto(n-1, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=6
        ;
        int arr[]=new int[n+1];
        Arrays.fill( arr,-1);
        System.out.println(facto(n, arr));
    }
}
