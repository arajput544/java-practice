package Pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Probq {
    public static double pq(ArrayList<Integer> a, int N){

        float prob=1;
        Collections.sort(a);
        while(!a.isEmpty()) {
//            int t = a.get(0);
            HashMap<Integer, Integer> hm = new LinkedHashMap<>();
            for (Integer i : a) {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
            float n = hm.get(a.get(0));

            System.out.println(n);
            float d = a.size();
            System.out.println(d);
            prob = prob*(n / d);
            System.out.println(prob);
            a.remove(0);
        }
        return ((prob)%(long)(1e9+7));

    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(6);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(4);
        double d=pq(a,6);
        System.out.println(d);

    }
}
