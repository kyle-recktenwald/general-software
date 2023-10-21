# Tree Overview:

### Overview:
* A **tree** is a **hierarchical data structure** that consists of **nodes connected by edges**
* It is a type of **graph** where **each node** in the tree can have **zero or more child nodes**, **except for the top 
  node**, called the **root**, which has **no parent**
* Each node may also have a parent, except for the root, and **all nodes except the leaves** have a **single parent**
* <img src="images/Tree_Diagram.png" width="500">
* Here are some **key elements and concepts** related to trees:
  * **Root:**
    * The **topmost node** in a tree from which **all other nodes descend**
    * It is the **starting point** for **traversing the tree**
  * **Node:**
    * **Each element** or entity in the tree is a **node**
    * Nodes may contain **data** or information and **may have zero or more child nodes**
  * **Child:**
    * A node **directly connected** to another node when **moving away from the root**
    * In a family tree analogy, **children are descendants** of their parents
  * **Parent:**
    * A node **directly connected** to another node when **moving towards the root**
    * Each node, except the root, has a parent
  * **Leaf:**
    * A **node** with **no children**, i.e., a node that is at the **end of a branch** in the tree
  * **Edge:**
    * The **connection between nodes**
    * It represents the **relationship or link** between nodes
  * **Subtree:**
    * A **subtree** is a **portion of a tree**, which is **also a tree** itself
    * It is formed by **selecting a node** and **all of its descendants**
  * **Depth:**
    * The **depth** of a node in a tree is the **length of the path from the root to that node**
    * The **root** has a **depth of 0**
  * **Height:** 
    * The **height of a tree** is the **length** of the **longest path** from the **root to a leaf** node
    * It represents the **depth of the deepest node** in the tree
    * <img src="images/Tree_Node_Height_Diagram.png" width="300">
  * **Binary Tree:**
    * A binary tree is a tree in which **each node has at most two children**, typically referred to as the **left child** and
      the **right child**
  * **Binary Search Tree (BST):**
    * A **specific type of binary tree** where the nodes are **ordered** in a way that makes it **efficient for searching, 
      insertion, and deletion**
    * For each node, **all values** in its **left subtree** are **less than the node's value**, and **all values** in
      its **right subtree** are **greater**
* Trees are a fundamental data structure in computer science and are used for various applications, including:
  * Hierarchical Data Representation
  * Searching and Sorting Algorithms (e.g., Binary Search Trees)
  * File Systems
  * Parsing Expressions in Compilers and Interpreters

### Depth of a Node (n):
* The **depth** of a node in a tree is the **length of the path** from the **root node** to that **particular node**
* It is **measured** by counting the **number of edges** in the **unique path** that connects the root node to the node 
  in question
* The **root node** is assigned a **depth of 0**, and **each level** or layer of nodes **below the root** **increases 
  the depth by 1**
* In a tree, the depth of a node **indicates its position** within the **hierarchy of nodes**, with **deeper nodes** 
  being **further away from the root**
* <img src="images/Tree_Depth_Diagram.png" width="300">

### Height of a Tree:
* The **height** of a tree is a **measure of its depth** or **how many levels** it has **from the root node 
  to the deepest leaf node**
* It's an **important metric** because it **affects the efficiency** of various tree operations, such as **searching, 
  insertion, and deletion**
* There are two common ways to define the height of a tree:
  * **Height of a Rooted Tree:**
    * For a **rooted tree** (a tree with a **single designated root node**), the height is typically defined as the 
      length of the **longest path from the root node to a leaf node**
    * In other words, it's the **number of edges** in the **longest path from the root to a leaf**
  * **Height of an Empty Tree:**
    * For an **empty tree** (a tree with **no nodes**), the height is usually defined as **-1** or **0**, depending on 
      the convention used
* The height of a tree is a crucial factor in **determining the time complexity** of various tree operations
  * In **balanced trees** like **binary search trees** (e.g., **AVL trees** or **Red-Black trees**), the **height is 
    kept relatively small** to **maintain efficient operations**
* In **unbalanced trees**, such as a **degenerate tree** (essentially a **linked list**), the **height can become very 
  large**, leading to **inefficient operations**
* Reducing the height of a tree is a common goal when designing and managing tree data structures to ensure that 
  operations remain efficient
* * <img src="images/Tree_Node_Height_Diagram.png" width="300">