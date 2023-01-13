import java.util.*;
public class AdjListGraph {
    private LinkedList<Integer> []adj;
    private int V; //no. of vertices
    private int E; //no. of edges
    public AdjListGraph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++){
            adj[v] = new LinkedList<>();
        }
    }
    private void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public static void main(String[] args) {
        AdjListGraph g = new AdjListGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
