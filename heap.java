public class heap {
    public static class MinHeap {
        int[] arr;
        int size, cap;

        MinHeap(int c) {
            size = 0;
            cap = c;
            arr = new int[cap];
        }

        int left(int i) {
            return (2 * i + 1);
        }

        int right(int i) {
            return (2 * i + 2);
        }

        int parent(int i) {
            return (i - 1) / 2;
        }
        void insert(int x) {

            if (size == cap) return;
            size++;
            arr[size-1]=x;
            for (int i=size-1;i!=0 && arr[parent(i)]>arr[i];){
                int temp=arr[i];
                arr[i]=arr[parent(i)];
                arr[parent(i)]=temp;
                i=parent(i);
            }


        }
        void minheapify(int i)
        {
            int lt=left(i);
            int rt=right(i);
            int smallest=i;
            if (lt<size && arr[lt] < arr[i])
                smallest=lt;
            if (rt<size && arr[rt]<arr[i])
                smallest=rt;
            if (smallest!=i){
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=arr[temp];
                minheapify(smallest);
            }
        }
        int extractMin(){
            if (size<=0) return Integer.MIN_VALUE;
            if (size==1) {
                size--;
                return arr[0];
            }
            int temp=arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;
            size--;
            minheapify(0);

            return arr[size];

        }
        void decreasekey(int i,int x){
            arr[i]=x;
            while(i!=0 && arr[parent(i)]>arr[i]){
                int temp= arr[i];
                arr[i]=arr[parent(i)];
                arr[parent(i)]=temp;
                i=parent(i);
            }


        }
        void print(){
            for (int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }
        void delete(int i){
            decreasekey(i,Integer.MIN_VALUE);
            extractMin();
        }
        public void buidheap(){
            for (int i=(size-2)/2;i>=0;i--){
                minheapify(i);
            }

        }

    }
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);
        h.insert(3);
        h.insert(2);
        h.insert(23);
        h.insert(20);
        h.insert(4);
        h.insert(5);
        h.print();
        
//        h.delete(2);
//        h.print();
//        h.minheapify(4);
//        h.decreasekey(4,1);
//        h.print();
//        System.out.println(h.extractMin());

    }
}
