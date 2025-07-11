class Solution {

    public int minDepth(TreeNode root) {
        if(root==null)  return 0;

        return depth(root);
    }

    public static int depth(TreeNode node){
        if(node==null) return 0; 

        int left = depth(node.left);
        int right = depth(node.right);

        if(left==0 || right==0)
            return 1 + left + right;

        return 1 + Math.min(left,right); 

    }
}
