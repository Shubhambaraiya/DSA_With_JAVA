import java.util.*;
public class IsCycleExist {
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

    // public static void DepthFirstSearch(ArrayList<Edge> graph[], int crr, boolean vis[]) {
    //     System.out.print(crr + " ");
    //     vis[crr] = true;
    //     for (int i = 0; i < graph[crr].size(); i++) {
    //         Edge e = graph[crr].get(i);
    //         if (!vis[e.dest]) {
    //             DepthFirstSearch(graph, e.dest, vis);
    //         }
    //     }
    // }


    public static boolean isCycle(ArrayList<Edge>graph[],int crr,boolean vis[],boolean rec[]){
        vis[crr] = true;
        rec[crr] = true;

        for(int i=0;i<graph[crr].size();i++){
            Edge e = graph[crr].get(i);
            if(rec[e.dest]==true){
                return true;
            }
            else if(vis[e.dest]==false){
                if(isCycle(graph, e.dest, vis, rec)){
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
        createGraph(graph);
        boolean vis[] = new boolean[V];
        boolean rec[] = new boolean[V];
        // DepthFirstSearch(graph, 0, new boolean[V]);
for(int i=0;i<V;i++){
    if(vis[i]==false){
boolean ans =isCycle(graph, i, vis, rec);
System.out.println(ans);
break;
    }
}
    }
}
