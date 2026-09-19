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
    public int maxLevelSum(TreeNode root) {
        int level=0;
        int maxLevel=1;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        int maxSum=root.val;

        while(!q.isEmpty()){
            int size=q.size();
            
            int sum=0;
        for(int i=0;i<size;i++){
            TreeNode node= q.poll();
            sum+=node.val;
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        level++;
        if(sum>maxSum){
            maxSum=sum;
            maxLevel=level;
        }
        }
        return maxLevel;
    }
}