import java.util.*;

public class srctotar {
    public static class Edge {
        int src;
        int dest;

        Edge(int S, int D) {
            this.src = S;
            this.dest = D;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void BFS(ArrayList<Edge> graph[], int V, boolean vis[]) {
        Queue<Integer> Q = new LinkedList<>();

        Q.add(0);
        while (!Q.isEmpty()) {
            int crr = Q.remove();
            if (vis[crr] == false) {
                System.out.print(crr + " ");
                vis[crr] = true;

                for (int i = 0; i < graph[crr].size(); i++) {
                    Edge e = graph[crr].get(i);
                    Q.add(e.dest);
                }
            }
        }

    }

    public static void DFS(ArrayList<Edge> graph[], int crr, boolean vis[]) {
        System.out.print(crr + " ");
        vis[crr] = true;
        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (vis[e.dest] == false) {
                DFS(graph, e.dest, vis);

            }
        }
    }
    public static void printAllpaths(ArrayList<Edge>graph[],boolean vis[],int crr,String path, int tr){
        if(crr==tr){
            System.out.println(path);
            return ;
        }
        for(int i = 0;i<graph[crr].size();i++){

            Edge e = graph[crr].get(i);
            if(!vis[e.dest]){
                vis[crr] = true;
        printAllpaths(graph,vis,e.dest,path+e.dest,tr);
                vis[crr] = false;
            }
        }

    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        // for(int i = 0;i<graph[2].size();i++){
        // Edge e = graph[2].get(i);
        // System.out.print(e.dest+" ");

        // }
        // for (int i = 0; i < V; i++) {
        //     if (vis[i] == false) {
        //         // BFS(graph,V,vis);
        //         // DFS(graph, i, vis);
        //     }
           

        // }
         int sr=0; int tr = 5;
            printAllpaths(graph, new boolean[V], sr, "0", tr);
    }
}
