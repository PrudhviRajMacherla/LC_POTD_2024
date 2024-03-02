class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int[] ans = new int[nums.length];
        int l=0;
        int h=nums.length-1;
        int idx=h;
        while(l<=h)
        {
            int lval=nums[l]*nums[l];
            int rval=nums[h]*nums[h];
            if(lval>rval)
            {
                ans[idx]=lval;
                idx--;
                l++;
            }
            else
            {
                ans[idx]=rval;
                idx--;
                h--;
            }
        }
        return ans;
    }
}