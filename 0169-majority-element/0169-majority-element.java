class Solution {
    public int majorityElement(int[] nums) 
    {
        int ct=1;
        int ele=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==ele)
            {
                ct+=1;
            }
            else if(nums[i]!=ele)
            {
                ct-=1;
            }
            if(ct==0)
            {
                ct=1;
                ele=nums[i];
            }
        }
        return ele;
    }
}