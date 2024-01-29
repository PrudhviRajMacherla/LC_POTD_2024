class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        int ans=0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int cs=0;//curr_sum
        for(int i=0;i<nums.length;i++)
        {
            cs+=nums[i];
            int rsum=cs-k;
            if(mp.containsKey(rsum))
            {
                ans+=mp.get(rsum);
            }
             mp.put(cs,mp.getOrDefault(cs,0)+1);
        }
        return ans;
    }
}