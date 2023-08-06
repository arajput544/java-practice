//package Pkg;
//
//import java.util.LinkedList;
//
//public class ShortestPath {
//    static class AdjListNode
//    {
//        private int v;
//        private int weight;
//        AdjListNode(int _v, int _w) { v = _v; weight = _w; }
//        int getV() { return v; }
//        int getWeight() { return weight; }
//    }
//    static class Graph
//    {
//        private int V;
//        private LinkedList<AdjListNode> adj[];
//
//        Graph(int v) {
//            V = v;
//            adj = new LinkedList[V];
//            for (int i = 0; i < v; ++i)
//                adj[i] = new LinkedList<AdjListNode>();
//        }
//
//        void addEdge(int u, int v, int weight) {
//            AdjListNode node = new AdjListNode(v, weight);
//            adj[u].add(node);
//        }
//
//
//    }
//    public static void main(String[] args) {
//
//            Graph g = new Graph(6);
//            g.addEdge(0, 1, 2);
//            g.addEdge(0, 4, 1);
//            g.addEdge(1, 2, 3);
//            g.addEdge(4, 2, 2);
//            g.addEdge(4, 5, 4);
//            g.addEdge(2, 3, 6);
//            g.addEdge(5, 3, 1);
//
//            int s = 0;
//            System.out.println("Following are shortest distances "+
//                    "from source " + s );
//            g.shortestPath(s);
//        }
//
//}
