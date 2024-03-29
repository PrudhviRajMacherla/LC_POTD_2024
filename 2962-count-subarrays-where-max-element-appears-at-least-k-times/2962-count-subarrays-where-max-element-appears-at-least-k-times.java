class Solution {
    public long countSubarrays(int[] nums, int k) 
    {
        List<Integer> al = new ArrayList<>();
        int maxi=nums[0];
        long ans=0;
        for(int i=1;i<nums.length;i++)
        {
            maxi=Math.max(nums[i],maxi);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==maxi)
                al.add(i);
            if(al.size()>=k)
            {
                int last_idx=al.get(al.size()-k);
                ans+=(last_idx+1);
            }
        }
        return ans;
        
    }
}