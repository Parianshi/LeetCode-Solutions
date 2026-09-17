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
    int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx= postorder.length-1;
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<inorder.length;i++)
               mp.put(inorder[i],i);
        return helper(postorder,0,postorder.length-1,mp);
    }

    public TreeNode helper(int[] postorder, int start,int end, HashMap<Integer,Integer> mp){
        if(start>end) return null;
        int root= postorder[idx--];
        TreeNode node= new TreeNode(root);
        int inidx= mp.get(root);
        node.right= helper(postorder,inidx+1,end,mp);
        node.left= helper(postorder,start,inidx-1,mp);
        

        return node;
    }
}