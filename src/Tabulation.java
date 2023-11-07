//This question we can do with Memoization
//But we will use tabulation as this can store moves in an specified manner
//Follow these 3-step
//Storage and Meaning
//Direction
//Travel and Solve


public class Tabulation {
    public static void main(String[] args) {
       int ans =  tabClimbingStairs(10);
        System.out.println(ans);
    }

    public static int tabClimbingStairs(int n){


        int[] dp = new int[n+1];

        dp[0] = 1;

        for (int i=1;i<=n;i++){
            if (i==1){
                dp[i] = dp[i-1];
            }
            else if (i==2){
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

        }


        return dp[n];
    }

}
