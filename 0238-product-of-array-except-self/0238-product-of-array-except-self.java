class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre= new int[n];
        int[] suf= new int[n];
        int[] ans= new int[n];
        //step-1 perfrom prefix pro
        pre[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=nums[i]*pre[i-1];
        }
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--)
        {
            suf[i]=suf[i+1]*nums[i];
        }
        ans[0]=suf[1];
        ans[n-1]=pre[n-2];
        for(int i=1;i<n-1;i++)
        {
            ans[i]=pre[i-1]*suf[i+1];
        }
        return ans;
    }
}