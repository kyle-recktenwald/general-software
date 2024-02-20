# Tree Interview Questions:

### Maximum Depth of Binary Tree:
* Given the **`root`** of a **binary tree**, return **its maximum depth**
* A **binary tree's maximum depth** is the **number of nodes along the longest path** from the **root node** down to 
  the **farthest leaf node**
* **Example 1:**
* * <img src="images/Maximum_Depth_Binary_Tree_Example_1.jpg" width="200">
```
Input: root = [3,9,20,null,null,15,7]
Output: 3
```
**Example 2:**
* * <img src="images/Maximum_Depth_Binary_Tree_Example_2.jpg" width="200">
```
Input: root = [1,null,2]
Output: 2
```
* **Constraints:**
  * The number of nodes in the tree is in the range [0, 104]
  * -100 <= `Node.val` <= 100
* **Approach 1: DFS with Recursion:**
```java
public class Solution {
  public int maxDepth(TreeNode root) {
    /*
     * * Base case, where passed in root 
     *   is null, return 0
     */
    if (root == null) {
      return 0;
    } else {
      /*
       * * Recursive cases, where maxDepth is recursively
       *   called with the root's left and right nodes to 
       *   calculate the height of each
       */
      int leftHeight = maxDepth(root.left);
      int rightHeight = maxDepth(root.right);

      /*
       * * Max depth is the greater of the left and right 
       *   subtree depths, plus 1 for the current node
       */
      return Math.max(leftHeight, rightHeight) + 1;
    }
  }
}
```
* **Complexity Analysis:**
  * **Time Complexity:**
    * **`O(N)`**
    * We **visit each node exactly once**
    * where **`N`** is the **number of nodes**
  * **Space Complexity:**
    * **Worst Case:** `O(N)`
    * **Best Case:** `O(log(N))`
    * In the **worst case**, the **tree** is **completely unbalanced**, e.g. **each node** has **only left child node**, 
      the **recursion call would occur `N` times** (the **height of the tree**), therefore the **storage to keep the 
      call stack** would be **`O(N)`**
    * But in the **best case** (the **tree** is **completely balanced**), the height of the tree would be `log(N)`
      * Therefore, the **space complexity** in this case would be **`O(log(N))`**
* **Approach 2: DFS Iteration**
```java
public class MaxDepthDfsIteration {
  public int maxDepth(TreeNode root) {
    Deque<TreeNode> stack = new LinkedList<>();
    Deque<Integer> depths = new LinkedList<>();

    if (root == null) {
      return 0;
    }

    stack.add(root);
    depths.add(1);

    int depth = 0;
    int currentDepth;

    while (!stack.isEmpty()) {
      root = stack.pollLast();
      currentDepth = depths.pollLast();

      if (root != null) {
        depth = Math.max(depth, currentDepth);

        stack.add(root.left);
        stack.add(root.right);

        depths.add(currentDepth + 1);
        depths.add(currentDepth + 1);
      }
    }

    return depth;
  }
}
```