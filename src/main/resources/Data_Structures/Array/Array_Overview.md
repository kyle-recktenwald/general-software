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

### Two-Dimensional Arrays:
* In Java, a **two-dimensional** array is essentially an **array of arrays**
* It's a **matrix** or **grid** with **rows and columns**
* Each element in a 2D array is identified by **two indices**: **one** for the **row** and **one** for the **column**
* **Declaration:**
```
// Syntax 1:
dataType[][] arrayName;

// Syntax 2:
dataType arrayName[][];

// Example:
int[][] matrix;
```
* **Initialization:**
```
//During Declaration:
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

//Separate Initialization:
int[][] matrix = new int[3][3];
matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;
// ... initialize other elements
```
**Accesssing Elements:**
```
// Access the element in the second row and third column:
int value = matrix[1][2];  `
```
**Iteration:**
```
int[][] matrix;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();  // Move to the next line after each row
}
```

```java
public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        int value = matrix[1][2];
        System.out.println("Value at matrix[1][2]: " + value);

        // Iterating through the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
```
### Iterating Through 2D Arrays:
* **Using a for-each Loop:**
```
int[][] matrix;
for (int[] row : matrix) {
    for (int element : row) {
      System.out.print(matrix[i][j] + " ");
    }
    System.out.println();  // Move to the next line after each row
}
```
* **Using a Break Statement:**
  * If you need to **stop iteration based on a condition**, consider using `break` to exit the loops
```
int[][] matrix;
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        if (/* some condition */) {
            System.out.print(matrix[i][j] + " ");
            break;
        }
    }
}
```
* **Accessing Diagonal Elements:**
  * **Accessing diagonal elements** in a 2D array involves **indexing both rows and columns** with the **same value**
  * There are **two main diagonals** in a **square matrix**: the **primary diagonal** and the **secondary diagonal**
* **Primary Diagonal:**
  * The **primary diagonal** consists of elements where the **row index** is **equal** to the **column index**
```
int[][] matrix;
for (int i = 0; i < matrix.length; i++) {
    int diagonalElement = matrix[i][i];
    System.out.println(diagonalElement);
}
```
* **Secondary Diagonal:**
  * The **secondary diagonal** consists of elements where the **row index** and **column index** **sum up to one less 
    than the size of the matrix**
```
int[][] matrix;
for (int i = 0; i < matrix.length; i++) {
    int diagonalElement = matrix[i][matrix.length - 1 - i];
    System.out.println(diagonalElement);

}
```
* **Both Diagonals:**
  * If you need to access both diagonals simultaneously, you can use a single loop:
```
int[][] matrix;
for (int i = 0; i < matrix.length; i++) {
    int primaryDiagonalElement = matrix[i][i];
    int secondaryDiagonalElement = matrix[i][matrix.length - 1 - i];
    // Process primaryDiagonalElement and secondaryDiagonalElement
}
```
* **Example:**
  * Here's an example method that **calculates** the **sum** of the **primary** and **secondary** **diagonals**:
```java
public class DiagonalExample {
    public static void main(String[] args) {
      int[][] matrix = {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
      };

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Sum of Primary Diagonal: " + primaryDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }
}
```
* **Transposing a 2D Array:**
  * To **transpose** a **square matrix** in **Java**, you need to **swap the elements across its main diagonal**
  * The **main diagonal** is the line from the **top-left** to the **bottom-right** of the matrix
  * Here's a simple algorithm to transpose a square matrix in-place:
```
public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements across the main diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
```

### Rotating an Array:
* To "rotate an array" means to **shift** its elements **circularly** by a **certain number of steps** either to the 
  **left or right**
* This operation **changes the order of the elements** in the array while maintaining all the original elements
* **Left Rotation:**
  * In a **left rotation**, elements are **moved towards** the **beginning of the array**
  * For example, if you have an array `[1, 2, 3, 4, 5]` and perform a left rotation by 2 steps, the resulting array 
    would be `[3, 4, 5, 1, 2]`
  * Elements wrap around from the beginning of the array to the end.
* **Right Rotation:**
  * In a **right rotation**, elements are shifted towards **the end of the array**
  * For example, using the same array `[1, 2, 3, 4, 5]` and performing a **right rotation** by 2 steps would result in 
    `[4, 5, 1, 2, 3]`
  * Elements wrap around from the end of the array to the beginning
* Rotating an array doesn't change the elements themselves, but it **rearranges their positions** in a **circular 
  manner**
* Depending on the direction and number of steps for rotation, elements move to new positions within the array
* The rotation can be implemented using various techniques such as reversing elements, using auxiliary arrays, or 
  applying modular arithmetic to wrap around indices
* **Example 1: Through Reversing the Elements:**
```
public void rotateRight(int[] nums, int k) {
    int n = nums.length;
    k %= n; // To handle cases where k is greater than n

    reverse(nums, 0, n - 1); // Reverse the entire array
    reverse(nums, 0, k - 1); // Reverse the first k elements
    reverse(nums, k, n - 1); // Reverse the remaining elements
}

public void rotateLeft(int[] nums, int k) {
    int n = nums.length;
    k %= n; // To handle cases where k is greater than n

    reverse(nums, 0, n - 1); // Reverse the entire array
    reverse(nums, 0, n - k - 1); // Reverse the first k elements
    reverse(nums, n - k, n - 1); // Reverse the remaining elements
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
```
* **Example 2: Using an Auxiliary Array:**
```
public void rotateArray(int[] nums, int k) {
    int n = nums.length;
    k = k % n; // Ensure effective rotations within the array length
    
    int[] rotated = new int[n];
    for (int i = 0; i < n; i++) {
        rotated[(i + k) % n] = nums[i];
    }
    
    System.arraycopy(rotated, 0, nums, 0, n);
}
```

### The `System.arraycopy` Method:
* `System.arraycopy` is a method in Java used for copying elements from one array to another
* It's a highly efficient way to perform array copying operations
* Here's the signature of the `System.arraycopy` method:
  * `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`
* **Parameters:**
  * `src`: The source array from which elements will be copied
  * `srcPos`: The starting position in the source array from where to start copying
  * `dest`: The destination array where elements will be copied
  * `destPos`: The starting position in the destination array where elements will be copied
  * `length`: The number of elements to be copied from the source array to the destination array
```
int[] source = {1, 2, 3, 4, 5};
int[] destination = new int[5];

// Copying elements from source to destination starting from index 1
System.arraycopy(source, 1, destination, 0, 4);
// destination array will become {2, 3, 4, 5, 0}
```
* **Explanation:**
  * In the above example, `source` is the **source array**, and `destination` is the **array where elements will be
    copied**
  * `srcPos` is 1, indicating that **copying will start** from **index 1** in the **source array**
  * `destPos` is 0, indicating that **copying will start** from **index 0** in the **destination array**
  * `length` is 4, indicating that **4 elements will be copied** **from the source array to the destination array**
* This method is often used to efficiently copy elements between arrays in Java without having to iterate through
  the elements manually
* It's particularly useful when working with large arrays or when performance optimization is necessary


