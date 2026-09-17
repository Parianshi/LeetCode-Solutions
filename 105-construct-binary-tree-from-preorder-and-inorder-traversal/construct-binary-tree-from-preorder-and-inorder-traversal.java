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
    int idx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }

    public TreeNode helper(int []preorder,int []inorder,int start,int end){
        if(start>end) return null;

        int root=preorder[idx++];
        TreeNode node= new TreeNode(root);
        int inorderidx= findIdx(inorder,root);

        node.left= helper(preorder,inorder,start,inorderidx-1);
        node.right= helper(preorder,inorder,inorderidx+1,end);

        return node;
    }

    public int findIdx(int []inorder, int key){
        int n=inorder.length;
        for(int i=0;i<n;i++)
        if(inorder[i]==key) return i;
        return -1;
    }
}