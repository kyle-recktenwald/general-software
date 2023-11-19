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
```
public int removeDuplicates(int[] nums) {
  if (nums.length == 0) {
    return 0;
  }
  
  int uniqueIndex = 0;
  
  for (int i = 1; i < nums.length; i++) {
    if (nums[i] != nums[uniqueIndex]) {
      uniqueIndex++;
      nums[uniqueIndex] = nums[i];
    }
  }
  
  return uniqueIndex + 1;
}
```
* This method uses the concept of **maintaining a separate index** (`uniqueIndex`) to **track the unique elements**
* It **iterates through the array** and whenever a different element is encountered, it's placed in the position 
  indicated by `uniqueIndex`
* The `uniqueIndex` is then **incremented to move forward**
* Finally, it **returns the count** of **unique elements**, which is `uniqueIndex + 1`
* This approach **modifies the array in place** and ensures that the **array's initial segment** **contains the unique 
  elements**, with **duplicates removed**

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
