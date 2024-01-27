class Solution {
    int M=(int)1e9+7;
    public int solve(int n,int k,int[][] dp)
    {
        if(n==0)
            return 0;
        if(k==0)
            return 1;
        if(dp[n][k]!=-1)
            return dp[n][k];
        int res=0;
        for(int inv=0;inv<=Math.min(n-1,k);inv++)
        {
            res=(res%M+solve(n-1,k-inv,dp)%M)%M;
        }
        return dp[n][k]=res;
    }
    public int kInversePairs(int n, int k) 
    {
        int[][] dp = new int[n+1][k+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return solve(n,k,dp);  
    }
}