class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
        TreeSet<Integer> st1= new TreeSet<>();
        for(int i:nums1)
            st1.add(i);
        TreeSet<Integer> st2= new TreeSet<>();
          for(int i:nums2)
            st2.add(i);
       
      
        for(int e:st1)
        {
            if(st2.contains(e))
                return e;
        }
        return -1;
    }
}