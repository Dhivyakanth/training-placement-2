
class Solution {
    public int maxDepth(TreeNode root) {
         
        if(root==null) return 0;

       int max = Integer.MIN_VALUE;

        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));

        while (!st.isEmpty()) {
            Pair<TreeNode, Integer> pair = st.pop();

            TreeNode curr = pair.getKey();
            int val = pair.getValue();

            max = Math.max(val, max);

            if (curr.left != null) {
                st.add(new Pair<>(curr.left, val + 1));
            }
            if (curr.right != null) {
                st.add(new Pair<>(curr.right, val + 1));
            }

        }
        return max;

        
        
    }

    
}
