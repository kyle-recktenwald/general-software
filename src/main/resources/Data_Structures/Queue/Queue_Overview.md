# Queue Overview:

### Overview:
* **Queue:**
  * A **queue** is a **linear data structure** that follows the **First-In-First-Out (FIFO)** principle
  * It is a collection of elements with two primary operations:
    * **Enqueue:**
      * This operation **adds** an element to the **back (or rear)** of the queue
    * **Dequeue:**
      * This operation **removes and returns** the element from the **front** of the queue
  * A queue can also have additional operations:
    * **Front:**
      * This operation **returns** the element at the **front** of the queue **without removing it**
    * **Rear (or Back)**:
      * This operation returns the element at the rear of the queue without removing it
  * <img src="images/Queue_Diagram.png" width="300">
  * Queues are often visualized as a **horizontal** structure, much like people waiting in line
    * The first person to join the line is the first to be served, and people are served in the order they joined the
      line
  * Queues are commonly used in various computing applications, including **task scheduling**, **managing resources**, 
    and implementing algorithms such as **breadth-first search (BFS)**
  * They ensure that items are **processed in the order they are received**, making them useful for scenarios where 
    maintaining a **strict order of operations** is necessary

### The Queue Interface in Java:
* The **`Queue` interface** in **Java** represents a **collection designed for holding elements prior to processing**
* Queues **typically order elements** in a **FIFO (First-In-First-Out) manner**, meaning that the **first element 
  added** is the **first one to be removed**
* The **`Queue` interface** is part of the **Java Collections Framework** and is available in the **`java.util package`**
* Here is the declaration of the Queue interface:
```java
public interface Queue<E> extends Collection<E> {
    // Inserts the specified element into this 
    // queue if it is possible to do so immediately
    boolean add(E e);

    // Inserts the specified element into this 
    // queue if it is possible to do so immediately
    boolean offer(E e);

    // Retrieves and removes the head of this queue
    E remove();

    // Retrieves and removes the head of this 
    // queue, or returns null if this queue is empty
    E poll();

    // Retrieves, but does not remove, the head 
    // of this queue
    E element();

    // Retrieves, but does not remove, the head 
    // of this queue, or returns null if this queue is empty
    E peek();

    // ... (other methods inherited from the 
    // Collection and Iterable interfaces)
}
```
* **Key methods** of the `Queue` interface include **`add`**, **`offer`**, **`remove`**, **`poll`**, **`element`**, and
  **`peek`**
* These methods allow you to **add elements to the end of the queue**, **remove elements from the front of the queue**, 
  and **inspect elements without removing them**
* **Classes** that **implement the `Queue` interface** include **`LinkedList`** and **`ArrayDeque`**, among others
* The `Queue` interface is **widely used** in scenarios where **elements need to be processed** in the **order they are 
  added**, such as **task scheduling**, **message processing**, and more

### The Deque Interface in Java:
* The **`Deque` interface** in **Java** represents a **double-ended queue**, which **allows elements** to be **added 
  or removed from both ends**
* It **extends the `Queue` interface** and **adds methods** to **support operations** at **both the head and the tail 
  of the deque**
* The **`Deque` interface** is part of the **Java Collections Framework** and is available in the **`java.util 
  package`**
* Here is the **declaration** of the `Deque` interface:
```java
public interface Deque<E> extends Queue<E> {
    // Inserts the specified element at the 
    //   front of this deque
    void addFirst(E e);

    // Inserts the specified element at the 
    //   end of this deque
    void addLast(E e);

    // Retrieves and removes the first element 
    //   of this deque
    E removeFirst();

    // Retrieves and removes the last 
    //   element of this deque
    E removeLast();

    // Retrieves, but does not remove, the 
    //   first element of this deque
    E getFirst();

    // Retrieves, but does not remove, the 
    //   last element of this deque
    E getLast();

    // Inserts the specified element at the 
    //   front of this deque
    boolean offerFirst(E e);

    // Inserts the specified element at the 
    //   end of this deque
    boolean offerLast(E e);

    // Retrieves and removes the first element 
    //   of this deque, or returns null if this 
    //   deque is empty
    E pollFirst();

    // Retrieves and removes the last element 
    //   of this deque, or returns null if this 
    //   deque is empty
    E pollLast();

    // Retrieves, but does not remove, the first 
    //   element of this deque, or returns null 
    //   if this deque is empty
    E peekFirst();

    // Retrieves, but does not remove, the last 
    //   element of this deque, or returns null 
    //   if this deque is empty
    E peekLast();

    // ... (other methods inherited from the Queue, 
    //   Collection, and Iterable interfaces)
}
```
* The `Deque` interface provides a **rich set of methods** for **adding**, **removing**, and **inspecting elements** at 
  **both ends of the deque**
* **Implementations of `Deque`** include **classes** like **`ArrayDeque`** and **`LinkedList`**
* The **choice of implementation** depends on the **specific requirements** and **characteristics of your application**

### The `ArrayDeque` Class:
* `ArrayDeque` is a **class** in Java that implements a **double-ended queue (Deque)** using a **dynamically resizable
  array** as its **underlying data structure**
* It is a member of the **Java Collections Framework** and is part of the **`java.util` package**
* A **Deque** is a **linear collection** that **supports adding and removing** elements **from both ends**, making it a
  **versatile** data structure
* Here are some key points about the `ArrayDeque` class:
  * **Double-Ended Queue:**
    * `ArrayDeque` allows you to **add and remove elements** from **both the front and back of the queue efficiently**
    * This feature is useful for various **data manipulation operations**
  * **Dynamic Sizing:**
    * `ArrayDeque` **automatically resizes its internal array** to **accommodate more elements as needed**
    * It **grows by a factor of 1.5** when it **reaches its capacity**
  * **Not Thread-Safe:**
    * `ArrayDeque` is **not inherently thread-safe**
    * If you need a **thread-safe double-ended queue**, consider using **`java.util.concurrent` classes like
      `LinkedBlockingDeque`**
  * **Null Elements:**
    * **Unlike the `LinkedList` class**, **null elements are not allowed in an `ArrayDeque` collection**
  * **No Capacity Limit:**
    * **Unlike arrays**, `ArrayDeque` **does not have a fixed capacity limit**, and it **can grow as long as there is 
      available memory**
  * **Efficient Operations:**
    * `ArrayDeque` provides **efficient `O(1)` time complexity** for **adding and removing elements** from **both ends 
      of the deque**, making it **suitable for use** in **various algorithms and data structures**
* * **Using the `ArrayDeque` in Java:**
  * To **instantiate** an `ArrayDeque` in Java:
    * `Deque<String> arrayDeque = new ArrayDeque<>();`
  * **To enqueue or add elements to the rear:**
    * `arrayDeque.add("Item 1");`
      * Note that this **will throw `IllegalStateException`** if the **queue is full**
    * `boolean result1 = arrayDeque.offer(1);`
      * Note that this **will return true if successful**, but **false if the queue is full**
  * **To dequeue or remove elements from the front:**
    * `arrayDeque.remove()`
      * **Retrieves and removes** the **head of the queue** represented by this deque
    * `arrayDeque.poll()`
      * **Retrieves and removes** the **head of the queue** represented by this deque (in other words, the **first 
        element of this deque**), or **returns null if this deque is empty**
  * **To access elements without removing them:**
    * `getFirst()` / `peek()` / `peekFirst()`
      * **Retrieves but does not remove** the **element** at the **front of the deque**
    * `getLast()` / `peekLast()`
      * **Retrieves but does not remove** the **element** at the **end of the deque**
    * `element()`
      * **Retrieves but does not remove** the **element** at the **front of the deque** (similar to `getFirst()`, but 
        **may throw an exception** if the **deque is empty**)
* `ArrayDeque` is a **versatile** and **efficient data structure** for **many queue-like and stack-like use cases** in 
  Java
* It is **particularly well-suited** for scenarios where you need to **efficiently add and remove elements from both 
  ends**

### ArrayDeque vs. LinkedList:
* **Implementation:**
  * **ArrayDeque:**
    * It is an **implementation of the `Deque` interface** using a **resizable array**
    * It provides **efficient addition and removal operations** at **both ends**
  * **LinkedList:**
    * This class **implements the Deque interface as well**, but it **uses a doubly-linked list internally**
* **Memory Efficiency:**
  * **ArrayDeque:**
    * It is **more memory-efficient than `LinkedList`**
    * Since it uses an array, it has **better cache locality** and **consumes less memory**
  * **LinkedList:**
    * Linked structures **tend to consume more memory** due to their **node-based nature**
* **Queue Operations:**
  * **ArrayDeque:**
    * It **excels in queue operations** (**adding/removing elements** from **both ends**)
    * It is **significantly better than a linked list** for this purpose
  * **LinkedList:**
    * While it **can be used as a queue**, it is **more flexible** and **can also serve as a general-purpose list**
* **Random Access:**
  * **ArrayDeque:**
    * Supports **random access** (**`O(1)` time complexity**) for **cyclic queues**
  * **LinkedList:**
    * **Does not support index-based access**
* **Null Elements:**
  * **ArrayDeque:**
    * **Cannot contain null elements**
  * **LinkedList:**
    * **Allows null elements**
* In summary, **choose `ArrayDeque`** when you need **efficient queue operations** and **memory savings**
* Opt for **`LinkedList`** if you **require flexibility as a list or queue**, and **if null elements are acceptable**