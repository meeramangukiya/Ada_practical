import java.util.*;

class prg7{
    static int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    static void union(int parent[], int x, int y) {
        parent[find(parent, x)] = find(parent, y);
    }

    public static void main(String[] args) {
        int V = 4;

        int edges[][] = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };

        Arrays.sort(edges, (a, b) -> a[2] - b[2]);

        int parent[] = new int[V];
        for (int i = 0; i < V; i++)
            parent[i] = i;

        int count = 0, i = 0, total = 0;

        System.out.println("Edges in MST:");

        while (count < V - 1) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            int x = find(parent, u);
            int y = find(parent, v);

            if (x != y) {
                System.out.println(u + " - " + v + " : " + w);
                total += w;
                union(parent, x, y);
                count++;
            }
            i++;
        }

        System.out.println("Total Weight: " + total);
    }
}
/*
Edges in MST:
2 - 3 : 4
0 - 3 : 5
0 - 1 : 10
Total Weight: 19
*/
