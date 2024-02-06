# Stack Overview:

### Overview:
* **Stack:**
  * A **stack** is a **linear data structure** that follows the **Last-In-First-Out (LIFO)** principle
  * It is a **collection of elements**, where **two primary operations** can be performed:
    * **Push:**
      * This operation **adds an element** to the **top** of the stack
    * **Pop:**
      * This operation **removes and returns** the **top element** from the stack
  * A stack can also have an additional operation:
    * **Peek** (or Top):
      * This operation **returns the element** at the **top of the stack** **without removing it**
  * The stack is often visualized as a **vertical structure** where elements are stacked on top of each other
  * The **most recently added** element is at the **top**, and the **first element added** is at the **bottom**
  * Think of it like a stack of plates or books
    * You can only add a new plate or book to the top of the stack, and you can only remove the top one
  * Stacks are used in various computing applications, including **function call management** (keeping track of function 
    calls and returns), **parsing expressions**, **managing memory allocation**, and many other situations where you
    need to maintain a last-in-first-out order for elements
  * <img src="images/Stack_Diagram.png" width="300">

### Implementing a Stack in Java:
* In **Java**, you should **implement a stack** using the **`Deque` interface** and the **`ArrayDeque` class** which are 
  parts of the **Java Collections Framework**
* There is also the **`java.util.Stack` class**, but it is a **legacy class**, and it's **recommended** to **use `Deque` 
  for stack operations** in **modern Java code**
* In many cases, **`ArrayDeque` over `LinkedList`** is a **good default choice** for **implementing a stack** in Java 
  due to its **overall efficiency**, **unless specific requirements dictate otherwise**
* The **`Deque` interface** provides **more flexibility** and **can be used as a stack** (**Last In, First Out - LIFO**) 
  by using the **`push()`**, **`pop()`**, and **`peek()` methods**
* **Example:**
```java
import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {
    public static void main(String[] args) {
        // Create a deque (double-ended queue) as a stack
        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterating using enhanced for loop
        for (Integer element : stack) {
          System.out.println(element);
        }
  
        // Iterating using iterator
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
          System.out.println(iterator.next());
        }
    }
}
```