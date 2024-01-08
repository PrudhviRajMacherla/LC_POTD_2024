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
    public int helper(TreeNode root,int low,int high,int[] sum)
    {
        if(root==null)
        {
            return 0;
        }
        helper(root.left,low,high,sum);
        if(root.val>=low&&root.val<=high)
        {
            sum[0]+=root.val;
        }
        helper(root.right,low,high,sum);
        return 0;
        
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
        {
            return 0;
        }
        int[] sum = new int[1];
        helper(root,low,high,sum);
        return sum[0];
        
    }
}