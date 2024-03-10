class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> st1= new HashSet<>();
        for(int e:nums1)
        {
            st1.add(e);
        }
        Set<Integer> st2 = new HashSet<>();
        for(int e:nums2)
        {
            st2.add(e);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:st1)
        {
            if(st2.contains(i))
            {
                arr.add(i);
            }
        }
        int[] result = arr.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}