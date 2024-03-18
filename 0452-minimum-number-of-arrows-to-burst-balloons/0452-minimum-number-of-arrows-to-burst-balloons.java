class Solution {
    public int findMinArrowShots(int[][] points)
    {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int arrows=1;
        int[] prev=points[0];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>prev[1])
            {
                arrows+=1;
                prev=points[i];
            }
        }
        return arrows;
    }
}