import java.util.HashMap;

import java.util.Scanner;


class DsForString {
    HashMap<Integer, Integer> m;

    DsForString() {
        m = new HashMap<Integer, Integer>();
    }

    void dset(int a, int b) {
        m.put(a, b);
    }

    int dget(int s) {
        return m.get(s);
    }
}
public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please Enter your id");
//        int a = sc.nextInt();
//        System.out.println("Please Enter your Amount");
//        int b = sc.nextInt();
        DsForString d = new DsForString();
//        d.dset(a, b);
        d.dset(2,5000);
        d.dset(2,500);
        d.dset(1,200);
        System.out.println(d.dget(1));
        System.out.println(d.dget(2));
        HashMap<Integer,Integer> hm= new HashMap<>();

        int arr[] = {10,10,20,20,30};
        for(int i=0;i<arr.length;i++){

            hm.put(arr[i], hm.getOrDefault(arr[i],0) + 1);

        }
        for(int i=0;i<arr.length;i++){
                int freq= hm.get(arr[i]);
                if(freq!=-1) {
                    System.out.println(arr[i] + " " + freq);
                    hm.put(arr[i],-1);
                }

        }



    }
}

