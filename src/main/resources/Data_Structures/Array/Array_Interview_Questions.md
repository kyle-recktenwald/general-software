# Array Interview Questions:
* **Remove Duplicates from Sorted Array:**
  * Given an integer array `nums` sorted in **non-decreasing order**, **remove the duplicates in-place** such that **each 
    unique element appears only once**
  * The **relative order** of the elements **should be kept the same**
  * Then return the number of unique elements in `nums`
  * Consider the **number of unique elements** of `nums` to be `k`, to get accepted, you need to do the following things:
    * Change the array `nums` such that the **first `k` elements** of `nums` **contain the unique elements** in the 
      **order** they were present in **`nums` initially**
    * The **remaining elements** of `nums` are **not important** as well as **the size of `nums`**
    * Return `k`
* **Java Solution:**
```
public int removeDuplicates(int[] nums) {
  int n = nums.length;
  
  if (n == 0) {
    return 0;
  }
  
  int insertIndex = 1;
  
  for (int i = 1; i < n; i++) {
    if (nums[i] != nums[i - 1]) {
      nums[insertIndex] = nums[i];
      insertIndex++;
    }
  }
  
  return insertIndex;
}
```
* **Explanation:**
  * This method uses the concept of **maintaining a separate index** (`insertIndex`) to **track the unique element insert 
    index**
  * It is **guaranteed** that the **element in the first position** is **not a duplicate**, so we can **start both 
    pointers at 1**
  * It **iterates through the array** and whenever a unique element is encountered, it's placed in the position 
    indicated by `insertIndex`
  * The `insertIndex` is then **incremented to move forward**
  * Finally, it **returns the count** of **unique elements**, which is `insertIndex`
  * This approach **modifies the array in place** and ensures that the **array's initial segment** **contains the unique 
    elements**, with **duplicates removed**
* **Complexity Analysis:**
  * Let `N` be the size of the input array
  * **Time Complexity:**
    * `O(N)`
    * We **only have 2 pointers**, and both the pointers will **traverse the array at most once**
  * **Space Complexity:**
    * `O(1)`
    * We are **not using any extra space**

* **Best Time to Buy and Sell Stock:**
  * You are given an integer array `prices` where `prices[i]` is the price of a given stock on the `i`th day
  * On **each day**, you may decide to **buy and/or sell the stock**
  * You can only **hold at most one share of the stock at any time**
  * However, you **can buy it then immediately sell it** on the **same day**
  * Find and return the **maximum profit** you can achieve
```
public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        
        return maxProfit;
    }
```
* This Java code **iterates** through the **prices array**, **calculates** the **difference between consecutive 
  prices**, and **accumulates the profit** by **adding positive differences** (**indicating a price increase**)
* Finally, it **returns the total maximum profit achievable** by **buying and selling** on the **same day when 
  profitable**

### Finding the Intersection of Two Arrays:
* Given two integer arrays `nums1` and `nums2`, return an array of their intersection
* Each element in the result must appear as many times as it shows in both arrays and you may return the result in any 
  order
* **Solution 1: Sorting the Arrays**
```
public int[] intersect(int[] nums1, int[] nums2) {
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  
  int i = 0;
  int j = 0;
  
  ArrayList<Integer> list = new ArrayList<>();
  
  while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
          i++;
      } else if (nums1[i] > nums2[j]) {
          j++;
      } else {
          list.add(nums1[i]);
          i++;
          j++;
      }
  }
  
  int[] output = new int[list.size()];
  
  for(int k = 0; k < list.size(); k++){
      output[k] = list.get(k);
  }
  
  return output;
}
```
* **Explanation:**
  * Sort the arrays
  * Set **two index counters** to 0:
    * `i` to iterate through `nums1`
    * `j` to iterate through `nums2`
  * Create an `ArrayList` for storing common values
  * While `i` and `j` are less than the length of `nums1` and `nums2`:
    * **If** `nums1[i]` < `nums2[j]`, increment `i`
    * **Else if** `nums1[i]` > `nums2[j]`, increment `j`
    * **Else** add `nums1[i]` to the list, and **increment both indexes**
  * Copy the list to a new array


* **Solution 2: Using HashMaps:**
```
public int[] intersect(int[] nums1, int[] nums2) {
  HashMap<Integer, Integer> map1 = new HashMap<>();
  HashMap<Integer, Integer> map2 = new HashMap<>();
  
  for (int num : nums1) {
      map1.put(num, map1.getOrDefault(num, 0) + 1);
  }
  
  for (int num : nums2) {
      map2.put(num, map2.getOrDefault(num, 0) + 1);
  }
  
  List<Integer> intersection = new ArrayList<>();
  
  for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
      int num = entry.getKey();
      if (map2.containsKey(num)) {
          int count = Math.min(entry.getValue(), map2.get(num));
          for (int i = 0; i < count; i++) {
              intersection.add(num);
          }
      }
  }
  
  int[] result = new int[intersection.size()];
  for (int i = 0; i < intersection.size(); i++) {
      result[i] = intersection.get(i);
  }
  
  return result;
}
```
* **Explanation:**
  * Create two `HashMaps`, `map1` and `map2` to **store the frequencies** of **each number** in **each array**
  * **Iterate** through `nums[1]`and `nums[2]`, using the `map.put(num, map.getOrDefault(num, 0) + 1)` method to **count 
    the frequencies**
  * Create a **list** to **store the intersecting values**
  * **Iterate** through **each entry in `map1`**
    * If `map2` contains the **key** of the **current `map1` entry**:
      * Use `Math.min` to **store the lesser value** between the `map1` and `map2` frequencies in `count`
      * Add the **current intersecting value** **`count` times** to the intersection list
  * **Copy** the **intersection list** to a **new array**
* **Comparing Time and Space Complexity:**
  * **Overview:**
    * The approach using `HashMaps` has a **better time complexity** for some cases where the arrays are **already 
      sorted** or when the **number of unique elements** is **significantly smaller** **compared** to the **total 
      elements**
    * However, the approach with **sorted arrays** and **two pointers** might have **better performance** in cases where 
      **sorting the arrays doesn't significantly affect** the **overall time complexity**, especially when dealing with 
      **large arrays**
    * It has a **more predictable time complexity** for sorted inputs but can consume **more memory** due to the **need 
      for extra space** to store the **intersection** and **result arrays**
    * The choice between the two approaches might depend on factors like the **size of the arrays**, the **range of 
      values**, and the characteristics of the **input data**
  * **Time Complexity:**
    * **Using HashMaps:**
      * `O(n + m + p)`
        * `n` is the **total number of elements** in **both input arrays**
        * `m` is the number of **unique elements** in `nums1`
        * `p` is the number of elements in the **intersection list**
    * **Using Sorted Arrays:**
      * `O(max(N log N, M log M))`
      * `N` is the length of `nums1`
      * `M` is the length of `nums2`
      * This complexity arises due to the **sorting step** with arrays of lengths `N` and `M`
      * The **subsequent loop** for **finding the intersection** is **linear**, so the **dominating factor** is the 
        **sorting step**
  * **Space Complexity:**
    * **Using Hashmaps:**
      * `O(n + m + p)`
      * **Additional space** is used for `HashMaps` (`map1` and `map2`), the **intersection list**, and the **result 
        array**
    * **Using Sorted Arrays:**
      * `O(m + n)`
      * Additional space is used for the **list** to store the **intersections**
      * The output array for the **result**

### Adding One to Array of Integers;
* You are given a **large intege**r represented as an **integer array `digits`**, where each `digits[i]` is the `i`th 
  digit of the integer
* The digits are **ordered** from **most significant** to **least significant** in **left-to-right order**
* The large integer **does not contain any leading 0's**
* **Increment** the large integer **by one** and **return** the **resulting array** of **digits**
```
public static int[] plusOne(int[] digits) {
  int n = digits.length;
  
  for (int i = n - 1; i >= 0; i--) {
    if (digits[i] < 9) {
      digits[i]++;
      
      return digits;
    } else {
      digits[i] = 0;
    }
  }
  
  int[] result = new int[n + 1];
  result[0] = 1;
  
  return result;
  }
```
* **Implementation Steps:**
  * **Initialize `int n`** to the **length of the array**
  * **Iterate backwards** through the array (`int i = n - 1; i >= 0; i--`)
    * **If** the **current digit** is **less than 9**, **increment** it by **1**, and **return the array**
    * **Else**, **set** the **current digit** to **0**
  * If **all digits were 9**, **after the iteration**, create a **new array** of **size `n + 1`**
  * Set the **first digit** to **1** with `result[0] = 1`
  * **Return** the **new array**

### Moving Zeroes to End of Array:
* Given an **integer array** `nums`, **move all 0's** to the **end** of it while **maintaining** the **relative order** 
  of the **non-zero elements**
* Note that you must do this **in-place** without making a copy of the array
* **Example 1:**
  * Input: `nums = [0,1,0,3,12]`
  * Output: `[1,3,12,0,0]`
* **Example 2:**
  * Input: nums = `[0]`
  * Output: `[0]`
```
public static void moveZeroes(int[] nums) {
  int j = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
      int temp = nums[j];
      nums[j] = nums[i];
      nums[i] = temp;
      j++;
    }
  }
}
```
* **Implementation Steps:**
  * **Initialize** `j` to **0** to **represent** the **left**, **non-zero index**
  * **Iterate** through the array:
    * If the current number, `i` is **not equal to zero**:
      * **Swap** the **current number** with `j`
      * **Increment** `j`

### Two Sum in an Array:
* Given an **array** of **integers** `nums` and an **integer** `target`, return **indices of the two numbers** such that 
  they **add up to `target`**
* You may **assume** that **each input** would have **exactly one solution**, and you **may not use the same element 
  twice**
* You can return the answer in **any order**
* **Example 1:**
  * **Input:** `nums = [2,7,11,15], target = 9`
  * **Output:** `[0,1]`
  * **Explanation:** Because `nums[0] + nums[1] == 9`, we return `[0, 1]`
* **Example 2:**
  * **Input:** `nums = [3,2,4], target = 6`
  * **Output:** `[1,2]`
```
public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
```
* **Implementation Steps:**
  * Initialize a new `HashMap<Integer, Integer>`, `map`
  * **Iterate through** the array
    * Find and **store the current number's complement** to `target`
      * `int complement = target - nums[i];`
    * **If the map contains the key, `complement`:**
      * Return a new int array containing the **complement value** and `i`
        * `return new int[]{map.get(complement), i};`
    * **Otherwise**, put the **current value**, and **its index** in the **map**:
      * `map.put(nums[i], i);`
  * If no solution is found, throw an `IllegalArgumentException`

### Valid Sudoku:
* Determine if a **9 x 9 Sudoku board** is **valid**
* **Only the filled cells need to be validated** according to the following rules:
  * **Each row must contain** the **digits 1-9 without repetition**
  * **Each column must contain** the **digits 1-9 without repetition**
  * **Each of the nine 3 x 3 sub-boxes** of the grid **must contain the digits 1-9 without repetition**
* **Note:**
  * A Sudoku board (partially filled) **could be valid** but is **not necessarily solvable**
  * **Only the filled cells need to be validated** according to the mentioned rules
```java
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
      for (int i = 0; i < 9; i++) {
        boolean[] rowCheck = new boolean[9];
        boolean[] colCheck = new boolean[9];
        boolean[] boxCheck = new boolean[9];
  
        for (int j = 0; j < 9; j++) {
          // Check rows
          if (board[i][j] != '.' && rowCheck[board[i][j] - '1']) {
            return false;
          }
          if (board[i][j] != '.') {
            rowCheck[board[i][j] - '1'] = true;
          }
  
          // Check columns
          if (board[j][i] != '.' && colCheck[board[j][i] - '1']) {
            return false;
          }
          if (board[j][i] != '.') {
            colCheck[board[j][i] - '1'] = true;
          }
  
          // Check 3x3 sub-boxes
          int boxRowIndex = 3 * (i / 3);
          int boxColIndex = 3 * (i % 3);
          if (board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.' &&
                  boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1']) {
            return false;
          }
          if (board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.') {
            boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1'] = true;
          }
        }
      }
      return true;
    }

    public static void main(String[] args) {
        char[][] board1 = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Output for Example 1: " + isValidSudoku(board1));

        char[][] board2 = {
            {'8','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Output for Example 2: " + isValidSudoku(board2));
    }
}
```
**Implementation Steps:**
* **Iterate** through numbers `1-9` as `i`
  * **Initialize 3 boolean arrays** of **size 9**, `rowCheck`, `colCheck`, `boxCheck`
    * `boolean[] rowCheck = new boolean[9];`
    * Note that they will all be **filled with `false` values** by default
  * **Iterate** through numbers `1-9` **within the initial loop, `j`**
    * **To Check the Rows and Columns:**
      * If the current value is **not empty** (**equal to '.'**) and the **current value - '1'** is marked `true` in 
        `rowCheck`, **return** `false` for a **non-valid board**
      * If the current value is **not empty** (**equal to '.'**), **mark** the **current value in `rowCheck` - '1'** as 
        `true`;
      * For `colCheck`, repeat the previous two steps with the row and column indexes swapped
        * i.e. `board[j][i]`
    * **For the 3x3 Sub-Boxes:**
      * Calculate the current `boxRowIndex` as `3 * (i / 3)`
      * Calculate the current `colRowIndex` as `3 * (i % 3)`
        * * `i / 3` and `i % 3` represent the **offsets** for the **3x3 rows and columns**
      * **If** `board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.'` 
        and `boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1']`
        * Return false for an invalid board
      * **If** `board[boxRowIndex + j / 3][boxColIndex + j % 3] != '.'`
        * `boxCheck[board[boxRowIndex + j / 3][boxColIndex + j % 3] - '1']` = `true`;
* **Finally**, if **`false` is never returned**, the **board is valid**, return `true`
