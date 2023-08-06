package Pkg;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Pr2 {
    static class Node {
        int data;
        Node left, right;
        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
    static ArrayList<Integer> postOrder(Node root)
    {
        // Your code goes here
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null) return al;
        ArrayDeque<Node> q= new ArrayDeque<>();
        q.push(root);
        while( root.left!=null && root.right!=null){
            root=q.pop();
            q.push(root);
            if(root.right!=null){
                q.push(root.right);
            }
            if(root.left!=null){
                q.push(root.left);
            }
        }
        while(!q.isEmpty()){
            Node curr=q.pop();
            al.add(curr.data);
        }
        return al;
    }
    public static void main(String[] args) {
        Node root= new Node(19);
        root.left = new Node(10);
        root.right = new Node(8);
        root.left.left=new Node(11);
        root.left.right = new Node(13);
        ArrayList<Integer> al= postOrder(root);
        for(int i: al){
            System.out.println(i);
        }
    }
}
