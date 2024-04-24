class Solution {
    public class tuple implements Comparable<tuple>{
        int x;
        int y;
        public tuple(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(tuple that)
        {
            double d1 = Math.sqrt((this.x*this.x)+(this.y*this.y));
            double d2=  Math.sqrt((that.x*that.x)+(that.y*that.y));
            if(d1<d2)
                return -1;
            return 1;
        }
    }
    public int[][] kClosest(int[][] points, int k) 
    {
        PriorityQueue<tuple> pq = new PriorityQueue<tuple>();
        for(int i = 0;i<points.length;i++)
        {
            pq.add(new tuple(points[i][0],points[i][1]));
        }
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++)
        {
            tuple temp = pq.peek();
            pq.remove();
            ans[i][0]=temp.x;
            ans[i][1]=temp.y;
        }
        return ans;
    }
}