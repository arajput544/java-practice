package Stack_practice;

import java.util.ArrayDeque;

public class greaterelement {
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        ArrayDeque<Integer> st=new ArrayDeque<>();
        int arr[] = new int[n];
        st.push(0);
        arr[0] = -1;
        for(int i=1;i<n;i++){
//            arr[i]=1;
            while(st.isEmpty()==false && price[st.peek()]<= price[i]){
                st.pop();
            }
            arr[i] = st.isEmpty() ? -1: price[st.peek()];
            st.push(i);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] price={12,15,8,3};
        int arr[] =calculateSpan(price, price.length);
        for(Integer i: arr){
            System.out.println(i);
        }

    }
}
