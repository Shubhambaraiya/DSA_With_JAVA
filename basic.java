import java.util.*;
public class basic {
    static class Edge {
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
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static void BFS(ArrayList<Edge> graph[], boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int crr = q.remove();
            if (vis[crr] == false) {
                System.out.print(crr + " ");
                vis[crr] = true;
            }
            for (int i = 0; i < graph[crr].size(); i++) {
                Edge e = graph[crr].get(i);
                q.add(e.dest);

            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[], boolean vis[], int crr) {
        System.out.print(crr + " ");
        vis[crr] = true;
        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (!vis[e.dest]) {
                DFS(graph, vis, e.dest);
            }

        }
    }

    public static void srcTodest(ArrayList<Edge> graph[], int crr, int tar, boolean vis[], String path) {
        if (crr == tar) {
            System.out.println(path);
            return;
        }
        // vis[crr] = true;
        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (!vis[e.dest]) {
                vis[crr] = true;
                srcTodest(graph, e.dest, tar, vis, path + e.dest);
                vis[crr] = false;
            }
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean vis[], boolean rec[], int crr) {
        vis[crr] = true;
        rec[crr] = true;

        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (rec[e.dest] == true) {
                return true;
            } else if (vis[e.dest] == false) {
                if (isCycle(graph, vis, rec, e.dest)) {
                    return true;
                }
            }
        }
        rec[crr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // BFS(graph, new boolean[V]);
        // DFS(graph,new boolean[V], 0);
        // srcTodest(graph, 0, 5, new boolean[V],"0");
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                boolean ans = isCycle(graph, vis, rec, i);
                if(ans==true){
                    System.out.println("true");
                    break;
                }
                else{
                    System.out.println("False");
                }
            }

        }
    }
}
