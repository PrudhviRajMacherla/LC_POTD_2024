class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int bit=0;bit<=31;bit++)
        {
            int temp=(1<<bit);
            int ctones=0;
            for(int e:nums)
            {
                if((e&temp)!=0)
                {
                    ctones++;
                }
            }
             if((ctones%3)==1)
                {
                    res=(res|temp);
                }
        }

        return res;
    }
}