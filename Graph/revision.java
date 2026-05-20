import java.util.*;

public class revision {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));

    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        for (int i = 0; i < graph[0].size(); i++) {
            Edge e = graph[0].get(i);
            System.out.print(e.dest + " ");

        }

    }
}
