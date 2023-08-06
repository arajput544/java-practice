package Pkg;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize {
     public static class TreeNode {
         int val;
        TreeNode left;
          TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static class Codec {
        StringBuilder str = new StringBuilder();
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            l(root);
            return str.toString();
        }
        public void l(TreeNode root){
            if(root==null) return;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                TreeNode curr = q.poll();
                str.append(curr.val);
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            return;


        }


        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.isEmpty()) return null;
            int j=1,i=0;
            TreeNode root=new TreeNode(Character.getNumericValue(data.charAt(i)));
            while(j<data.length()){
                TreeNode curr=new TreeNode(0);
                if(i==0){
                    root = new TreeNode(Character.getNumericValue(data.charAt(i++)));
                }
                else{
                    curr = new TreeNode(Character.getNumericValue(data.charAt(i++)));
                }

                curr.left= new TreeNode(Character.getNumericValue(data.charAt(j++)));
                curr.right = new TreeNode(Character.getNumericValue(data.charAt(j++)));
            }
            return root;

        }
    }

    public static void main(String[] args) {
         Codec ser = new Codec();
         Codec deser = new Codec();
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         root.right.left =new TreeNode(6);
         root.right.right = new TreeNode(7);
         TreeNode ans = deser.deserialize(ser.serialize(root));
    }
}
