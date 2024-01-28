class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int row=0;row<m;row++)
        {
            for(int col=1;col<n;col++)
            {
                matrix[row][col]+=matrix[row][col-1];
            }
        }
        int ans=0;
        for(int colstart=0;colstart<n;colstart++)
        {
            for(int colend=colstart;colend<n;colend++)
            {
                for(int rowstart=0;rowstart<m;rowstart++)
                {
                    int sum=0;
                    for(int rowend=rowstart;rowend<m;rowend++)
                    {
                        sum+=matrix[rowend][colend]-(colstart>0?matrix[rowend][colstart-1]:0);
                        if(sum==target)
                        {
                            ans+=1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}