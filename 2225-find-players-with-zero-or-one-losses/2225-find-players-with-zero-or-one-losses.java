class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> win = new TreeSet<>();
        Set<Integer> once_lose = new TreeSet<>();
        Set<Integer> losers = new TreeSet<>();
        for(int[] vis : matches)
        {
            int fi=vis[0];
            int se=vis[1];
            if(!(once_lose.contains(fi)||losers.contains(fi)))
               {
                   win.add(fi);
               }
            if(win.contains(se))
               {
                   win.remove(se);
               }
             if(once_lose.contains(se))
               {
                   once_lose.remove(se);
                   losers.add(se);
               }
               else
               {
                   once_lose.add(se);
               }
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
               temp1.addAll(win);
        ans.add(temp1);
        List<Integer> temp2  = new ArrayList<>();
        Set<Integer> nt = new TreeSet<>();
        for(Integer it: once_lose)
        {
            if(!losers.contains(it))
            {
                nt.add(it);
            }
        }
        temp2.addAll(nt);
        ans.add(temp2);
        //s.add(temp2);
        return ans;
    }
}