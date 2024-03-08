class Solution {
    public int maxFrequencyElements(int[] nums)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        int m_f=0;
        for(int e:nums)
        {
            mp.put(e,mp.getOrDefault(e,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(m_f<e.getValue())
                m_f=e.getValue();
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> e:mp.entrySet())
        {
            if(m_f==e.getValue())
                ans+=m_f;
        }
        return ans;
    }
}