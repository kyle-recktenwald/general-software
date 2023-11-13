# Interview Questions:

### Minimum and Maximum with Subset of an Array:
* Given **five positive integers**, find the **minimum** and **maximum** values that can be calculated by summing 
  **exactly four of the five integers**
* Then **print the respective minimum and maximum values** as a single line of two space-separated **long integers**
* **Example:**
  * `arr = [1, 3, 5, 7, 9]`
  * The minimum sum is `1 + 3 + 5 + 7 = 16`, and the maximum sum is `3 + 5 + 7 + 9 = 24`
  * The function prints `16 24`
```
public static void miniMaxSum(List<Integer> arr) {
    // Calculate the sum of all the elements in the array.
    long sum = 0;
    for (int i = 0; i < arr.size(); i++) {
        sum += arr.get(i);
    }

    // Initialize the minimum and maximum sums.
    long minSum = Long.MAX_VALUE;
    long maxSum = Long.MIN_VALUE;

    // Iterate over the array and calculate the minimum 
    // and maximum sums for each element in the array.
    for (int i = 0; i < arr.size(); i++) {
        long currentSum = sum - arr.get(i);
        if (currentSum < minSum) {
            minSum = currentSum;
        }
        if (currentSum > maxSum) {
            maxSum = currentSum;
        }
    }

    // Print the minimum and maximum sums to the console.
    System.out.println(minSum + " " + maxSum);
}
```

### Diagonal Difference:
* Given a **square matrix**, calculate the **absolute difference** between the **sums of its diagonals**:
```
public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
```