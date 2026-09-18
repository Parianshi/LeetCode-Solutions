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
    int diff=-1;
    public int maxAncestorDiff(TreeNode root) {
        helper(root,root.val,root.val);
        return diff;
    }

    public int helper(TreeNode root, int min,int max){
        if(root==null) return 0;
        max= Math.max(max,root.val);
        min = Math.min(min,root.val);
       
        int left = helper(root.left,min,max);
        int right = helper(root.right,min,max);
        diff=Math.max(diff,max-min);

        return Math.max(left,right);
    }
}