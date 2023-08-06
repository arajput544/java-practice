import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class directedgraph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);


    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i=0; i<adj.size();i++){
            for (int j=0; j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        int[] a = new int[V];
        int[] indegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int x : adj.get(u)) {
                indegree[x]++;
            }
        }
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);

            }
        }
        for (int r = 0; r < V && q.isEmpty() == false; r++) {
            int u = q.poll();
            a[r] = u;
            for (int i : adj.get(u)) {

                if (--indegree[i] == 0) {
                    q.add(i);
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>(v);
        for (int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
//        addEdge(adj,1,0);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);
//        addEdge(adj,2,0);
//        addEdge(adj,2,1);
//        addEdge(adj,3,1);
        printGraph(adj);
        int[] a=new int[v];
        a=topoSort(v,adj);
        for(int i=0;i<v;i++){
            System.out.println(a[i]);
        }

    }
}
