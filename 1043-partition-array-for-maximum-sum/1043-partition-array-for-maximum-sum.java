class Solution {
    public int solve(int i,int[] arr,int k,int[] memo,int n)
    {
        if(i>=n)
            return 0;
        if(memo[i]!=-1)
            return memo[i];
        int res=0;
        int curr_max=-1;
        for(int j=i;j<n&&(j-i+1)<=k;j++)
        {
            curr_max=Math.max(curr_max,arr[j]);
            res=Math.max(res,(curr_max*(j-i+1))+solve(j+1,arr,k,memo,n));
        }
 return memo[i]=res;
        
    }
    public int maxSumAfterPartitioning(int[] arr, int k)
    {
        int n=arr.length;
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);
        return solve(0,arr,k,memo,n);
    }
}