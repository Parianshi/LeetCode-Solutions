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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode a=q.poll();
                arr.add(a.val);
                if(a.left!=null) q.add(a.left);
                if(a.right!=null) q.add(a.right);
            }
            ans.add(arr);
        }

        return ans;
        
    }
}