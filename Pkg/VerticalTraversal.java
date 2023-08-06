package Pkg;

import com.sun.source.tree.Tree;

import java.util.*;

public  class VerticalTraversal {
     public static class TreeNode {
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
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    static TreeMap<Integer, PriorityQueue<Integer>> tm = new TreeMap<>();

    public static void helper(TreeNode node,int level){
        if(node==null) return;
//        System.out.println(node.val + " "+level);
        Pair p = new Pair(node,level);
        if(!tm.containsKey(p.level)){
            PriorityQueue<Integer> al = new PriorityQueue<>();
            al.add(p.node.val);
            tm.put(p.level,al);
            System.out.println(tm.get(p.level));
        }
        else{
            tm.get(p.level).add(p.node.val);
            System.out.println(tm.get(p.level));
        }
        int l = p.level;
        helper(node.left,--l);
        int a=p.level;
        helper(node.right,++a);
    }
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        helper(root,0);
        for(Map.Entry<Integer,PriorityQueue<Integer>> e:tm.entrySet()){
            System.out.println(e.getKey() +" "+ e.getValue());
        }
        for(Map.Entry<Integer,PriorityQueue<Integer>> e:tm.entrySet()){
            List<Integer> p = new ArrayList<>(e.getValue());
            ans.add(p);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left= new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right= new TreeNode(7);

        List<List<Integer>> ans = verticalTraversal(root);
        for(List<Integer> al : ans){
            for(Integer i:al){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
