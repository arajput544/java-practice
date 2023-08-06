import java.util.ArrayList;

public class Stack {
    public static class MyStack
    {
        int arr[];
        int cap,top;
        MyStack(int c){
            top=-1;
            cap=c;
            arr=new int[cap];
        }
        void push(int x){
            if (top==cap-1) {System.out.println("Stack is Full"); return;}
            top++;
            arr[top]=x;
        }
        int pop(){
            if (top==-1) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            int res=arr[top];
            top--;
            return res;
        }
        int peek(){
            if (top==-1)
            {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return arr[top];
        }
        int size(){
            return top+1;
        }
        boolean isEmpty()
        {
            return top==-1;

        }
    }
    public static class MyStackArrayList{
        ArrayList<Integer> al=new ArrayList<>();
        int top;
        void push(int x)
        {
            al.add(x);
        }
        int pop()
        {
            int res=al.get(al.size()-1);
            al.remove(al.size()-1);
            return res;
        }
        int peek()
        {
            return al.get(al.size()-1);
        }
        int size(){
            return al.size();
        }
        boolean isEmpty(){
            return al.isEmpty();
        }
    }
    public static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }

    }
    public static class MyStackLinkedList{
        Node head;
        int size;
        MyStackLinkedList()
        {
            head=null;
            size=0;
        }
        int size()
        {
            return size;
        }
        boolean isEmpty()
        {
            return head==null;
            }
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int pop(){
            if (head==null) return Integer.MAX_VALUE;
            int res=head.data;
            head=head.next;
            size--;
            return res;
        }
        int peek(){
            if (head==null) return Integer.MIN_VALUE;
            return head.data;
        }

    }
    public static void main(String[] args) {
//        MyStack s = new MyStack(5);
//        MyStackArrayList s=new MyStackArrayList();
        MyStackLinkedList s=new MyStackLinkedList();
        s.push(5);
        s.push(10);
        s.push(15);
//        s.push(20);
////        s.push(25);
//////        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
