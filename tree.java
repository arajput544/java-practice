import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {
    public static class Node{
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
        }
    }
    public static void inorder(Node root){
        if (root!=null){
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    public static void preorder(Node root){
        if (root!=null){
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(Node root){
        if (root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println (root.key);
        }
    }
    public static int heightBT(Node root){
        if (root==null) return 0;
        else {
            return (Math.max(heightBT(root.left),heightBT(root.right))+1);
        }
    }
    public static void printAtK(Node root,int k){
        if (root==null) {
            System.out.println("the root is null");
            return;}
        if (k==0) {System.out.print(root.key+" ");}
        else{
            printAtK(root.left,k--);
            printAtK(root.right,k--);
        }
    }
    public static void levelOrderTraversal(Node root){
        if(root==null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            Node curr=q.poll();
            System.out.print(curr.key+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }


    }
    public static int sizeOfBinary(Node root){
        if (root==null) return 0;
        return sizeOfBinary(root.left) + sizeOfBinary(root.right) + 1;
    }
    public static int maxInBt(Node root){
        if (root==null) return Integer.MIN_VALUE;
        else
        {
            return Math.max(root.key, Math.max(maxInBt(root.left),maxInBt(root.right)));
        }
    }
    public static void iterativeInorder(Node root){
        Stack<Node> st= new Stack<Node>();
        Node curr=root;
        while (curr!=null || st.isEmpty()==false){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            System.out.println(curr.key);
            curr=curr.right;
        }

        }
    public static void iterativePreorderMy(Node root){
        if (root==null) return;
        else {
            Stack<Node> s=new Stack<>();
            Node curr=root;
            while(curr!=null || s.isEmpty()==false){
                while (curr!=null){
                    s.push(curr);
                    System.out.println(curr.key);
                    curr=curr.left;
                }
                curr=s.pop();
                curr=curr.right;
            }
        }
    }
    public static void IterativePreorderGFG(Node root){
        Stack<Node> s=new Stack<>();
//        Node curr=root;
        s.push(root);
        while (s.isEmpty()==false){
            Node curr=s.pop();
            System.out.println(curr.key);
            if (curr.right!=null){
                s.push(curr.right);
            }
            if (curr.left!=null) {
                s.push(curr.left);
            }
        }
    }
    public static void iterativepreorderspaceoptimized(Node root){
        if (root==null) return;
        else
        {
            Stack<Node> s=new Stack<>();
            Node curr=root;
            s.push(root);
            while(s.isEmpty()==false)
            {
                while(curr!=null)
                {
                    System.out.println(curr.key);
                    if (curr.right!=null)
                    {
                        s.push(curr.right);
                    }
                    curr=curr.left;
                }
                curr=s.pop();
            }
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(25);
        root.left.right=new Node(35);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
//        inorder(root);
//        preorder(root);
//        postorder(root);
//        System.out.println(heightBT(root));
//        printAtK(root,1);
//        levelOrderTraversal(root);
//        System.out.println(sizeOfBinary(root));
//        System.out.println(maxInBt(root));
//        iterativeInorder(root);
        iterativePreorderMy(root);
//        iterativepreorderspaceoptimized(root);
    }


}
