class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
       int ct=0;
       int n =nums.length;
        for(int i=0;i<n;i++)
        {
            int pro=1;
            for(int j=i;j<n;j++)
            {
                pro*=nums[j];
                if(pro<k)
                    ct+=1;
                else
                    break;
            }
        }
        return ct;
        
    }
}