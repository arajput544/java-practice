package com.company;

import java.sql.Array;

public class issorted {
    public static boolean isSorted(int arr[]){
        int res=0;
        int[] newarray= arr.clone();
        for (int i=1; i< newarray.length;i++){
            if(newarray[i-1]>newarray[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr= {12,45,3,4,23,46,46};
        boolean b = isSorted(arr);
        System.out.println(b);



    }

}
