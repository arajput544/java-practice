public class BST {
    public static class Node{
        int key;
        Node left;
        Node right;
        Node(int k){
            key=k;
            left=right=null;
        }
    }
    public static boolean searchBSTiterative(Node root, int x){
        Node curr=root;
        while(curr!=null){
            if(curr.key==x){
                return true;
            }
            else if (curr.key>x){
                curr=curr.left;
            }
            else if (curr.key<x){
                curr=curr.right;
            }
        }
        return false;
    }
    public static boolean searchbstrecursive(Node root, int x){
        Node curr=root;
        while(curr!=null){
            if (curr.key==x){
                return true;
            }
            else if(curr.key>x){
                return searchbstrecursive(curr.left,x);

            }
            else {
                return searchbstrecursive(curr.right,x);
            }

        }
        return false;

    }
    public static Node insertBT(Node root,int x){
        Node temp=new Node(x);
        if (root==null) {root=temp;}
        Node curr=root,parent=null;
        while (curr!=null) {
            parent=curr;
            if (curr.key == x) {
                return root;
            } else if (curr.key > x) {
                curr=curr.left;
            } else {
                curr=curr.right;
            }
        }
        if(parent==null) return temp;
        if (parent.key>x){
            parent.left=temp;
        }
        else{
            parent.right=temp;
        }
        return root;



    }
    public static void inorder(Node root){
        if (root==null) return;
        else {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    public static Node insertBTRecursive(Node root,int x){
        if (root==null) return new Node(x);
        else {
            if (root.key>x)
            {
                root.left=insertBTRecursive(root.left,x);
            }
            else
            {
                root.right=insertBTRecursive(root.right,x);
            }
        }
        return root;
    }
    public static Node successor(Node root){
        Node curr=root.right;
        while (curr!=null&&curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
    public static Node BstDeletion(Node root,int x){
        if (root==null) return null;
        if (root.key>x){
            root.left=BstDeletion(root.left,x);
        }
        else if (root.key<x){
            root.right=BstDeletion(root.right,x);
        }
        else {
            if (root.left==null) return root.right;
            else if (root.right==null) return root.left;
            else
            {
                Node succ=successor(root);
                root.key=succ.key;
                root.right=BstDeletion(root.right,succ.key);

            }

        }
        return root;
    }
    public static Node floorBstbyme(Node root,int x) {
        if (root == null) return null;
        Node curr = root, parent = null ,floor=null;
        while (curr != null) {
            parent=curr;
            if (curr.key>x){
                curr=curr.left;
            }
            else if (curr.key<x){
                floor=curr;
                curr=curr.right;
            }
        }
        if (parent.key<x){
            return parent;
        }
        else {
            if (floor.key<x){
                return floor;
            }
            else {
                return null;
            }
        }

    }
    public static Node floorGFG(Node root,int x){
        Node res=null;
        while (root!=null){
            if (root.key==x) return root;
            else if(root.key>x){
                root=root.left;
            }
            else
            {
                res=root;
                root=root.right;
            }
        }
        return res;
    }
    public static Node ceilBst(Node root,int x){
        Node res=null;
        while(root!=null){
            if (root.key==x) return root;
            else if(root.key>x){
                res=root;
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(15);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.right=new Node(20);
        root.right.left=new Node(18);
        root.right.left.left=new Node(16);
        root.right.right=new Node(80);
//        System.out.println(searchBSTiterative(root,4));
//        System.out.println(searchbstrecursive(root,0));
//        root=insertBT(root,45);
//        root=insertBTRecursive(root,45);
//        root=BstDeletion(root,15);

//        inorder(root);
//        Node temp=floorBstbyme(root,17);
//        Node temp=floorGFG(root,15);
        Node temp=ceilBst(root,2);
        System.out.println(temp.key);
    }
}
