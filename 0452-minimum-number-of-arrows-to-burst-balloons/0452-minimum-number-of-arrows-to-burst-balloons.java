class Solution {
    public int findMinArrowShots(int[][] points)
    {
       //reference codestory with mik sort them based on starting position
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
       int arrows=1;
       int[] prev = points[0];
 
       for(int i=1;i<points.length;i++)
       {
           int currStart=points[i][0];
           int currEnd=points[i][1];
           //we have mentioned here prevStart and prevEnd bcoz we always update prev[0] and prev[1] 
           int prevStart=prev[0];
           int prevEnd=prev[1];
           //non-overlapping
           if(currStart>prevEnd)
           {
               arrows+=1;
               prev=points[i];
           }//over-lapping
           else
           {
              prev[0]=Math.max(currStart,prevStart);
              prev[1]=Math.min(currEnd,prevEnd);
           }
       }
       return arrows;
    }
}