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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
     List<List<Integer>> ans = new ArrayList<>();
     List<Integer> path= new ArrayList<>();
     find(root,0,path, targetSum, ans);
     return ans;   
    }

    public void find(TreeNode root,int sum, List<Integer> path, int targetSum, List<List<Integer>> ans){

        if(root==null) return;
        sum += root.val;
        path.add(root.val);
        if(root.left==null && root.right==null && sum== targetSum){
            ans.add(new ArrayList<>(path));
        }
        find(root.left,sum,path,targetSum,ans);
        find(root.right,sum,path,targetSum,ans);
        
        path.remove(path.size()-1);
    }
}