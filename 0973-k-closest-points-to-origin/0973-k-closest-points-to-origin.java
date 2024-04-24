class Solution {
    public class tuple {
        int x;
        int y;
        public tuple(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        
    }
    public int[][] kClosest(int[][] points, int k) 
    {
        List<tuple> al = new ArrayList<>();
        for(int i = 0;i<points.length;i++)
        {
            al.add(new tuple(points[i][0],points[i][1]));
        }
        Comparator<tuple> com = new Comparator<tuple>()
        {
            public int compare(tuple t1,tuple t2)
            {
                int x1=t1.x*t1.x;
                int y1=t1.y*t1.y;
                double dis1 = Math.sqrt(x1+y1);
                int x2=t2.x*t2.x;
                int y2=t2.y*t2.y;
                double dis2 = Math.sqrt(x2+y2);
                if(dis1<dis2)
                    return -1;
                return 1;
                
            }
        };
        Collections.sort(al,com);
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++)
        {
            tuple temp = al.get(i);
            //.remove();
            ans[i][0]=temp.x;
            ans[i][1]=temp.y;
        }
        return ans;
    }
}