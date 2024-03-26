class Solution {
    public int firstMissingPositive(int[] nums) 
    {
        //reference codestorywithmik
        boolean contains=false;
        int n =nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                contains=true;
            }
            if(nums[i]<=0||nums[i]>n)
            {
                nums[i]=1;
            }
        }
        if(!contains)
            return 1;
        for(int i=0;i<nums.length;i++)
        {
            int num=Math.abs(nums[i]);
            int idx=num-1;
            if(nums[idx]<0)
                continue;
            nums[idx]*=-1;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}