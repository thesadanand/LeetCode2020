
public class Fibonnaci_DP {

    public static long fiboDP(int n){
        long[] dp = new long[n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<n;i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n-1];
    }

    public static void main(String[] args) {
       int i = 9;
       long fibo = fiboDP(i);
       System.out.println(i+"th fibo "+fibo);
    }
}

