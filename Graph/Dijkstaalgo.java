import java.util.*;

public class Dijkstaalgo {
    public static class Edfe {
        int src;
        int dest;
        int wt;

        Edfe(int S, int D, int W) {
            this.src = S;
            this.dest = D;
            this.wt = W;
        }
    }

    public static void createGraph(ArrayList<Edfe> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edfe(0, 1, 2));
        graph[0].add(new Edfe(0, 2, 4));

        graph[1].add(new Edfe(1, 3, 7));
        graph[1].add(new Edfe(1, 2, 1));

        graph[2].add(new Edfe(2, 4, 3));

        graph[3].add(new Edfe(3, 5, 1));

        graph[4].add(new Edfe(4, 3, 2));
        graph[4].add(new Edfe(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int Dist;

        Pair(int N, int D) {
            this.node = N;
            this.Dist = D;
        }

        @Override

        public int compareTo(Pair P2) {
            return this.Dist - P2.Dist;

        }
    }

    public static void dijkstra(ArrayList<Edfe> graph[], int src, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair crr = pq.remove();
            if (vis[crr.node] == false) {
                vis[crr.node] = true;
                for (int i = 0; i < graph[crr.node].size(); i++) {
                    Edfe e = graph[crr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edfe> graph[] = new ArrayList[V];
        createGraph(graph);
        dijkstra(graph, 0, V);

    }
}
