public class CircularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static void printCircularLinkedList(Node head){
        if (head==null) return;
        System.out.print(head.data +  "->");
        for (Node r=head.next; r!=head;r=r.next){
            System.out.print(r.data+"->");
        }
    }
    public static void printCircularLinkedListDo(Node head){
        if (head==null) return;
        Node temp=head;
        do {
                System.out.println(temp.data);
                temp=temp.next;

        }while(temp!=head);

    }
    public static Node insertAtbeginningCLL(Node head,int x){
        Node temp=new Node(x);
        if (head==null) return temp.next=temp;
        Node r=head;
        do {
            r=r.next;
        }while (r.next!=head);
        temp.next=r.next;
        r.next=temp;
        return temp;
    }
    public static Node insertAtbeginningCLLinBig01(Node head,int x){
        Node temp= new Node(x);
        if (head==null) return temp.next=temp;
        temp.next=head.next;
        head.next=temp;
        int t= temp.data;
        temp.data=head.data;
        head.data=t;
        return head;
    }
    public static Node insertAtEndCLL(Node head, int x){
        Node temp=new Node(x);
        if (head==null) return temp.next=temp;
        Node r=head;
        while (r.next!=head){
            r=r.next;
        }
        temp.next=r.next;
        r.next=temp;
        return temp.next;
    }
    public static Node insertAtEndCLLinBigO1(Node head, int x){
        Node temp= new Node(x);
        if (head==null) return temp.next=temp;
        temp.next=head.next;
        head.next=temp;
        int t= temp.data;
        temp.data=head.data;
        head.data=t;
        return temp;
    }
    public static Node deleteHeadCLL(Node head){
        if (head==null) return null;
        if (head.next==head) return null;
        Node curr=head;
        while (curr.next!=head){
            curr=curr.next;
        }
        curr.next=head.next;
        return curr.next;

    }
    public static Node deleteHeadCLLinO1(Node head){
        if (head==null) return null;
        if (head.next==null) return null;
        Node curr=head;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
    public static Node deletekthnode(Node head,int k){
        if (head==null) return null;
        if (k==1) return deleteHeadCLLinO1(head);
        Node curr=head;
        for (int i=1;i<k-1;i++){
            curr=curr.next;

        }
        curr.next=curr.next.next;
        return head;

    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=head;
        int x=5, k=4;

//        head=insertAtbeginningCLL(head,x);
//        head=insertAtbeginningCLLinBig01(head,x);

//        printCircularLinkedList(head);

//        head=insertAtEndCLL(head,x);
//        head=insertAtEndCLLinBigO1(head,x);
//        head=deleteHeadCLL(head);
//        head=deleteHeadCLLinO1(head);
        head= deletekthnode(head,k);
        printCircularLinkedListDo(head);



    }
}
