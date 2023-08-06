public class Dequeue {
    public static class dequeueEff{
        int front,rear,cap,size;
        int arr[];
        dequeueEff(int c){
            front=0;
            cap=c;
            size=0;
            arr=new int[cap];
        }
        boolean isEmpty(){
            return  (size==0);
        }
        boolean isFull(){
              return size==cap;
        }
        void insertAtRear(int x){
            if (isFull()) return;
            else {
                rear=(rear+1)%cap;
                arr[rear]=x;
                size++;
            }
        }
        void deleteAtRear(){
            if (isEmpty()) return;
            else {
                rear=(rear-1+cap)%cap;
                size--;
            }
        }
        void insertAtFront(int x){
            if (isFull()) return;
            else
            {
                front=(front-1+cap)%cap;
                arr[front]=x;
                size++;
            }
        }
        void deleteAtFront(){
            if (isEmpty()) return;
            else{
                front=(front+1)%cap;
                size--;
            }
        }
        void showRear(){
            if (isEmpty()) return;
            rear=(front+size-1)%cap;
            System.out.println(arr[rear]);
        }
        void showFront(){
            System.out.println(arr[front]);
        }


    }
    public static class dequeue{
        int cap,size;
        int arr[];
        dequeue(int c){
            cap=c;
            size=0;
            arr=new int[cap];
        }
        boolean isEmpty(){
            return  (size==0);
        }
        boolean isFull(){
            return size==cap;
        }
        void insertAtRear(int x){
            if (isFull()) return;
            else {
                arr[size]=x;
                size++;
            }
        }
        void deleteAtRear(){
            if (isEmpty()) return;
            else {
                size--;
            }
        }
        void insertAtFront(int x){
            if (isFull()) return;
            else if(isEmpty()){
                arr[0]=x;
                size++;
            }
            else
            {
                for (int i=size-1;i>=0;i--){
                    arr[i+1]=arr[i];
                }
                arr[0]=x;
                size++;
            }
        }
        void deleteAtFront()
        {
            if (isEmpty()) return;
            else{
                for (int i=0;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
                size--;
            }
        }
        void showRear(){
            System.out.println(arr[size-1]);
        }
        void showFront(){
            System.out.println(arr[0]);
        }


    }
    public static void main(String[] args) {
//        dequeue dq=new dequeue(5);
        dequeueEff dq=new dequeueEff(5);
        dq.insertAtFront(2);
        dq.insertAtFront(3);
        dq.insertAtRear(5);
        dq.insertAtFront(4);
        dq.deleteAtRear();
        dq.deleteAtFront();

        dq.showFront();
        dq.showRear();


    }
}
