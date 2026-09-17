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
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         helper(root);
         return ans;
    }

    public int helper(TreeNode root){
        if(root==null) return 0;

        int l= Math.max(helper(root.left),0);
        int r=Math.max(helper(root.right),0);
        int sum= root.val+l+r;
        ans= Math.max(ans,sum);

        return root.val + Math.max(l,r);
    }
}