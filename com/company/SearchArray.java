package com.company;

import java.util.Scanner;

public class SearchArray {
    public static void search(int arr[], int n){

        int largest=0;
        for (int j=1; j<arr.length;j++){
            if (arr[largest]<arr[j]){
                largest=j;
            }
        }
        System.out.println(arr[largest]);
    }
    public static void main(String[] args){
        int[] arr={5,44,78,300,90,100,200};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        search(arr,arr.length);
    }
}
