import java.util.Arrays;

public class main9 {
    static int count(int n,int[] dp){
        if(n==1) return 1;
       
        
        if(dp[n]!=-1)return dp[n];
        dp[n]=count(n-1, dp)+count(n/2, dp)+count(n/3, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int num=10;
        int dp[]=new int[num+1];
        Arrays.fill( dp,-1);
        System.out.println(count(num, dp));
    }
}
