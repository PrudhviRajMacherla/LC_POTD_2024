class Solution {
    static class Row implements Comparable<Row>
    {
        int val;
        int idx;
        Row(int v,int i)
        {
            this.val=v;
            this.idx=i;
        }
        public int compareTo(Row that)
        {
            if(this.val==that.val)
            {
                return this.idx-that.idx;
            }
            return that.val-this.val;
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<Row> pq = new PriorityQueue<Row>();
        for(int i=0;i<k-1;i++)
        {
            pq.add(new Row(nums[i],i));
        }
        for(int i=k-1;i<n;i++)
        {
            pq.add(new Row(nums[i],i));//adding 
            while(pq.size()>=k)
            {
                Row temp = pq.peek();
                int t_idx=temp.idx;
                int t_val=temp.val;
                if((t_idx<=i)&&(t_idx>(i-k)))
                {
                    ans[i+1-k]=t_val;  
                    break;
                }
                else
                    pq.remove();
            }
        }
        return ans;
        
    }
}