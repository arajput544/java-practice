import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);

    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for (int i=0; i<adj.size();i++){
            for (int j=0; j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
//        boolean[] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false){
            int u=q.poll();
            System.out.println(u);
            for (int i:adj.get(u)){
                if (visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }
    static int BFSDin(ArrayList<ArrayList<Integer>> adj,int v){
        boolean[] visited=new boolean[v];
        int count = 0;
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                BFS(adj,i,visited);
                count++;
            }
        }
        return count;
    }
    static void DFSRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s){
        visited[s] = true;

        System.out.println(s);
        for (int v: adj.get(s)){
            if (visited[v]==false){
                DFSRec(adj,visited,v);
            }
        }
    }
    static int DFS(ArrayList<ArrayList<Integer>> adj, int v,int s){
        boolean[] visited = new boolean[v];
        int count=0;
        for (int i=0;i<v;i++) {
            if (visited[i]==false) {
                DFSRec(adj, visited, i);
                count++;
            }
        }
        return count;
    }
    static boolean DFSDCRec(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int s, int parent){
        visited[s]=true;
        for (int v: adj.get(s)){
            if (visited[v]==false){
                if(DFSDCRec(adj,visited,v,s) == true){
                    return true;
                }

            }
            else if(v!=parent){
                return true;
            }
        }
        return false;
    }


    static boolean DFSDC(ArrayList<ArrayList<Integer>> adj, int v) {
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                if (DFSDCRec(adj, visited, i, -1) == true) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean DFSDGDCREC(ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recst,int s){
        visited[s]=true;
        recst[s]=true;
        for (int u: adj.get(s)){
            if (visited[s]==false && DFSDGDCREC(adj,visited,recst,u)==true){
                return true;
            }
            else if (recst[s]==true){
                return true;
            }
        }
        recst[s]=false;
        return false;

    }
    static boolean DFSDGDC(ArrayList<ArrayList<Integer>> adj, int v){
        boolean[] recst=new boolean[v];
        boolean[] visited=new boolean[v];
        for (int i=0;i<v;i++){
            if (visited[i]==false){
                if (DFSDGDCREC(adj,visited,recst,i)==true){
                    return true;
                }
            }
        }
        return false;
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
//        BFS(adj,v,0);
//        int a=BFSDin(adj,v);
//        System.out.println("Number of Island is "+a);
//        int b= DFS(adj, v,0 );
//        System.out.println(b);
        boolean b = DFSDC(adj,v);
        System.out.println(b);
        if (b==true){
            System.out.println("This undirected graph is a cyclic graph");
        }
        else
        {
            System.out.println("This undirected graph is acyclic graph");
        }
        boolean c = DFSDGDC(adj,v);
        System.out.println(b);
        if (c==true){
            System.out.println("This directed graph is a cyclic graph");
        }
        else
        {
            System.out.println("This directed graph is acyclic graph");
        }


    }
}
