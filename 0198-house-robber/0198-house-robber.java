class Solution {
    public int f(int idx,int [] nums,int[] dp)
    {
        if(idx==0)
            return nums[idx];
        if(idx<0)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int take=nums[idx]+f(idx-2,nums,dp);
        int not_take=f(idx-1,nums,dp);
        return dp[idx]=Math.max(take,not_take);
    }
    public int rob(int[] nums) 
    {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return f(nums.length-1,nums,dp);
    }
}