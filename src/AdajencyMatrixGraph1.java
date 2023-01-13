import java.util.*;
public class AdajencyMatrixGraph1 {
    int [][] adjMatrix;
    public AdajencyMatrixGraph1(int nodes){
        this.adjMatrix = new int[nodes][nodes];
    }
    public void addEdge(int U, int V){
        adjMatrix[U][V] = 1;
        adjMatrix[U][V] = 1;
    }

    public static void main(String[] args) {
        AdajencyMatrixGraph1 grpah = new AdajencyMatrixGraph1(4);
        grpah.addEdge(0,1);
        grpah.addEdge(1,2);
        grpah.addEdge(2,3);
        grpah.addEdge(3,0);
        System.out.println(grpah);
    }
}
