class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return helper(nums, 0, n-1);
    }

    public TreeNode helper(int []nums,int l,int r){
        if(l>r) return null;
        int mid= (l+r)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left=helper(nums,l,mid-1);
        node.right=helper(nums,mid+1,r);
        return node;
    }
}