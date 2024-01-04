class Solution {
    public int[] singleNumber(int[] nums) {
        //brute force approach
        Map<Integer,Integer> mp =new HashMap<>();
        for(int e:nums)
        {
            mp.put(e,mp.getOrDefault(e,0)+1);
        }
        int[] ans = new int[2];
        int i=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            if(entry.getValue()==1)
            {
                ans[i++]=entry.getKey();
            }
        }
        return ans;
    }
}