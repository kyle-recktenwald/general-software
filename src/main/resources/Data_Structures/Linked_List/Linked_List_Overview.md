# Linked List Overview:

### Overview:
* **Linked List:**
  * A **linked list** is a **linear data structure** used in computer science and programming
  * It consists of a sequence of elements, called "**nodes**," where each node has **two main components**:
    * **Data:**
      * This component stores the **actual value** or information you want to store, such as an integer, a string, or 
        any other data type
    * **Pointer (or reference):**
      * This component points to the **next node** in the sequence
      * It's essentially an **address** or **reference** to the **memory location** of the next node in the list
  * Linked lists come in various forms, but the two most common types are:
    * **Singly Linked List:**
      * In a singly linked list, each node has data and a **reference to the next node**
      * The **last node** typically has a reference pointing to nothing (often denoted as "**null**" or "None" in 
        programming languages) to **indicate the end of the list**
      * <img src="images/Singly_Linked_List_Diagram.png" width="300">
    * **Doubly Linked List:** 
      * In a doubly linked list, each node contains data and references to **both the next and the previous nodes**
      * This allows for **easier traversal** in **both directions** but **requires more memory** to store the additional 
        references
      * <img src="images/Doubly_Linked_List_Diagram.png" width="300">
  * **Advantages & Disadvantages of Linked Lists vs. Arrays:**
    * **Advantages:**
      * **Dynamic Size:**
        * Linked lists can **easily grow or shrink** in size **during runtime**, as **memory is allocated and deallocated 
          dynamically**
        * This makes them suitable for scenarios where the size of the data structure is uncertain
      * **Efficient Insertions and Deletions:**
        * **Insertions and deletions** of elements in a linked list, especially in the **middle** of the list, are typically 
          more efficient than in arrays
        * You can **insert or delete** elements with **O(1) time complexity**, provided you have a reference to the node
      * **No Fixed Memory Requirement:**
        * Linked lists **don't require contiguous memory allocation** like arrays
        * They can be scattered in memory, which can be beneficial in systems with memory fragmentation
      * **No Need for a Predefined Size:** 
        * You **don't need to specify the size** of a linked list in advance
        * This contrasts with arrays, which require you to determine their size when creating them
    * **Disadvantages:**
      * **Random Access:**
        * Linked lists are **not efficient for random access** to elements
        * To access an element, you **must traverse the list from the head or tail**, resulting in **O(n) time complexity**
        * In contrast, **arrays offer O(1) random access**
      * **Memory Overhead:**
        * Each node in a linked list contains **both data and a reference/pointer** to the next node, which **consumes 
          additional memory**
        * This overhead can make linked lists less memory-efficient than arrays
      * **Cache Performance:**
        * Arrays tend to have **better cache performance** because their elements are **stored contiguously** in memory
        * Accessing **adjacent elements** in an array benefits from **cache locality**, which can significantly improve
          performance