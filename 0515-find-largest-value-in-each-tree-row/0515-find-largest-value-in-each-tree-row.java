class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int x=q.size();
           int max=Integer.MIN_VALUE;
            for(int i=0;i<x;i++){
                TreeNode temp=q.poll();
              max=Math.max(max,temp.val);
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
              ans.add(max);
        }
        return ans;
    }
}