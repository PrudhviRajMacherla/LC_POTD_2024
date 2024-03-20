class Solution {
    public void issol(int[] a,int[] b,List<List<Integer>> ans)
    {
        Set<Integer> st1 = new HashSet<>();
        for(int e:b)
            st1.add(e);
        Set<Integer> st2= new HashSet<>();
        for(int e:a)
            st2.add(e);
        List<Integer> al = new ArrayList<>();
        for(Integer it:st1)
        {
            if(!st2.contains(it))
                al.add(it);
        }
        
        ans.add(al);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<List<Integer>> ans = new ArrayList<>();
       issol(nums2,nums1,ans);
       issol(nums1,nums2,ans);
       return ans;
    }
}