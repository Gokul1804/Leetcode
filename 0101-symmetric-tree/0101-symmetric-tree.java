class Solution {
    public boolean isSymmetric(TreeNode root) {
        boolean ans = isSame(root.left,root.right);
        return ans;
    }
    public boolean isSame(TreeNode p,TreeNode q){
        if(p==null||q==null){
            return p==q;
        }
        return (p.val==q.val)&&isSame(p.left,q.right)&&isSame(p.right,q.left);
    }
}