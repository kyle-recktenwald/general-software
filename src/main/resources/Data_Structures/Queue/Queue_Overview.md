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

### Queues in Java:
* `ArrayDeque` is a class in Java that implements a **double-ended queue (Deque)** using a **dynamically resizable 
  array** as its underlying data structure
* It is a member of the Java Collections Framework and is part of the `java.util` package
* A **Deque** is a linear collection that **supports adding and removing** elements **from both ends**, making it a 
  **versatile** data structure
* Here are some key points about the ArrayDeque class:
  * **Double-Ended Queue:**
    * ArrayDeque allows you to add and remove elements from both the front and back of the queue efficiently
    * This feature is useful for various data manipulation operations
  * **Dynamic Sizing:**
    * ArrayDeque automatically resizes its internal array to accommodate more elements as needed
    * It grows by a factor of 1.5 when it reaches its capacity
  * **Not Thread-Safe:**
    * ArrayDeque is not inherently thread-safe
    * If you need a thread-safe double-ended queue, consider using java.util.concurrent classes like 
      LinkedBlockingDeque
  * **Null Elements:**
    * ArrayDeque allows null elements
  * **No Capacity Limit:**
    * Unlike arrays, ArrayDeque does not have a fixed capacity limit, and it can grow as long as there is available 
      memory
  * **Efficient Operations:**
    * ArrayDeque provides efficient O(1) time complexity for adding and removing elements from both ends of the 
      deque, making it suitable for use in various algorithms and data structures
* `ArrayDeque` is a versatile and efficient data structure for many queue-like and stack-like use cases in Java
* It is particularly well-suited for scenarios where you need to efficiently add and remove elements from both ends
* **Using the `ArrayDeque` in Java:**
  * To Instantiate an `ArrayDeque` in Java:
    * `Deque<String> arrayDeque = new ArrayDeque<>();`
  * **To enqueue or add elements to the rear:**
    * `arrayDeque.add("Item 1");`
      * Note that this will throw `IllegalStateException` if the queue is full
    * `boolean result1 = arrayDeque.offer(1);`
      * Note that this will return true if successful, but false if the queue is full
  * **To dequeue or remove elements from the front:**
    * `arrayDeque.remove()`
      * Retrieves and removes the head of the queue represented by this deque.
    * `arrayDeque.poll()`
      * Retrieves and removes the head of the queue represented by this deque (in other words, the first element of 
        this deque), or returns null if this deque is empty
  * **To access elements without removing them:**
    * `getFirst()` / `peek()` / `peekFirst()`
      * Retrieves but does not remove the element at the front of the deque
    * `getLast()` / `peekLast()`
      * Retrieves but does not remove the element at the end of the deque
    * `element()`
      * Retrieves but does not remove the element at the front of the deque (similar to getFirst(), but may 
        throw an exception if the deque is empty)
* `ArrayDeque` provides efficient implementations for all these operations, with constant time `(O(1))` complexity, 
  which makes it suitable for various double-ended queue use cases, such as implementing queues, stacks, and more
* It offers a flexible and performant way to manage collections of data in Java