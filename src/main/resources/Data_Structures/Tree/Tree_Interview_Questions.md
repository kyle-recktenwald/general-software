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
  * The **number of nodes** in the tree is **in the range** `[0, 104]`
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
    /*
     * * Instantiate two stacks, that will contain
     *    the root's children nodes, and their 
     *    corresponding depth within the tree
     * * Note that these stacks are implemented
     *   as LinkedLists, as the code requires
     *   the adding of null elements to the tree
     */
    Deque<TreeNode> stack = new LinkedList<>();
    Deque<Integer> depths = new LinkedList<>();

    /*
     * Handle the edge case of an empty tree
     */
    if (root == null) {
      return 0;
    }
    
    /*
     * * Add the root and its corresponding depth
     *  of 1 as the initial state of each of the 
     *  stacks
     */
    stack.add(root);
    depths.add(1);

    /*
     * * Initialize a depth variable to 0, and
     *   a currentDepth variable as null
     * * `depth` represents the maximum depth 
     *   of the binary tree encountered during 
     *   the DFS iteration
     * * It is used to keep track of the maximum 
     *   depth as the algorithm traverses the 
     *   tree
     */
    int depth = 0;
    int currentDepth;

    /*
     * * While the stack is not empty, set the
     *   root to the element at the top of the stack
     *   and set currentDepth to its corresponding 
     *   depth
     * * If the current element is not null, set
     *   depth to the greater value between depth and 
     *   currentDepth
     * * Then add the left and right children nodes, and 
     *   their corresponding depths (currentDepth + 1) 
     *   to each stack
     * * Once the stack is empty, return the depth
     */
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
* **Time Complexity:**
  * **`O(N)`**
  * Where **`N`** is the **number of nodes in the binary tree**
  * The method uses a **stack** to perform a **level-order traversal** of the **binary tree**, **visiting each node 
    once**
  * In the **while loop**, **each node is processed once**, and the **loop continues until the stack is empty**
  * **Inside the loop**, the method performs **constant-time operations** for **each node**, such as **updating the 
    depth variable**, **adding left and right children to the stack**, and **updating their corresponding depths**
  * Since **each node is processed once**, and the **constant-time operations** are **performed for each node**, the 
    **overall time complexity is `O(N)`**, **where `N`** is the **number of nodes** in the **binary tree**
* **Space Complexity:**
  * **Worst Case:** **`O(N)`**
  * **Average Case:** **`O(log(N))`**
  * In the **worst case**, the **tree is completely unbalanced**, e.g. **each node has only the left child node**, the 
    **recursion call would occur `N` times** (the **height of the tree**), the **storage to keep the call stack** would 
    be **`O(N)`**
  * But in the **average case** (**the tree is balanced**), the **height of the tree** would be **`log(N)`**
    * Therefore, the **space complexity** in this case would be **`O(log(N))`**

### Validate Binary Search Tree:
* Given the **`root`** of a **binary tree**, determine if it is a **valid binary search tree (BST)**
* A **valid BST** is defined as follows:
  * The **left subtree** of a node **contains only nodes** with **keys less than the node's key**
  * The **right subtree** of a node **contains only nodes** with **keys greater than the node's key**
  * **Both** the **left and right subtrees must also be binary search trees**
* **Example 1:**
* <img src="images/Validate_BST_Example_1.jpg" width="200">
```
Input: root = [2,1,3]
Output: true
```
* **Example 2:**
* <img src="images/Validate_BST_Example_2.jpg" width="250">
```
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but 
  its right child's value is 4
```
* **Constraints:**
  * The **number of nodes** in the tree is **in the range `[1, 104]`**
  * -231 <= `Node.val` <= 231 - 1
* **Approach 1: Recursive Traversal with Valid Range:**
```java
class Solution {
    public boolean validate(TreeNode root, 
                            Integer low, Integer high) {
        /*
         * * Edge case: Return true if root equal null as 
         *    empty trees are valid BSTs       
         */
        if (root == null) {
            return true;
        }
      
        /*
         * * Return false if high or low are outside current 
         *   range
         * * Note that the values cannot even be equal to the
         *   root's value, as there are no duplicates allowed
         *   in a typical BST
         */
        if ((low != null && root.val <= low) 
                || (high != null && root.val >= high)) {
            return false;
        }

      /*
       * * Recursively call validate with the left and right 
       *   child nodes
       * * First recursively validate the right children, with the root's value
           as the low, and the current high
         * 
       */
        return validate( validate(root.left, low, root.val)
                && root.right, root.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}
```
* **Complexity Analysis:**
  * **Time Complexity:**
    * O(N)
    * We visit each node exactly once
  * **Space Complexity:**
    * O(N)
    * We store up to the entire tree
