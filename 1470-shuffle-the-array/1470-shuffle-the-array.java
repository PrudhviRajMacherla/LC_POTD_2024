class Solution {
    
    public int[] shuffle(int[] nums, int n)
    {
       List<Integer> al = new ArrayList<Integer>();
        int[] ans = new int[n*2];
        for(int i=0;i<n;i++)
        {
            al.add(nums[i]);
            al.add(nums[i+n]);
        }
        for(int i=0;i<n*2;i++)
        {
            ans[i]=al.get(i);
        }
        return ans;
    }
}