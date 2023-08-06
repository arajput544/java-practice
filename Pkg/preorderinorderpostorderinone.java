package Pkg;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class preorderinorderpostorderinone {
    public static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public static class Pair{
        Node node;
        int status;
        Pair(Node node,int status){
            this.node=node;
            this.status=status;
        }
    }
    public static void allTraversal(Node root){
        if(root==null) return;
        ArrayList<Integer> pre= new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post=new ArrayList<>();

        ArrayDeque<Pair> st=new ArrayDeque<>();

        st.push(new Pair(root,1));
        while(!st.isEmpty()){
            Pair p=st.peek();
            if(p.status==1){
                pre.add(p.node.data);
                p.status++;

                if(p.node.left!=null){
                    st.push(new Pair(p.node.left,1));

                }
            }
            else if(p.status==2){
                in.add(p.node.data);
                p.status++;
                if(p.node.right!=null){
                    st.push(new Pair(p.node.right,1));
                }
            }
            else{
                post.add(p.node.data);
                st.pop();
            }
        }
        System.out.print("Preorder Traversal: ");
        for (int i : pre) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing Inorder
        System.out.print("Inorder Traversal: ");
        for (int i : in) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing Postorder
        System.out.print("Postorder Traversal: ");
        for (int i : post) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        allTraversal(root);
    }
}
