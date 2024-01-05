class Solution {
    public int lengthOfLIS(int[] nums) 
    {
       List<Integer> al = new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            int val=nums[i];
          if(val>al.get(al.size()-1))
            {
               al.add(val); 
            }
            else
            {
                int idx=Collections.binarySearch(al,val);
                if(idx<0)
                {
                    idx=-idx-1;
                }
                al.set(idx,val);
            }
            
            
        }
        return al.size();
    }
}