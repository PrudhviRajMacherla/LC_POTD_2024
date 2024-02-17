class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<heights.length-1;i++)
        {
            int jumpLen=heights[i+1]-heights[i];
            if(jumpLen>0)
            {
                pq.add(jumpLen);
            }
            if(pq.size()>ladders)
            {
                bricks-=pq.remove();
            }
            if(bricks<0)
                return i;
        }
        return heights.length-1;
    }
}