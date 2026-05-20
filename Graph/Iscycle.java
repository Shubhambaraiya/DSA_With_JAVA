import java.util.ArrayList;

public class Iscycle {
    public static class Edge {
        int src;
        int dest;

        Edge(int S, int D) {
            this.src = S;
            this.dest = D;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycleExist(ArrayList<Edge> graph[], boolean vis[], int crr, boolean rec[]) {
        vis[crr] = true;
        rec[crr] = true;

        for (int i = 0; i < graph[crr].size(); i++) {
            Edge e = graph[crr].get(i);
            if (rec[e.dest] == true) {
                return true;
            } else if (vis[e.dest] == false) {
                if (isCycleExist(graph, vis, e.dest, rec)) {
                    return true;
                }
        
            }

        }
        rec[crr] = false;
        return false;

    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {

                boolean ans = isCycleExist(graph, vis, i, rec);
                if (ans == true) {
                    System.out.println(ans);
                    break;
                }
                else{
                    System.out.println(false);
                    break;
                }
            }
        }
        // System.out.println(isCycleExist(graph,new boolean[V], 0, new boolean[V]));
    }
}
