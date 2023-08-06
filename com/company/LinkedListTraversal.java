package com.company;

public class LinkedListTraversal {
    static class Node{
        int data;
        Node next;
        public Node(int x){
            data=x;
            next=null;
        }
    }
    public static Node insertAtBegining(Node head, int x){
        System.out.println("This is insert at beginning fucntion");
        Node temp = new Node(x);
        temp.next=head;
        return temp;
    }
    public static void printlist(Node head){
        System.out.println("This is printlist function");
        Node curr= head;
        while(curr!=null){
            System.out.println( curr.data+" ");
            curr=curr.next;
        }
    }
    public static Node inserAtEnd(Node head, int x){
        System.out.println("This is Insert at end Function");
        Node temp=new Node(x);
        if (head==null) return temp;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void printrecursive(Node head){
        System.out.println("This is print by recursion function");
        if(head==null){
            return;
        }
        System.out.println(head.data+"  ");
        printrecursive(head.next);
    }
    public static int searchIterative(Node head, int x){
        System.out.println("This is search by iterative function");
        Node curr=head;
        int pos=1;
        while (curr!=null){
            if(x==curr.data){
                return pos;
            }
            else {
                pos=pos+1;
                curr=curr.next;
            }
        }
        return -1;
    }
    public static int searchRecursive(Node head, int x){
        if(head==null){
            return -1;
        }
        if (head.data== x) return 1;
        else {
            int res= searchRecursive(head.next, x);
            if (res== -1) return -1;
            else return (res+1);
        }
    }
    public static Node deleteHead(Node head){
        if(head==null) return null;
        return head.next;
    }
    public static Node deleteTail(Node head){
        if (head==null) return null;
        if (head.next==null) return null;
        Node curr = head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static Node insertAtPosition(Node head, int pos, int x){
        if(head==null) return null;
        Node temp=new Node(x);
        Node curr=head;
        if(pos==1){
            temp.next=head;
            return head;
        }
        if (pos==2){
            temp.next=curr.next;
            curr.next=temp;
            return head;
        }
        for (int i=1;i<=pos-2 && curr!=null; i++){
            curr=curr.next;
        }
        if (curr==null) return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static Node sortedInsert(Node head,int x){
        Node temp= new Node(x);
        if (head==null) return temp;
        if (head.data>x) {
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while (curr.next!=null && curr.next.data<=x  ){
            curr=curr.next;
        }
        temp.next= curr.next;
        curr.next=temp;
        return head;
    }
    public static void printMiddle(Node head){
        if (head==null) return;

        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }

        System.out.println(slow.data);



    }
    public static void printNthnode(Node head, int pos){
        if (head==null) return;
        if (pos==1) System.out.println(head.data);
        Node curr=head;
        for (int i=1;i<pos;i++){
            if (curr.next==null) break;
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    public static void printNthEnd(Node head,int pos){
        if (head==null) return;
        Node first=head, second=head;
        for (int i=0;i<pos;i++){
            if (first==null) return;
            first=first.next;
        }
        while (first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);

    }
    public static Node reverseLinkedList(Node head){
        Node curr=head, prev=null;
        while(curr!=null){
            Node next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void removeDuplicateFromSortedLinkedList(Node head){
        Node curr=head, prev=head;
        while(curr.next!=null && curr!=null) {
            if (curr.data==curr.next.data){
                curr.next=curr.next.next;
            }
            else { curr=curr.next;}
        }
    }
//    public static void removedup(Node head){
//        Node prev = null;
//        Node curr=head;
//        while(curr!=null && curr.next!=null){
//            if(curr.data == curr.next.data){
//                curr.next=curr.next.next;
//            }
//            else{
//                curr=curr.next;
//            }
//        }
//    }
    public static Node reverseLinkedListRecursion(Node head){
        if (head==null || head.next==null) return head;
        Node rest_head= reverseLinkedListRecursion(head.next);
        Node rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }
    public static Node reverseLinkedListRecursion2(Node curr, Node prev){
        if (curr==null) return prev;
        Node next=curr.next;
        curr.next=prev;
        return reverseLinkedListRecursion2(next,curr);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next= new Node(20);
        head.next.next=new Node(20);
        head.next.next.next=new Node(40);
        int x=5;
        int pos=3;
//        head=inserAtEnd(head,x);
//        head=insertAtBegining(head,90);
//        head=insertAtBegining(head,80);
//        head=insertAtBegining(head,70);
//        int pos1=searchRecursive(head, x);
//        System.out.println(pos1);
//        int pos=searchIterative(head,x);
//        System.out.println(pos);
//        head=deleteHead(head);
//        head=deleteTail(head);
        head= insertAtPosition(head, pos,x);
//        head= sortedInse  rt(head,x);
//        printMiddle(head);
//        printlist(head);
//        printrecursive(head);
//        printNthnode(head,pos);
//        printNthEnd(head,pos);
        head= reverseLinkedList(head);
//        head=reverseLinkedListRecursion(head);
        head=reverseLinkedListRecursion2(head,null);
//        removeDuplicateFromSortedLinkedList(head);
        printlist(head);
    }

}
