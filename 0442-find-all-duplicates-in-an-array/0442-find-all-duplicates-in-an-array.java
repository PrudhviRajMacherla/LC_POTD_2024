class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> al = new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int e:nums)
        {
            if(st.contains(e))
            {
                al.add(e);
            }
            else
            {
                st.add(e);
            }
        }
        return al;
    }
        
}