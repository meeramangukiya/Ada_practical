import java.util.*;

public class PrimsMST {
    public static void main(String[] args) {
        int V = 5;

        int graph[][] = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        int key[] = new int[V];
        boolean mst[] = new boolean[V];
        int parent[] = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = -1, min = Integer.MAX_VALUE;

            for (int i = 0; i < V; i++)
                if (!mst[i] && key[i] < min) {
                    min = key[i];
                    u = i;
                }

            mst[u] = true;

            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && !mst[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        int total = 0;
        System.out.println("Edges in MST:");
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + " - " + i + " : " + graph[i][parent[i]]);
            total += graph[i][parent[i]];
        }

        System.out.println("Total Weight: " + total);
    }
}
/*
Edges in MST:
0 - 1 : 2
1 - 2 : 3
0 - 3 : 6
1 - 4 : 5
Total Weight: 16
*/
