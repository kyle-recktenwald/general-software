# Array Overview:

### Overview:
* An **array** is a **fundamental** and **widely used data structure** in computer science and programming
* It is a **collection of elements**, **each identified** by an **index** or a **key**
* The elements in an array are stored in **contiguous memory locations**, which means they are **stored one after the 
  other in memory**
* This property allows for **efficient random access,** which means you can **directly access any element** of the array 
  using its **index** or **key**
* Key characteristics of an array data structure:
  * **Fixed Size:**
    * Arrays have a **fixed size**, which is **determined when the array is created**
    * Once the size is set, it **cannot be changed**, unless **a new array is created** with a **different size**, and 
      the **elements are copied over**
  * **Homogeneous Elements:**
    * In most programming languages, arrays store elements of the **same data type**
    * For example, an **integer array** can **only store integers**, and a **string array** can **only store strings**
  * **Contiguous Memory:**
    * The elements of an array are stored in **adjacent memory locations**
    * This property allows for **efficient memory access** but also means that **inserting or removing** elements in the 
      **middle** of an array can be **slow** because it **may require shifting other elements**
  * **Zero-Based Indexing:**
    * In many programming languages, arrays use **zero-based indexing**, which means the **first element** is accessed 
      using the **index 0**, the second with 1, and so on
* Common operations on arrays include:
  * **Accessing Elements by Index:**
    * You can **retrieve** the value of an element at a specific index in **constant time (O(1))**
  * **Updating Elements by Index:**
    * You can **change the value** of an element at a specific index in **constant time (O(1))**
  * **Iterating Through Elements:**
    * You can traverse all elements of an array one by one with **time complexity of O(n)**
  * **Finding the Length:**
    * You can determine the number of elements in an array
    * Finding the length of an array has a constant-time complexity, which is denoted as **O(1)**
  * **Searching for Elements:**
    * You can search for a specific element in an array, but this may require iterating through the array, resulting in 
      a **time complexity of O(n)**
* <img src="images/Array_Diagram.png" width="500">
* Arrays are used for a wide range of purposes in programming, including **storing collections of data**, **implementing 
  data structures** like **stacks** and **queues**, and serving as the **foundation** for **more complex data 
  structures** such as **dynamic arrays** (e.g., **ArrayList** in Java) and **matrices**
* While arrays offer **efficient access** to elements, they have **limitations**, such as their **fixed size** and 
  **inefficiency** when elements **need to be inserted or removed frequently** from positions **other than the ends of 
  the array**
* In such cases, **dynamic data structures** like **lists** or **linked lists** may be more appropriate

### Arrays in Java:

* **Instantiating an Array:**
  * **Syntax:**
    * `var-name = new type [size];`
  * **Example:**
    * `int[] intArray = new int[20];`
  * **Array Literal Example:**
    * `int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };`
* **Iterating Through an Array:**
* **Using a For Loop:**
```
for (int i = 0; i < intArray.length; i++) {
    int element = intArray[i];
    System.out.println(element);
}
```
* **Using a For Each Loop:**
```
for (int element : intArray) {
    System.out.println(element);
}
```
* **Using Streams:**
  * **Java 8** introduced the **Stream API**, which provides a **more functional** and **declarative** way to process 
    **collections**, **including arrays**
```
Arrays.stream(intArray)
      .forEach(element -> {
          System.out.println(element);
      });
```
* **Using a While Loop:**
  * In this case, you need to **maintain an index variable manually**
```
while (i < intArray.length) {
    int element = intArray[i];
    System.out.println(element);
    i++;
}
```
* **Using a Do While Loop:**
  * This can ensure that the loop body is **executed at least once**
```
int i = 0;
do {
    int element = intArray[i];
    System.out.println(element);
    i++;
} while (i < intArray.length);
```

### Time Complexities of Common Operations on an Array in Java:
* **Common Operations on an Array in Java:**
  * **Accessing an element by index (e.g., arr[i]):**
    * `O(1)`
    * Accessing an element by its index is typically a constant-time operation in Java arrays
  * **Searching for an element by value:**
    * **Linear Search (using a loop):**
      * `O(n)`
    * **Binary Search (requires a sorted array):**
      * `O(log n)`
  * **Inserting an element at the end of an array (e.g., arr[10] = value):**
    * `O(1)` **on average**, but `O(n)` in the **worst case**
      * Appending an element to the end of an array is **typically a constant-time operation if there's enough space** 
        in the array
      * However, **if the array is already full** and **needs to be resized**, it can be `O(n)` because **all elements 
        need to be copied to a new array**
  * **Inserting an element at a specific index (e.g., arr[i] = value):**
    * `O(n)`
    * When you insert an element at a **specific index**, you **may need to shift all elements after that index** to 
      **make room for the new element**
    * This results in a **linear time complexity**
  * **Removing an element from the end of an array:**
    * `O(1)`
    * Removing the **last element** of an array is a **constant-time operation**
  * **Removing an element from a specific index:**
    * `O(n)`
    * **Similar to insertion**, when you **remove** an element from a **specific index**, you **may need to shift all 
      elements after that index** to **close the gap**, resulting in a **linear time complexity**
  * **Copying an array:**
    * `O(n)`
    * **Copying** an entire array in Java requires **visiting and copying every element**, resulting in a **linear time 
      complexity**
  * **Searching for the maximum or minimum element:**
    * `O(n)`
    * To find the **maximum or minimum element**, you typically need to **traverse the entire array**, resulting in a 
      **linear time complexity**
  * **Sorting an array (e.g., using `Arrays.sort()` for primitive types, or custom sorting algorithms):**
    * `O(n log n)` to `O(n^2)`, **depending on the sorting algorithm used**
    * The `Arrays.sort()` method in Java uses a highly efficient sorting algorithm, such as **mergesort** or 
      **Timsort**, which has an average time complexity of `O(n log n)`
* These time complexities are consistent with the general principles of algorithmic analysis and apply to Java arrays as 
well
* However, specific implementations and libraries may have optimizations that can affect the actual performance