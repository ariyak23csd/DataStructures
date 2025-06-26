package graph;
import java.util.*;

public class glist {
    List<List<Integer>> li;

    public glist(int vertices) {
        li = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            li.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        li.get(src).add(dest);
        li.get(dest).add(src);
    }

    public void display() {
        System.out.println("Adjacency List is given below:");
        for (int i = 0; i < li.size(); i++) {
            System.out.print(i + " -> ");
            for (int node : li.get(i)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        glist graph = new glist(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.display();
    }
}
