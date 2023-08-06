
public class Queue {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }

    }
    public static class QueueLL{
        Node front,rear;
        int size;
        QueueLL(){
            front=rear=null;
        }
        void enqueue(int x){
            size++;
        Node temp=new Node(x);
        if (front ==null){
            front =rear=temp;
        }
        rear.next=temp;
        rear=temp;
        }
        void dequeue(){

            if (front==null) return;
            size--;
            front=front.next;
            if (front==null) rear=null;
        }
        int getSize(){
            return size;
        }
        int getfront(){
            return front.data;
        }
        int getrear(){
            return rear.data;
        }


    }
    public  static class QueueA{
        int[] array;
        int size,cap;

        QueueA(int c){
            cap=c;
            size=0;
            array = new int[cap];
        }
        boolean isFull(){
            return size==cap;
        }
        boolean isEmpty(){
            return size==0;
        }
        void enqueue(int x){
            if (isFull()) return;
            array[size]=x;
            size++;
        }
        void dequeue(){
            if (isEmpty()) return;
            for (int i=0;i<size-1;i++){
                array[i]=array[i+1];
            }
            size--;
        }
        int getFront(){
            if (isEmpty()) return -1;
            return array[0];
        }
        int getRear(){
            if (isEmpty()) return -1;
            return array[size-1];
         }

            }

    public static class QueueCA{
//        int front,rear,cap,size;
//        int arr[];
//        QueueCA(int c){
////            arr=new int[c];
////            cap=c;
////            front=0;
////            size=0;
////        }
////        boolean isFull(){
////            return cap==size;
////        }
////        boolean isEmpty(){
////            return size==0;
////        }
////        int getFront(){
////            if (isEmpty()) return -1;
////            return front;
////        }
////        int getRear(){
////            if (isEmpty()) return -1;
////            else
////                return (front+rear-1)%cap;
////        }
////
////
////        void enqueue(int x){
////            if (isFull()) return;
////            int rear=getRear();
////            rear=(rear+1)%cap;
////            arr[rear]=x;
////            size++;
////
////
////        }
////        void dequeue(){
////            if (isEmpty()) return;
////            front=(front+1)%cap;
////            size--;
////        }
        int front, rear,cap,size;
        int array[];
        QueueCA(int c){
            array=new int[c];
            cap = c;
            front = 0;
            size=0;
        }
        boolean isFull(){
            return cap==size;
        }
        boolean isEmpty(){
            return size==0;
        }
        int getFront(){
            if(isEmpty()) return -1;
            return front;

        }
        int getRear(){
            if (isEmpty()) return -1;
            return (front+size-1)%cap;
        }
        void enqueue(int x){
            if(isFull()) return;
            int rear = getRear();
            rear=(rear+1)%cap;
            array[rear] = x;
            size++;
        }
        void  dequeue() {
            if (isEmpty()) return;
            front = (front +1)%cap;
            size--;


        }

    }
    public static void main(String[] args) {
//        QueueLL q=new QueueLL();
        QueueCA q= new QueueCA(4);
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
//        System.out.println(q.getSize());
        System.out.println(q.getFront());
        System.out.println(q.getRear());

    }
}
