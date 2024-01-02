class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] ans = new int[201];
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            ans[val]+=1;
            max=Math.max(ans[val],max);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<max;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int idx=0;idx<ans.length;idx++)
            {
                if(ans[idx]>0)
                {
                    temp.add(idx);
                    ans[idx]-=1;
                }
            }
            res.add(temp);
        }
        return res;
    }
}