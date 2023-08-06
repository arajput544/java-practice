import java.util.*;
class Mycmp implements Comparator<Map.Entry<Integer,Integer>>
{

    @Override
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if(m1.getValue()==m2.getValue()){
            return m1.getKey() - m2.getKey();
        }
        else{
            return m2.getValue()-m1.getValue();
        }
    }
}

public class kmostfrequentelements_priorityqueue {
    public static void kMostfrePriorityQueue(int[] arr, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(new Mycmp());
        for(Map.Entry<Integer,Integer> m: hm.entrySet()){
            pq.add(m);
        }
        for(int i=0;i<k;i++){
            System.out.println(pq.poll().getKey());
        }
        System.out.println('&');
    }

    public static void kMostFrequentArrayList(int[] arr, int k){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> al = new ArrayList<>(hm.entrySet());
        Collections.sort(al, new Mycmp());
        for(int i=0;i<k;i++){
            System.out.println(al.get(i).getKey());
        }

    }

    public static void main(String[] args) {
        int arr[] = {5,5,6,7,6,8,9,8,8};
//        kMostFrequentArrayList(arr,3);
//        kMostfrePriorityQueue(arr,3);
//        int[] a1 = new int[26];
//        Arrays.fill(a1, 0);
//        for(int i=0;i<26;i++){
//            System.out.println(a1[i]);
//        }
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);
        int x=3,y,z;
        y=x++;
        System.out.println(x+" "+ y);
        z=++x;
        System.out.println(x+" "+ z);

    }
}
