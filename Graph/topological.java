import java.util.*;

public class topological {
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
        graph[0].add(new Edge(0, 0));
        graph[1].add(new Edge(1, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topologicalutil(ArrayList<Edge> graph[], boolean vis[], int crr, Stack<Integer> st) {
        vis[crr] = true;
        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (!vis[e.dest]) {
                topologicalutil(graph, vis, e.dest, st);
            }
        }
            st.push(crr);

    }

    public static void topologicalorder(ArrayList<Edge> graph[], int V) {
        boolean vis[] = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                topologicalutil(graph, vis, i, st);
            }
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");

        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalorder(graph, V);

    }
}
