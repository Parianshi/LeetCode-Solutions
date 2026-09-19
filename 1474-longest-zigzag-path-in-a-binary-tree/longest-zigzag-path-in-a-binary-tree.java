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
    public int longestZigZag(TreeNode root) {
        // if(root==null) return 0;
        helper(root,true,0);
        helper(root,false,0);
        return count;
    }

    public void helper(TreeNode root, boolean left,int len){
        if(root==null) return;
        count=Math.max(count,len);
        if(left){
            helper(root.left,false,len+1);
            helper(root.right,true,1);
        }
        else {
            helper(root.right,true,len+1);
            helper(root.left,false,1);
        }
    }
}