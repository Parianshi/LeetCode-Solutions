public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root==null) return false;
        if(root.left==null && root.right==null){
            if(sum==root.val) return true;
        }

        boolean l= hasPathSum(root.left,sum-root.val);
        boolean r= hasPathSum(root.right,sum-root.val);

        return l||r;
    }
}