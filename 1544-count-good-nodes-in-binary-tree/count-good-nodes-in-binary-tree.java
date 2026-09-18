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
     int count=0;
    public int goodNodes(TreeNode root) {
        int max=root.val;
        return helper(root,max);
    }

    public int helper(TreeNode root, int max){
        if(root==null) return 0;
        if(root.val>=max) count++;
        int newMax= Math.max(max, root.val);
        helper(root.left,newMax);
        helper(root.right, newMax);

        return count;
    }
}