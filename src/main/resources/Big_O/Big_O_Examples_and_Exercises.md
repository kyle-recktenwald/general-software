### Big O Examples & Exercises:

* **Example 1:**
* Q. What is the runtime of the below code?
```
void foo(int[] array) {
    int sum = 0;
    int product = 1;
    
    for(int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    for(int i = 0; i < array.length; i++) {
        product *= array[i];
    }
    System.out.println(sum + ", " + product);
}
```
* A. This will take `O(N)` time
    * One might think the runtime would be `O(2N)`, but **constant factors, such as the number of loops, do not affect
      the Big O notation**
    * The fact that we iterate through the array twice does not matter

* **Example 2:**
* Q. What is the runtime of the below code?
```
void printPairs(int[] array) {
    for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array.length; j++) {
            System.out.println(array[i] + ", " array[j]);
        }
    }
}
```
* A. The inner for loop has `O(N)` iterations, and it is called `N` times
    * Therefore, the runtime is `O(N^2)`
    * Another way we can see this is by inspecting what the "meaning" of the code is
        * It is printing all pairs (two-element sequences)
        * There are `O(N^2)` pairs; therefore the runtime is `O(N^2)`

* **Example 3:**
* Q. This is very similar code to the above example, but now the **inner for loop** starts at `i + 1`
```
void printUnorderedPairs(int[] array) {
    for(int i = 0; i < array.length; i++) {
        for(int j = i + 1; j < array.length; j++) {
            System.out.println(array[i] + ", " array[j]);
        }
    }
}
```
* A. We can retrieve the runtime several ways:
    * This pattern of for loop is **very common**
        * It's important that you know the runtime and that you deeply understand it
        * You can't just rely on memorizing common runtimes
        * Deep comprehension is important
    * **Counting the Iterations:**
        * The first time through, `j` runs for `N - 1` steps
        * The second time, it's `N - 2` steps
        * Then `N - 3` steps, and so on
        * Therefore, the number of steps total is:
        * The sum of 1 through `N - 1` is `N(N - 1) / 2` (See [Sum of integers 1 through N](../Advanced_Topics/Sum_of_Integers_1_Through_N.md)), so the runtime will be `O(N^2)`

```
(N - 1) + (N - 2) + (N - 3) + ... 2 + 1
= 1 + 2 + 3 + ... + N - 1
= sum of 1 through N - 1
```
*
    * **What it Means:**
        * Alternatively, we can figure out the runtime by thinking about what the code "means"
        * It iterates through each pair of values for `(i, j)` **where `j` is bigger than `i`**
        * There are `N^2` total pairs
            * Roughly half of those will have `i < j` and the remaining half will have `i > j`
            * This pair goes through roughly <sup>N<sup>2</sup></sup>/<sub>2</sub> pairs so it does `O(N^2)` work
    * **Visualizing What it Does:**
        * The code iterates through the following `(i, j)` pairs when `N = 8`:
        * <img src="images/Big_O_Example_3_1.png" width="300">
        * This looks like half of an `N X N` matrix, which has size (roughly) <sup>N<sup>2</sup></sup>/<sub>2</sub>
        * Therefore, it takes `O(N^2)` time
    * **Average Work:**
        * We know that the outer loop runs `N` times
        * How much work does the inner loop do?
        * It varies across iterations, but we can think about the average iteration
        * What is the average value of `1, 2, 3, 4, 5, 6, 7, 8, 9, 10`? The average value will be in the middle, so it will be roughly `5`
        * We could give a more precise answer, or course, but we don't need to for big O
        * What about for `1, 2, 3, ..., N`?
            * The average value in the sequence is `N/2`
            * Therefore, since the inner loop does `N/2` work on average, and it is run N times, the total work is
              <sup>N<sup>2</sup></sup>/<sub>2</sub>, which is `O(N^2)`
    * **Algorithm Explanation:**
        * The algorithm is designed to iterate through an array and print all pairs of elements from the array in an
          **unordered fashion**
        * In other words, it prints all possible combinations of two elements from the array where the order of the
          elements in each pair doesn't matter
        * For example, if you have an array [1, 2, 3], it will print the following pairs: `(1, 2)`, `(1, 3)`, `(2, 3)`
        * As you can see, the pairs are unordered, meaning that `(1, 2)` is considered the same as `(2, 1)`, and the method does
          not print duplicates or the reversed order of pairs