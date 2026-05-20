
import java.util.*;

public class DFS {
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

    public static void bfs(ArrayList<Edge> graph[], int V, boolean vis[], int start) {
        Queue<Integer> Q = new LinkedList<>();
        // boolean vis[] = new boolean[V];
        Q.add(start);

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

    public static void dfs(ArrayList<Edge> graph[], int crr, boolean vis[]) {
        System.out.print(crr + " ");
        vis[crr] = true;

        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }

    }

    public static void main(String[] args) {      
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vis[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                // bfs(graph, 0, vis, i);
                // System.out.print();
                dfs(graph, i, vis);

            }
        }

    }
}

    