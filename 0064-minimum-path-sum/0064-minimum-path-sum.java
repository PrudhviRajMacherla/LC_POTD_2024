class Solution {
    public int solve(int row,int col,int[][] grid,int[][] dp)
    {
        if(row==0&&col==0)
            return dp[row][col]=grid[row][col];
        if(row<0||col<0)
            return (int)(1e9);
        if(dp[row][col]!=-1)
            return dp[row][col];
        int up=grid[row][col]+solve(row-1,col,grid,dp);
        int left=grid[row][col]+solve(row,col-1,grid,dp);
        return dp[row][col]=(int)Math.min(up,left);           
    }
    public int minPathSum(int[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];   
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return solve(m-1,n-1,grid,dp);
    }
}