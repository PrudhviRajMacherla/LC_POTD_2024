class Solution {
    public int minFallingPathSum(int[][] matrix) 
    {   //creating anthoer matrix of same dimensions
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] op = new int[row][col];
        for(int i=0;i<col;i++)
            op[0][i]=matrix[0][i];// first row
        for(int i=1;i<row;i++)//remaining row's
        {   
            for(int j=0;j<col;j++)
            {
                int minval=Integer.MAX_VALUE;
                int sum=matrix[i][j];
                for(int shift=-1;shift<=1;shift++)
                {
                    if(j+shift>=0&&j+shift<col)
                    {
                        minval=Math.min(minval,sum+op[i-1][j+shift]);
                    }
                }
                op[i][j]=minval;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<col;i++)
            res=Math.min(res,op[row-1][i]);
        return res;
            
        
    }
}