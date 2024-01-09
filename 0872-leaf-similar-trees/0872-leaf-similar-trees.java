/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> path1 = new ArrayList<>();
    List<Integer> path2 = new ArrayList<>();
    public void helper(TreeNode root,List<Integer> al)
    {
        if(root==null)
        {
            return ;
        }
        helper(root.left,al);
        if(root.left==null&&root.right==null)
        {
            al.add(root.val);
        }
        helper(root.right,al);
        
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        helper(root1,path1);
        helper(root2,path2);
        if(path1.size()!=path2.size())
            return false;
        for(int i=0;i<path1.size();i++)
        {
            if(path1.get(i)!=path2.get(i))
            {
                return false;
            }
        }
        return true;
    }
}