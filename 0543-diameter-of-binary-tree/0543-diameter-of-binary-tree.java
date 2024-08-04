class Solution {
    public int diameterOfBinaryTree(TreeNode root) {        
        int arr[]=new int[1];
        height(root, arr);
        return arr[0];
    }
    int height(TreeNode root, int [] diameter){
        if(root==null) return 0;          
        int left = height(root.left, diameter);
        int right = height(root.right, diameter);
        diameter[0] = Math.max(left+right, diameter[0]);
        return 1 + Math.max(left,right);
    }
}