class Solution {
    public int max_rob(int[] nums,int idx,int[] dp)
    {
       
        if(idx==0)
            return nums[idx];
        if(idx<0)
        {
            return 0;
        }
         if(dp[idx]!=-1)
            return dp[idx];
        int pick=nums[idx]+max_rob(nums,idx-2,dp);
        int not_pick=max_rob(nums,idx-1,dp);
        return dp[idx]=Math.max(pick,not_pick);
    }
    public int rob(int[] nums) 
    {
        int n = nums.length-1;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = max_rob(nums,n,dp);
        return ans;
    }
}