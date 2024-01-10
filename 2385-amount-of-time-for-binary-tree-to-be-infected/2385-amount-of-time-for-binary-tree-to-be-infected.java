class Solution {
    public int max_tree(TreeNode root)
    { if(root==null)
           return 0;
       return (int)Math.max(root.val,(int)Math.max(max_tree(root.left),max_tree(root.right))); 
    }
    public int bfs(ArrayList<ArrayList<Integer>> al,int start){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis =new boolean[al.size()];
        int time=0;
        q.offer(start-1);
        vis[start-1]=true;
        while(!q.isEmpty())
        {
            int n=q.size();
            time+=1;
            for(int i=0;i<n;i++)
            {
                int curr=q.remove();
                for(Integer it:al.get(curr)){
                    if(vis[it]==false)
                    {
                        q.add(it);
                        vis[it]=true;
                    }
                }
            }
        }
        return time;
    }
    public int amountOfTime(TreeNode root, int start) {
      int max_val= max_tree(root);//finding the maximum value to construct number of arraylist for grapha
      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<max_val;i++)
            graph.add(new ArrayList<>());
      Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty())
      {
          TreeNode temp = q.remove();
          int curr_val = temp.val-1;
          if(temp.left!=null)
          {
              q.offer(temp.left);
              graph.get(curr_val).add(temp.left.val-1);
              graph.get(temp.left.val-1).add(curr_val);
          }
          if(temp.right!=null)
          {
              q.offer(temp.right);
              graph.get(curr_val).add(temp.right.val-1);
              graph.get(temp.right.val-1).add(curr_val);
          }
      }//graph data structure created
        
        return bfs(graph,start)-1;
     
        
      
        
        
        
        
    }
    
}