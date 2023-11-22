# Breadth First Search Overview:

### Overview:
* **Breadth-First Search (BFS)** is a **graph traversal algorithm** used to **explore and analyze data structures** like 
  **graphs** and **trees**
* It **systematically visits all the vertices (nodes) of a graph** in **breadthward** motion, **starting from a selected 
  source vertex** and **moving to its neighbors before visiting their neighbors**, and so on
* BFS is often used to find the **shortest path between two vertices** in an **unweighted graph** or to **explore a 
  graph layer by layer**
* Here's a step-by-step description of the Breadth-First Search algorithm:
  * **Step 1:** **Start** at the **source vertex**
  * **Step 2:** **Mark** the **source vertex** as **visited**
  * **Step 3:** **Add** the **source vertex** to a **queue**
  * **Step 4:** **While** the **queue** is **not empty**:
    * a. **Dequeue a vertex** from the queue
    * b. **Process the vertex** (e.g., **print it**, **record it**, or perform other actions)
    * c. **Enqueue all unvisited neighbors** of the **dequeued vertex**
    * d. **Mark each visited neighbor** as **visited**
  * **Step 5:** **Repeat steps 4** until the **queue is empty**
* BFS **ensures** that **all vertices at a distance `k` from the source vertex are visited before visiting vertices at 
  distance `k+1`**
* This means it **explores the graph layer by layer**, **starting from the source vertex** and **moving outwards**
* BFS is **often used** to **find the shortest path in an unweighted graph** because it **guarantees** that **when you 
  reach a particular vertex**, you have visited it by the **shortest possible path**
* It's also **commonly employed** in **algorithms** related to **graph problems**, such as **finding connected 
  components**, checking for **bipartiteness**, and solving **puzzles** like the **15-puzzle**
* BFS is implemented using a **queue data structure**, and its **time complexity is typically `O(V + E)`**, where `V` 
  is the **number of vertices**, and `E` is the **number of edge**s in the graph
* <img src="images/Breadth_First_Search_Diagram.png" width="500">

### Java Implementation:
* **Adjacency List:**
  * An adjacency list is a data structure used to represent graphs
  * It's a collection of linked lists or arrays where each element in the collection represents a vertex in the graph, 
    and the list associated with a vertex stores its adjacent vertices or edges
```java
public class Graph {
  // Number of vertices
  private int V;
  // Adjacency list representation
  private LinkedList<Integer> adj[];

  public Graph(int v) {
      V = v;
      adj = new LinkedList[v];
      for (int i = 0; i < v; ++i)
          adj[i] = new LinkedList();
  }

  // Function to add an edge to the graph
  void addEdge(int v, int w) {
      adj[v].add(w);
  }

  // Function to perform Breadth First Search
  void BFS(int s) {
      boolean visited[] = new boolean[V];

      LinkedList<Integer> queue = new LinkedList<>();

      visited[s] = true;
      queue.add(s);

      while (queue.size() != 0) {
          s = queue.poll();
          System.out.print(s + " ");

          Iterator<Integer> i = adj[s].listIterator();
          while (i.hasNext()) {
              int n = i.next();
              if (!visited[n]) {
                  visited[n] = true;
                  queue.add(n);
              }
          }
      }
  }

  public static void main(String args[]) {
      Graph g = new Graph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);
      g.addEdge(3, 3);

      System.out.println("Breadth First Traversal (starting from vertex 2): ");
      g.BFS(2);
  }
}
```