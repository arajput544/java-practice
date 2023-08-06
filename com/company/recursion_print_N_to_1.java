package com.company;

import java.util.Scanner;

public class recursion_print_N_to_1 {
    public static Boolean palindrome(String[] st,int a, int b){
        if (b<=a){
            return true;
        }

        return (st[a]==st[b]) && palindrome(st,a+1,b-1);

    }

    public static int sumOfNaturalNumbers(int n){

        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNumbers(n-1);

    }
    public static void printN(int n){
        if(n==0){
//            System.out.println(n);
            return;
        }
        System.out.println(n);
        printN(n-1);
    }
    public static void print1(int n){
        if(n==0){
//            System.out.println(n);
            return;
        }
        print1(n-1);
        System.out.println(n);

    }
    public static void printSubsets(String str, String curr,int index){
        if(index==str.length()){
            System.out.println(curr+"");
            return;
        }
        printSubsets(str,curr,index+1);
        printSubsets(str,curr+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        System.out.println("Please enter a number greater than or equal to 1");
        String str = "ABC";
        printSubsets(str,"",0);

        String[] st=new String[]{"a","b","c","b","a"};
        int a=0,b=st.length-1;
        Boolean bo;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        bo=palindrome(st,a,b);
//        System.out.println(bo);

        printN(n);
        print1(n);
        int sum=0;
//        int s = sumOfNaturalNumbers(n);
//        System.out.println(s);
    }
}
