class Solution {
    public int minOperations(int[] nums)
    {
        Map<Integer,Integer> mp  = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            if(mp.containsKey(val))
            {
                mp.put(val,mp.get(val)+1);
            }
            else
            {
                mp.put(val,1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> m:mp.entrySet())
        {
            if(m.getValue()==1)
            {
                return -1;
            }
            ans=ans+(int)(Math.ceil(m.getValue()/3.0));
        }
        return ans;
    }
}