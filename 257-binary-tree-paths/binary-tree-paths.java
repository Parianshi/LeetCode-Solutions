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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,"",list);
        return list;
    }

    public void helper(TreeNode root, String path, List<String> list){
        if(root==null) return;
        path = path+root.val;
        if(root.left==null && root.right==null){
            list.add(path);
        }
        helper(root.left,path+"->",list);
        helper(root.right,path+"->",list);
    }
}