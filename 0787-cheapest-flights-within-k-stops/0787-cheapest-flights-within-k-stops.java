class Solution {
    class pair{
        int node;
        int wt;
        pair(int _node,int _wt)
        {
            this.node=_node;
            this.wt=_wt;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k)
    {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<pair>());
        }
        for(int[] a:flights)
        {
            int u=a[0];
            int v=a[1];
            int wt=a[2];
            adj.get(u).add(new pair(v,wt));        
        }
        int[] dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<pair> q = new LinkedList<>();
        int lvl=0;
        dis[src]=0;
        q.offer(new pair(src,0));
        while(!q.isEmpty() && lvl<=k)
        {
            int st=q.size();
            while(st-->0)
            {
                int nd=q.peek().node;
                int w=q.peek().wt;
                q.remove();
                for(pair e:adj.get(nd))
                {
                    int ad_node=e.node;
                    int ed_wt=e.wt;
                    if(w+ed_wt<dis[ad_node])
                    {
                        dis[ad_node]=w+ed_wt;
                        q.offer(new pair(ad_node,dis[ad_node]));
                    }
                }
            }
            lvl++;
        }
        return dis[dst]==Integer.MAX_VALUE?-1:dis[dst];
        // return dis[dst];
        
    }
}