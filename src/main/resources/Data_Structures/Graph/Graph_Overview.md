# Graph Overview:

### Overview:
* A **graph** is a **data structure** used in computer science and mathematics to represent a **collection of objects** 
  and the **relationships between them**
* A graph consists of two main components:
  * **Node (Vertex):**
    * A **node**, often referred to as a **vertex**, is a **fundamental element** of a graph
    * Nodes can **represent various entities**, such as **data points, objects, or elements** in a **system**
    * **Each node** typically has a **unique identifier** or **label** to distinguish it from other nodes in the graph
  * **Edge:**
    * An **edge** is a **connection or link** between two nodes in the graph
    * Edges can be **directional (directed graph)** or **non-directional (undirected graph)**
      * In a **directed graph**, the **edges have a specific direction**, indicating a **one-way relationship** from one 
        node to another, while in an **undirected graph**, the **edges have no direction** and represent a 
        **symmetric relationship**
    * Edges can be **weighted** or **unweighted**
      * In a **weighted graph**, **each edge** has a **numerical value associated with it**, representing some **measure 
        of the relationship or cost between the connected nodes**
* <img src="images/Graph_Diagram.png" width="300">
* Graphs can take many forms and have various use cases, including:
  * **Social networks**, where **nodes** represent **individuals**, and **edges** represent friendships or 
    **connections** between them
  * **Transportation networks**, where **nodes** are **locations** (e.g., cities) and edges represent **roads or 
    routes** connecting them
  * **Dependency graphs** in software, where **nodes** represent **components or modules**, and **edges** represent 
    **dependencies** between them
  * **Knowledge graphs**, where **nodes** are **concepts** or entities, and **edges** represent **semantic relationships** 
    or connections between them
* Graphs can be classified into different types, such as directed graphs, undirected graphs, weighted graphs, and 
  more, based on the specific characteristics of their nodes and edges
* They are widely used in computer science and various applications, including **data modeling**, **network analysis**, 
  and **algorithm design**

### Java Implementation:
```java
public class Graph {
  // Number of vertices
  private int V;
  // Adjacency list representation
  private LinkedList<Integer> adjList[]; 

  public Graph(int v) {
      V = v;
      adjList = new LinkedList[v];
      for (int i = 0; i < v; ++i)
          adjList[i] = new LinkedList<>();
  }

  // Function to add an edge to the graph
  void addEdge(int v, int w) {
      adjList[v].add(w); // Add w to v's list
      adjList[w].add(v); // For undirected graph, add v to w's list
  }

  // Function to print the graph
  void printGraph() {
      for (int i = 0; i < V; ++i) {
          System.out.println("Adjacency list of vertex " + i);
          System.out.print("head");
          for (Integer node : adjList[i]) {
              System.out.print(" -> " + node);
          }
          System.out.println("\n");
      }
  }

  public static void main(String args[]) {
      int V = 4;
      Graph graph = new Graph(V);

      graph.addEdge(0, 1);
      graph.addEdge(0, 2);
      graph.addEdge(1, 2);
      graph.addEdge(2, 3);

      graph.printGraph();
  }
}
```
* **Implementation Steps:**
  * Initialize variables for `int` vertices, and the adjacency list LinkedList<Integer> adjList[]

### Adjacency List:
* An adjacency list is a data structure used to represent graphs
* It's a collection of linked lists or arrays where each element in the collection represents a vertex in the graph, 
  and the list associated with a vertex stores its adjacent vertices or edges
* In this representation:
  * For a graph with `V` vertices, an array or a collection of size `V` is created
  * Each element in this array represents a vertex in the graph
  * For each vertex `v`, the associated list stores all the vertices adjacent to `v`
* Here's a breakdown of the key components:
  * Array or Collection:
    * The outer structure is typically an array, a list, or a map where the indices or keys represent vertices in the 
      graph
  * Linked Lists or Arrays:
    * Each element in the array or collection contains a linked list, array, or another appropriate data structure to 
      store adjacent vertices
    * For an unweighted graph, the list might contain adjacent vertices
    * For a weighted graph, the list might store pairs of vertices and their edge weights
  * Example:
    * If you have a graph with vertices 0, 1, 2, and 3, and edges between 0-1, 0-2, 1-2, 2-0, 2-3, 3-3, the adjacency 
      list representation might look like:
```
0 -> 1 -> 2
1 -> 0 -> 2
2 -> 0 -> 1 -> 3
3 -> 2 -> 3
```
* Here, vertex 0 is connected to vertices 1 and 2, and so on
* Each vertex maintains a list of its adjacent vertices
* Advantages of Adjacency Lists:
  * Efficient for sparse graphs (graphs with fewer edges)
  * Require less memory compared to adjacency matrices for sparse graphs
  * Allow easy iteration over neighbors of a vertex
  * However, for dense graphs (graphs with many edges), adjacency matrices might be more efficient due to their 
    constant-time edge lookup
  * Adjacency lists are commonly used in graph algorithms, especially when memory efficiency is a concern or when 
    dealing with graphs that don't have a large number of edges between vertices