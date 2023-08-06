package com.company;

public class SecondLargest {
    public static void leftrotatebyd(int[] arr,int d){
        int[] temp= new int[d];
        for (int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int j=d;j<arr.length;j++){
            arr[j-d]=arr[j];
        }
        for (int k=0;k<d;k++){
            arr[arr.length-d+k]=temp[k];

        }


    }
    public static void leftRotate(int[] arr){
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){

                arr[i-1]=arr[i];


        }
        arr[arr.length-1]=temp;
    }
    public static int removeDuplicate(int[] arr){

        int res=1;
        for (int i=0;i<arr.length;i++){
            if(arr[res-1]!=arr[i]){
                arr[res]=arr[i];
                res++;
            }

        }
        return res;


    }
    public static int largest(int[] arr) {
        int res=0;
        for (int i=1; i<arr.length;i++){
            if (arr[i]>arr[res]){
                res=i;
            }
        }
        return res;
    }

    public static int secondLargest(int[] arr) {
        int l=largest(arr);
        int sl=-1;
        for (int i=0; i<arr.length;i++){
            if (arr[i]!=arr[l]){
                if(sl==-1){
                    sl=i;
                }
                if (arr[sl]<arr[i]){
                    sl=i;

                }

            }
        }
        return sl;


    }
    public static int optimalSecondLargest(int[] arr){
        int res=-1, largest=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }
            else if (arr[i]!=arr[largest]){
                if (res==-1||arr[i]>arr[res]){
                    res=i;
                }
            }
        }
        return res;
    }
    public static void reverse(int arr[]){
        int low=0,high=(arr.length)-1;
        while (low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        int[] arr= {1,1,2,3,4,5};
//        leftrotatebyd(arr,2);
//        leftRotate(arr);
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
        int res=removeDuplicate(arr);
        for (int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
////        reverse(arr);
//        int sl=secondLargest(arr);
//        int s2= optimalSecondLargest(arr);
//        System.out.println(arr[sl]);
//        System.out.println(arr[s2]);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }

    }
}
