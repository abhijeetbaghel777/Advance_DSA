import java.util.Arrays;

public class recur_string {
    static int subset_count(String st,int index,int [] dp){
        if(index==st.length()){
            return 1;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int include=subset_count(st, index+1, dp)
    }
    public static void main(String[] args) {
        String str="abcde";
        int[] dp=new int[str.length()+1];
        Arrays.fill(dp,-1);
        subset_count(str,0,dp);
    }
}
