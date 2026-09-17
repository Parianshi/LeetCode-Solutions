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

    public void find(TreeNode root, List<Integer> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(root.val);
        }
        find(root.left,ans);
        find(root.right,ans);
    }

    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        find(root1,a);
        find(root2,b);
        return a.equals(b);
    }
}