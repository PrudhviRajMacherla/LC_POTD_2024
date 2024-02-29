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
    public boolean isEvenOddTree(TreeNode root)
    {
        boolean isEven=true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            int prev=Integer.MAX_VALUE;
            if(isEven)
            {
                prev=Integer.MIN_VALUE;
            }
            while(n-->0)
            {
               TreeNode curr=q.poll();
                if(isEven&&(curr.val%2==0||curr.val<=prev))
                    return false;
                if(!isEven&&(curr.val%2!=0||curr.val>=prev))
                    return false;
                prev=curr.val;
                if(curr.left!=null)
                    q.offer(curr.left);
                if(curr.right!=null)
                    q.offer(curr.right);
            }
            isEven=!isEven;
        }
        return true;
    }
}