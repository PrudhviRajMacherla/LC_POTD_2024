class Solution {
    int[] rc={0,1,0,-1};
    int[] cc={1,0,-1,0};
    
    public boolean solve(int idx,char[][] board,String word,boolean[][] vis,int row,int col)
    {
        if(idx==word.length()-1)
            return true;
        vis[row][col]=true;//visiting 
        int n=vis.length;
        int m=vis[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=row+rc[i];
            int ncol=col+cc[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==false && word.charAt(idx+1)==board[nrow][ncol])
            {
                if(solve(idx+1,board,word,vis,nrow,ncol)==true)
                    return true;
            }
        }
        vis[row][col]=false;//unvisiting
        return false;
    }
    public boolean exist(char[][] board, String word)
    {
        int n=board.length;
        int m=board[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((board[i][j]==word.charAt(0)) && solve(0,board,word,vis,i,j) )
                {
                   
                        return true;
                }
            }
        }
        return false;
    }
    
}