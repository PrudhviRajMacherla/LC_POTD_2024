class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> al =  new ArrayList<>();
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(st.contains(nums[i]))
            {
               al.add(nums[i]); 
            }
            else
            {
                st.add(nums[i]);
            }
        }
        return al;
    }
}