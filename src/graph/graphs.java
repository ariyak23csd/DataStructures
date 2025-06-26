package graph;
import java.util.*;

 class Graphs {
    static int[][] adjacencyMatrix;
    static int numVertices;

     public Graphs(int numVertices) {
       Graphs.numVertices=numVertices;
       adjacencyMatrix=new int[numVertices][numVertices];
	}
     
     public static void addEdge(int sor,int dest)
     {
    	 adjacencyMatrix[sor][dest]=1;
    	 adjacencyMatrix[dest][sor]=1;
     }
     
     public static void bfs(int start)
     {
    	 // boolean array helps to avoid revisit
    	 boolean[] visited=new boolean[numVertices];
    	 // queue help to store vertices
    	 Queue<Integer> data= new LinkedList<>();
    	 visited[start]=true;
    	 data.add(start);
    	 while(!data.isEmpty())
    	 {
    		 int current= data.poll();    	 
    		 System.out.print(current+"  ");
    		 for(int i=0;i<numVertices;i++)
    		 {
    			 if(adjacencyMatrix[current][i]==1 && !visited[i])
    			 {
    				 visited[i]=true;;
    				 data.add(i);
    			 }
    			 
    		 }
    	 }
    	 
     }
     
     public void dfsUtil(int start,boolean[] visited)
     {
    	 visited[start]=true;
    	 System.out.print(start+" ");
    	 
    	 for(int i=0;i<numVertices;i++)
    	 {
    		 if(adjacencyMatrix[start][i]==1 && !visited[i])
    		 {
    			 dfsUtil(i, visited);
    		 }
    	 }	 
     }
     public void dfs(int start)
     {
    	boolean[] visited=new boolean[numVertices];
    	
    	dfsUtil(start,visited);
     }
     
     
     
     
     
     
     
     
     
     
     
     public void display() {
    	 System.out.println("Adjacency Matrix:");
    	 for (int i = 0; i < numVertices; i++) {
    		 for (int j = 0; j < numVertices; j++) {
    			 System.out.print(adjacencyMatrix[i][j] + " ");
    		 }
    		 System.out.println();
    	 }
    	 System.out.println();
     }
    public static void main(String[] args) {
        Graphs g = new Graphs(5);

       addEdge(0, 1);
       addEdge(0, 4);
       addEdge(1, 2);
       addEdge(1, 3);
       addEdge(1, 4);
       addEdge(2, 3);
       addEdge(3, 4);

        g.display();
//
//        System.out.println("Is there an edge between 1 and 3? " + graph.isEdge(1, 3));
//
bfs(0);
System.out.println();
        g.dfs(0);
    }
}