package Pkg;






public class MaxPath {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
    class Solution {
        int res = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            maxPathSum1(root);
            return res;

        }

        int maxPathSum1(TreeNode root) {
            if(root == null) {
                return 0;
            }

            int l  = maxPathSum1(root.left);
            int r = maxPathSum1(root.right);

            int temp = Math.max(root.val + Math.max(l,r) , root.val);

            int ans = Math.max(temp,root.val + l + r);
            res  = Math.max(res,ans);
            return temp;
        }
    }

    public static void main(String[] args) {

    }
}
