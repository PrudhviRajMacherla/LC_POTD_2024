class Solution {
    public int solve(int row,int col,int[][] grid,int[][] dp)
    {
        if(row>=0&&col>=0&&grid[row][col]==1)
        {
            return dp[row][col]=0;
        }
        if(row==0&&col==0)
        {
            return dp[row][col]=1;
        }
        if(row<0||col<0)
        {
            return 0;
        }
        if(dp[row][col]!=-1)
            return dp[row][col];
        int up=solve(row-1,col,grid,dp);
        int left=solve(row,col-1,grid,dp);
      return dp[row][col]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return solve(m-1,n-1,obstacleGrid,dp);
    }
}