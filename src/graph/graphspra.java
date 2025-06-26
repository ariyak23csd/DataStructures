package graph;

import java.util.*;

public class graphspra {
    static int[][] matrix;
    static int vertices;

    public graphspra(int vertices) {
        graphspra.vertices = vertices;
        graphspra.matrix = new int[vertices][vertices];
    }

    public void addEdge(int sor, int dest) {
        matrix[sor][dest] = 1;
        matrix[dest][sor] = 1;
    }

    static void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> data = new ArrayDeque<>();

        visited[start] = true;
        data.add(start);

        System.out.print("BFS: ");

        while (!data.isEmpty()) {
            int current = data.poll();
            System.out.print(current + " ");

            for (int i = 0; i < vertices; i++) {
                if (matrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    data.add(i);
                }
            }
        }
        System.out.println();
    }

    static void dfsUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < vertices; i++) {
            if (matrix[start][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    static void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS: ");
        dfsUtil(start, visited);
        System.out.println();
    }

    public void display() {
        System.out.println();
        System.out.println("Adjacency matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        graphspra a = new graphspra(4);
        a.addEdge(0, 1);
        a.addEdge(1, 1);
        a.addEdge(2, 1);
        a.addEdge(3, 3);

        bfs(0);
        a.display();
        dfs(0);
    }
}
