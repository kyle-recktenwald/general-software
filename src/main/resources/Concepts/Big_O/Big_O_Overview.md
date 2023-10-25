# Big O Overview:

### Overview:

* Big O time is the language and metric we use to describe the efficiency of algorithms

### Time Complexity:

* Time complexity tells you how the execution time of an algorithm grows as the input data (or problem size) gets larger

### Space Complexity:

* Space complexity is how much memory or storage space an algorithm or program uses to solve a problem
* It's a measure of the amount of computer memory required by the program to execute and produce its output

### Tips for Determining Big O:

* **Personal Tips:**
    * Focus on what N is
    * Pay attenton anywhere `.length` is used

* **Dropping Constants & Non-Dominant Terms:**
    * It is very possible for `O(N)` code to run faster than `O(1)` code for specific inputs
    * Big O **just describes the rate of increase**
    * For this reason, we drop the constants in runtime
        * i.e. an algorithm that one might describe as `O(2N)` is actually `O(N)`
    * Drop the Non-Dominant Terms:
        * A "term" typically refers to a part or component of a mathematical expression or equation
        * For Example:
            * `O(N^2 + N)` becomes `O(N^2)`
            * `O(N + log N)` becomes `O(N)`
* **Multi-Part Algorithms: Add vs. Multiply:**
    * For algorithms with two steps, you'll need to know whether to multiply or add the runtimes:
        * If your algorithm is in the form "do this, then, **when you're all done**, do that" then you **add** the 
          runtimes
        * If your algorithm is in the form "do this **for each time** you do that" then you **multiply** the runtimes
* **Amortized Time:**
  * An `ArrayList`, or a dynamically resizing array, allows you to have the benefits of an array while offering 
    flexibility in size
  * You won't run out of space in the `ArrayList` since its capacity will grow as you insert elements
  * An `ArrayList` is implemented with an array
    * When the array hits capacity, the `Arraylist` class will create a new array with double the capacity and copy all 
      the elements over to the new array
  * Thus, determining the runtime of an insertion is difficult
  * **Amortized time** allows us to describe that the worst case happens once in a while, but won't happen soon after
  * Thus, the cost is **amortized**
    * Amortized means to gradually write off the initial cost of (an asset) over a period
* **Log N Runtimes:**
  * `O(log N)` is commonly seen in runtimes
  * **Binary Search** is an example of `O(log N)`
    * It is a **divide-and-conquer algorithm** that searches for an element in a **sorted collection** by **repeatedly 
      dividing** the search interval in half and eliminating half of the remaining elements in each step, until the
      target element is found or the search interval is empty
    * When you see a problem where the number of elements in the problem space gets halved each time, that will likely
      be an `O(log N)` runtime
    * This is the same reason why finding an element in a balanced binary search tree is `O(log N)`
      * With each comparison, we go either left or right
      * Half the nodes are on each side, so we cut the problem space in half each time
* **Recursive Runtimes:**
  * When you have a recursive function that makes multiple calls, the runtime will often (but not always) look like
    `O(branches^depth)`, where branches is the number of times each recursive call branches
* **Comparison-Based Sorting Algorithms:**
  * Most common sorting algorithms, such as quicksort, mergesort, and heapsort, are comparison-based algorithms
  * They compare elements in the array (i.e. characters in a string) to determine their relative order 
  * In these algorithms, the number of comparisons made during the sorting process contributes significantly to the 
    overall time complexity 
  * Sorting algorithms are typically evaluated based on how their time complexity scales with the number of 
    elements (N) they need to sort
  * Algorithms that use comparisons to sort elements have a lower bound time complexity of **O(N log N)**
  * This means that as you increase the number of elements to be sorted, the time it takes grows roughly 
    in proportion to N multiplied by the logarithm of N
