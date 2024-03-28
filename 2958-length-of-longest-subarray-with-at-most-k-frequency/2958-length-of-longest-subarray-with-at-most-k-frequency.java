class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        int i=0,j=0,n=nums.length,maxi=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(j<n)
        {
            while(j<n && mp.getOrDefault(nums[j],0)<k)
            {
                mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
                maxi=Math.max(j-i+1,maxi);
                j++;
            }
            mp.put(nums[i],mp.get(nums[i])-1);
            i++;
        }
        return maxi;
    }
}