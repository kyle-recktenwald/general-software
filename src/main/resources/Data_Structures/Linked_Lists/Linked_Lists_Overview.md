# Linked Lists Overview:

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
    * **Doubly Linked List:** 
      * In a doubly linked list, each node contains data and references to **both the next and the previous nodes**
      * This allows for **easier traversal** in **both directions** but **requires more memory** to store the additional 
        references
  * **Advantages & Disadvantages:**
    * Linked lists provide **dynamic memory allocation**, **efficient insertion and deletion of elements** (as you only 
      need to update a few references), and **can vary in size during runtime**
    * However, they have some **disadvantages**, such as **slower random access compared to arrays** because you 
      **must traverse the list** to **find a specific element**