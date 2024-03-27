class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
       
        if(k<=1)
            return 0;
        int i=0,j=0,n=nums.length,pro=1,ct=0,ans=0;
        while(j<n)
        {
            pro*=nums[j];
            while(pro>=k)
            {
                pro/=nums[i];
                i++;
            }
            ct=(j-i+1);
            ans+=ct;
            j++;
        }
        return ans;
    }
}