class Solution {
    public int equalPairs(int[][] grid) 
    {
        int n = grid.length;
        Map<String,Integer> ro= new HashMap<>();
        for(int r=0;r<n;r++)
        {
            StringBuilder sb = new StringBuilder();
            for(int c=0;c<n;c++)

            {
                sb.append(grid[r][c]+"_");
            }
            String temp = sb.toString();
            ro.put(temp,ro.getOrDefault(temp,0)+1);
        }
        Map<String,Integer> co= new HashMap<>();
        for(int c=0;c<n;c++)
        {
            StringBuilder sb = new StringBuilder();
            for(int r=0;r<n;r++)
            {
                sb.append(grid[r][c]+"_");
            }
            String temp = sb.toString();
            co.put(temp,co.getOrDefault(temp,0)+1);
        }
        int ct=0;
        for(String s:ro.keySet())
        {
            if(co.containsKey(s))
            {
               int val=ro.get(s)*co.get(s);
               ct+=val;
            }
        }
        return ct;
        
    }
}