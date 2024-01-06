class Solution {
    public int minOperations(int[] nums, int k) 
    {
        int op=0;
        int res=0;
        for(int e:nums)
        {
            res=res^e;
        }
        for(int i=0;i<32;i++)
        {
            
            int bitval=(1<<i)&res;
            int kbitval=(1<<i)&k;
            if(bitval!=kbitval)
            {
                op+=1;
            }    
        }
        return op;
    }
}