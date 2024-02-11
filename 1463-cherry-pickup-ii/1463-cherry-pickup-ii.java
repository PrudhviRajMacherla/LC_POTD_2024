class Solution {
    public int solve(int row,int robot_i,int robot_j,int[][] grid,int[][][] dp)
    {
        if(robot_i<0||robot_j<0||robot_i>=grid[0].length||robot_j>=grid[0].length)
            return 0;
        if(row==grid.length)
            return 0;
        if(dp[row][robot_i][robot_j]!=-1)
            return dp[row][robot_i][robot_j];
        int res=0;
        res+=grid[row][robot_i];
        if(robot_i!=robot_j)
            res+=grid[row][robot_j];
        int maxForNxtRow=0;
        for(int i=robot_i-1;i<=robot_i+1;i++)
        {
            for(int j=robot_j-1;j<=robot_j+1;j++)
            {
                maxForNxtRow=Math.max(maxForNxtRow,solve(row+1,i,j,grid,dp));
            }
        }
        res+=maxForNxtRow;
        return dp[row][robot_i][robot_j]=res;
    }
    public int cherryPickup(int[][] grid) 
    {
        int n=grid.length;
        int m=grid[0].length;
       
        int[][][] dp = new int[n][m][m];
        for(int[][] vis:dp)
        {
            for(int[] a:vis)
            {
                Arrays.fill(a,-1);
            }
        }
        return solve(0,0,m-1,grid,dp);
        
    }
}