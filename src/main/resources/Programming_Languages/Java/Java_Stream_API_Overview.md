# The Java Stream API Overview:

### Streams in Java:
* In Java, streams represent a **sequence of elements** that you can **process in a declarative way**
* Introduced in **Java 8** as part of the **Stream API** in the `java.util.stream package`, **streams** provide a
  **higher-level abstraction** for **working with collections of data**, allowing for **concise and functional-style
  operations**
* Streams enable you to perform a **series of aggregate operations** (such as **filtering**, **mapping**, **sorting**,
  and **reducing**) on a **collection of data elements**
* These **operations** can be **chained together** to **form a pipeline**, where **each operation is applied to the
  elements as they flow through the stream**
* Key characteristics of Java streams include:
    * **Declarative and Functional Approach:**
        * Streams **support functional programming paradigms**, allowing you to **express operations on data** in a **declarative
          manner without explicitly handling iteration or mutable state**
    * **Lazy Evaluation:**
        * Many stream operations are **lazily evaluated**, meaning they are **executed only when necessary**
        * This allows for **efficiency**, especially with **large datasets**, as **operations** are **performed on elements
          as they're needed in the pipeline**
    * **Pipelines:**
        * Streams enable you to **create pipelines** by **chaining multiple operations** (such as **`filter`**, **`map`**,
          **`reduce`**, **`collect`**, etc.) to **process data in a sequence**
    * **Parallel Processing:**
        * Streams can take advantage of **parallel processing** via the **`parallel()` method**, allowing operations to be
          **executed concurrently** on **multiple threads**, **potentially improving performance** for **certain types of
          tasks**
* Example of using streams in Java:
```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Filter even numbers, square them, and find their sum
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n) // Square each number
                .reduce(0, Integer::sum); // Sum the squared numbers

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}
```
* In this example, a **stream** is created **from a list of numbers**
* The **stream operations** (**`filter`**, **`map`**, and **`reduce`**) are **chained together** to **filter even
  numbers**, **square them**, and **find their sum**
* However, the **power of streams** comes from their ability to **chain multiple operations together**, making the code
  **concise**, **readable**, and **expressive** for **various data processing tasks**

### The `.filter()` Method in Java Streams:
* In Java, the **`filter()` method** is a part of the **Stream API**, which is introduced in **Java 8**
* The `filter()` method is used to **select elements from a stream based on a given condition (predicate)**
* It **returns a new stream consisting of the elements that match the predicate**
* **Definition:**
* **`filter(Predicate<? super T> predicate)`:**
    * **Purpose:**
        * **Filters the elements** of a **stream based on a condition specified by a `Predicate`**
    * **Parameters:**
        * A **`Predicate`** that **represents the condition to filter the elements**
        * The `Predicate` is a **functional interface** that **takes an input** and **returns a boolean value (true or
          false)**
    * **Return:**
        * A **new stream** containing **only the elements that satisfy the predicate**
* **Syntax:**
```
Stream<T> filter(Predicate<? super T> predicate);
```
* **Example Usage:**
    * Let's consider an example where we have a **list of integers**, and we want to **filter out all the even numbers**
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamExample {
  public static void main(String[] args) {
    // Create a list of integers
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Use the filter method to select even numbers
    List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0).toList();

    // Output the even numbers
    System.out.println("Even numbers: " + evenNumbers);
  }
}
```
* **Explanation:**
    * **`numbers.stream()`:**
        * **Converts the list numbers** into a **stream of integers**
    * **`.filter(n -> n % 2 == 0)`:**
        * **Filters the stream** to include **only even numbers**
        * The **lambda expression `n -> n % 2 == 0`** is a **`Predicate`** that **returns true if the number is even**
    * **`.toList()`:**
        * **Collects** the **filtered elements back into a `List`**
* **Output:**
```
Even numbers: [2, 4, 6, 8, 10]
```
* **Real-World Use Cases:**
    * **Filtering Collections:**
        * You can use `filter()` to **extract elements from a collection** that **meet specific criteria**, such as
          **filtering out null values** or **selecting items with a certain property**
    * **Processing Streams of Data:**
        * In **data processing pipelines**, `filter()` is **commonly used** to **remove or select data elements based on
          conditions**
    * **Conditional Processing:**
        * Use `filter()` to **apply certain operations only to elements that meet certain conditions**
* **Key Points:**
    * The `filter()` method is an **intermediate operation**, meaning it **returns a new stream** and **allows for further
      processing**
    * The **original stream remains unchanged after applying the `filter()` method**, as **streams are immutable**
    * The **`Predicate` can be any condition that returns a boolean**, allowing for **flexible** and **powerful filtering
      of stream elements**
* By leveraging the `filter()` method, you can write **concise and readable code** for **filtering data in Java**,
  especially when **combined with other stream operations** like **`map`**, **`reduce`**, and **`forEach`**

### The `.map()` Method in Java Streams:
* The **`.map()` method** in **Java Streams** is a **powerful** and **versatile operation** that is used to **transform 
  elements in a stream**
* It **applies a given function** to **each element of the stream** and **returns a new stream containing the 
  transformed elements**
* **Definition:**
* **`map(Function<? super T, ? extends R> mapper)`:**
  * **Purpose:**
    * **Transforms each element in the stream** by **applying a provided function (mapper) to it**
  * **Parameters:**
    * A **`Function`** that **represents the transformation to be applied to each element**
    * The `Function` is a **functional interface** that **takes an input of type `T`** and **returns an output of type 
      `R`**
  * **Return:**
    * A **new stream containing the results of applying the transformation function to each element of the original 
      stream**
  * **Syntax:**
```
<R> Stream<R> map(Function<? super T, ? extends R> mapper);
```
* **Example Usage:**
  * Let's consider an **example** where we have a **list of integers**, and we want to **square each number in the 
    list**

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use the map method to square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n).toList();

        // Output the squared numbers
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
```
* **Explanation:**
  * **`numbers.stream()`:**
    * **Converts the list `numbers`** into a **stream of integers**
  * **`.map(n -> n * n)`:**
    * **Applies the lambda expression `n -> n * n`** to **each element of the stream**
    * This expression **squares each number**
  * **`.toList()`:**
    * **Collects the transformed elements (squared numbers) back into a `List`**
* **Output:**
```
Squared numbers: [1, 4, 9, 16, 25]
```
* **Real-World Use Cases:**
  * **Data Transformation:**
    * You can use `map()` to **transform data**, such as **converting a list of objects into a list of one of their 
      properties**, or **converting strings to uppercase**
  * **Type Conversion:**
    * `map()` can also be used to **change the type of the elements in the stream**, such as **converting a stream of 
      strings to a stream of integers**
  * **Complex Calculations:**
    * You can apply any **custom logic** to **each element in the stream**, such as **complex mathematical calculations 
      or formatting**
* **Key Points:**
  * The `.map()` method is an **intermediate operation**, meaning it **returns a new stream** and **allows for further 
    processing**
  * The **original stream remains unchanged after applying the `.map()` method**, as **streams are immutable**
  * The **`Function` passed to `map()` can perform any transformation**, and the **result can be of a different type 
    than the input elements**
* **Another Example with Type Conversion:**
  * Consider a **scenario** where you have a **list of strings representing numbers**, and you want to **convert them 
    to integers**:
```java
import java.util.Arrays;
import java.util.List;

public class MapStreamTypeConversion {
    public static void main(String[] args) {
        // Create a list of strings representing numbers
        List <String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");

        // Use the map method to convert strings to integers
        List <Integer> numbers = numberStrings.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        // Output the list of integers
        System.out.println("Converted numbers: " + numbers);
    }
}
```
* Note that the **`Function` passed**, `Integer::parseInt` is a **method reference** to the **static 
  `Integer.parseInt()` method**
* **Output:**
```
Converted numbers: [1, 2, 3, 4, 5]
```
* **Conclusion:**
  * The **`map()` method** is a **fundamental part of Java's Stream API**, enabling you to **transform and manipulate 
    data in a functional and declarative manner**
  * It is **particularly useful** when you need to **perform operations like mapping values**, **extracting fields from 
    objects**, or **converting types within a stream**