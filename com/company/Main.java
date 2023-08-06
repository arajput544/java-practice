package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        int arr[] = new int[]{3, 8, 12, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in the array you want to delete");
        int a = sc.nextInt();
        sc.close();
        int b=0;
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                b = i;
                break;
            }
        }
        System.out.println(b);
        for (int j = b; j < arr.length - 1; j++){
            arr[j]=arr[j+1];

        }
        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
