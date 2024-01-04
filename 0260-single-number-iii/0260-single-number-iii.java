class Solution {
    public int[] singleNumber(int[] nums) 
    {
        int xor=0;
        for(int e:nums)
        {
            xor^=e;
        }
        int rsb=xor&(-xor);
        int x=0,y=0;
        for(int e:nums)
        {
            if((e&rsb)==0)
            {
                x=x^e;
            }
            else
            {
                y=y^e;
            }
        }
        return new int[]{x,y};
    }
}