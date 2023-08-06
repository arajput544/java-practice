public class DoublyLinkedList {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data=d;
            prev=null;
            next=null;

        }

    }
    public static void printDoublyLinkedList(Node head){
        if (head==null) return;
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static Node insertBegin(int n,Node head){
        Node temp=new Node(n);
        if (head==null) return temp;
        Node curr=head;
        head.prev=temp;
        temp.next=head;
        return temp;
    }
    public static Node insertAtEnd(Node head,int n){
        Node temp=new Node(n);
        if (head==null) return temp;
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;

    }
    public static Node reverseDLL(Node head){
        if (head==null || head.next==null) return head;
        Node curr=head,prev=null;
        while (curr!=null){
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static Node deletehead(Node head){
        if (head==null) return null;
        if (head.next==null) return null;
        head=head.next;
        head.prev=null;
        return head;


    }
    public static Node deletelast(Node head){
        if (head==null) return null;
        if (head.next==null) return null;
        Node curr=head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
        return head;
    }
    public static Node insertBeginCDL(Node head, int n){
        Node temp=new Node(n);
        if (head==null) return temp;
        Node curr=head;
        temp.next=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        head.prev=temp;
        return temp;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
//        Node head=null;
        int n=5;
//        head=insertBegin(n,head);
//        head=insertAtEnd(head,n);

//        head=reverseDLL(head);
//        head=deletehead(head);
//        head=deletelast(head);
        head=insertBeginCDL(head,n);
        printDoublyLinkedList(head);

    }
}
