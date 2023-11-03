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
        * They can be **scattered in memory**, which can be beneficial in systems with **memory fragmentation**
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

### The `LinkedList` class in Java:
* In Java, the `LinkedList` class is part of the Java Collections Framework and is a class that represents a **doubly 
  linked list data structure**
  * A **doubly linked list** is a data structure in which **each element is stored as a node** with **references to 
    the previous and next elements** in the list
  * It is an implementation of the `List` and `Deque` (Double ended queue) interfaces
  * Note that this implementation is not synchronized
* **Instantiating a Linked List:**
  * In Java, you can instantiate a linked list using the `LinkedList` class, which is provided in the Java Collections 
    Framework:
    * `LinkedList<Integer> linkedList = new LinkedList<>();`
* **Adding Elements:**
  * **Adding elements to a linked list:**
    * Both add and addLast are used to add elements to the end of the linked list, and you can use either method 
      interchangeably to achieve the same result
    * `linkedList.add(10);` or
    * `linkedList.addLast(10);`
  * **Adding an element to the beginning of a list:**
    * `linkedList.addFirst(5)`
  * **Adding an element to a specific position:**
    * `linkedList.add(0, "First");`
* **Removing Elements:**
  * **Removing the first element:**
    * `int removedElement = linkedList.removeFirst();`
  * **Removing the last element:**
    * `int removedElement = linkedList.removeLast();`
  * **Removing an element by value:**
    * To remove the first occurance of a specified value:
      * `linkedList.remove("ValueToRemove");`
  * **Removing an element by index:**
    * `int removedElement = linkedList.remove(3);`
  * **Removing all elements from the list:**
    * `linkedList.clear();`
* **Accessing elements by index:**
    * `int element = linkedList.get(2);`
* **Checking if the list contains an element:**
  * `boolean containsElement = linkedList.contains("SearchValue");`
* **Obtaining the size of the list:**
  * `int size = linkedList.size();`
* **Iterating Through a Linked List:**
* **Using a For-Each Loop:**
```
for (int element : linkedList) {
    System.out.println(element);
}
```
* **Using an Iterator:**
```
Iterator<Integer> iterator = linkedList.iterator();
while (iterator.hasNext()) {
    int element = iterator.next();
    System.out.println(element);
}
```
* **Using a `ListIterator` (Bidirectional Traversal):**
```
ListIterator<Integer> listIterator = linkedList.listIterator();
while (listIterator.hasNext()) {
    int element = listIterator.next();
    System.out.println(element);
}

while (listIterator.hasPrevious()) {
    int element = listIterator.previous();
    System.out.println(element);
}
```
* **Using Java Streams:**
  * Java 8 introduced the **Stream API**, which can be used with a linked list for more functional and declarative 
    iteration
```
linkedList.stream()
          .forEach(element -> {
              System.out.println(element);
          });
```

### Linked List Java Implementation:
```java
class Node<T> {
  private T data;
  private Node<T> next;

  public Node(T data) {
    this.data = data;
    this.next = null;
  }
  //Getters & Setters
}

public class LinkedList<T> {
  private Node<T> head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  public void add(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
    size++;
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index out of bounds");
    }

    Node<T> current = head;
    for (int i = 0; i < index; i++) {
      current = current.getNext();
    }
    return current.getData();
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void display() {
    Node<T> current = head;
    while (current != null) {
      System.out.print(current.getData() + " -> ");
      current = current.getNext();
    }
    System.out.println("null");
  }
```