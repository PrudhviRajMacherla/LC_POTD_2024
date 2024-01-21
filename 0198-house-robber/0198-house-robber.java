class Solution
{
    public int rob(int[] nums)
    {
       int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int take=nums[i];
            if(i-2>=0)
                take+=dp[i-2];
            int no_take=0;
            if(i-1>=0)
                no_take+=dp[i-1];
            dp[i]=Math.max(take,no_take);
        }
        return dp[nums.length-1];
    }
}