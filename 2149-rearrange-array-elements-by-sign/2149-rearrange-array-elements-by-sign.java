class Solution {
    public int[] rearrangeArray(int[] nums)
    {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int e:nums)
        {
            if(e<0)
                neg.add(e);
            else
                pos.add(e);
        }
        for(int i=nums.length-1;i>=0;i-=2)
        {
            nums[i]=neg.remove(neg.size()-1);
            nums[i-1]=pos.remove(pos.size()-1);
        }
        return nums;
    }
}