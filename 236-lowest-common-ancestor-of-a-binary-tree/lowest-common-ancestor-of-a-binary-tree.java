/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        check(root,p,q);
        return ans;
    }

    public int check(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return 0;
        int self=0;
        if(root==p || root==q) self=1;
        int l= check(root.left,p,q);
        int r= check(root.right,p,q);
        int sum=l+r+self;
        if(sum==2 && ans==null){
            ans=root; 
        }
        return sum;
    }
}