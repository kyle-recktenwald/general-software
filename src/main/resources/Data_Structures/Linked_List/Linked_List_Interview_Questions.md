# Linked List Interview Questions:

### Delete a Node in a Linked List:
* There is a **singly-linked list `head`** and we want to **delete a node `node`** in it
* You are **given the node to be deleted `node`**
* You will **not be given access** to the **first node** of **`head`**
* All the values of the linked list are **unique**, and it is **guaranteed** that the **given node `node`** is **not the 
  last node** in the linked list
* **Delete the given node**
* Note that by deleting the node, we do not mean removing it from memory
* We mean:
  * The **value** of the **given node** should **not exist in the linked list**
  * The **number of nodes** in the linked list should **decrease by one**
  * All the **values before `node`** should be in the **same order**
  * All the **values after `node`** should be in the **same order**
* **Custom Testing:**
  * For the **input**, you should provide the **entire linked list `head`** and the **node to be given `node`**
  * **`node`** should **not** be the **last node of the list** and should be an **actual node in the list**
  * **We will build the linked list** and **pass the node to your function**
  * The **output** will be the **entire list after calling your function**
* **Example:**
  * <img src="images/Linked_List_Interview_Diagram_1.jpeg" width="300">
```
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, 
the linked list should become 4 -> 1 -> 9 after 
calling your function.
```
* **Constraints:**
  * The **number of the nodes** in the given list is in the range `[2, 1000]`
  * `-1000 <= Node.val <= 1000`
  * The **value** of each node in the list is **unique**
  * The **node to be deleted** is **in the list** and is **not a tail node**
* **Approach 1: Delete Next Node Instead of Current One:**
```java
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}
```
  * **Intuition:**
    * To solve the problem, let's look at the condition carefully
    * It is guaranteed that the node to be deleted is **not a tail node in the list**
    * There are a few observations here:
      * The **conventional deletion approach** will fail here since we are **not able to get the previous node** by 
        **iterating from the head** of the linked list
      * In fact, we **do not have any method** to **fetch the previous node**
      * **Without the knowledge** of the **previous node**, it's **not possible** to **delete the current node**
      * Notice that we are told the given node is **not a tail node**
      * Therefore, we can **delete the next node instead of the current node given**, and "**pretend**" that the **node 
        we are given** is the **next node**
    * Using this intuition, let's understand how to implement this problem
  * **Algorithm:**
    * By analyzing the above two key observations, we can derive the following algorithm:
    * **Store** the **next node** in a **temporary variable**
    * **Copy data** of the **next node** to the **current node**
    * **Change** the **next pointer** of the **current node** to the **next pointer** of the **next node**
    * Note that the above 3 steps make sure that your **current node** becomes the **same as the next node** and then 
      you can **safely delete the next node** from the Linked List
    * <img src="images/Linked_List_Interview_Diagram_2.png" width="500">
  * **Complexity Analysis:**
    * **Time Complexity:**
      * `O(1)` since **only 1 node needs to be updated** and we **only traverse one node behind**
    * **Space Complexity:**
      * `O(1)`, since we use **constant extra space** to **track the next node**

### Remove Nth Node from a Linked List:
* Given the **`head` of a linked list**, **remove the `n`th node** from the **end of the list** and **return its head**
* <img src="images/Linked_List_Interview_Diagram_3.jpeg" width="300">
```
Example 1 (Diagram Above):
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
```
* **Constraints:**
  * The number of nodes in the list is `size`
  * 1 <= `L` <= 30
  * 0 <= `Node.val` <= 100
  * 1 <= `n` <= `L`
* Follow up: Could you do this in **one pass**?

**Solution:**
* **Approach 1: Two Pass Algorithm:**
  * **Explanatiion:**
    * Find the **length, `L`** of the list, given `head`
    * Handle the **edge case** where **length, `L`** and **node to be removed, `n`** are **one**
    * Iterate to the **node before the `n`th node** (`L - n - 1`), and **remove it**
  * **Time Complexity:**
    * `O(L)`
    * Specifically, **`O(2L)`**, because we iterate through the list **once to find the length**, then **again to 
      remove the `n`th node**
  * **Space Complexity:**
    * `O(1)` (Constant)
    * We **don't create** a **proportional number of data structures** for **any list of length `n`**
```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Find the length of the list:
        ListNode currNode = head;
        int length = 0;
        
        while(currNode != null){
            currNode = currNode.next;
            length++;
        }

        // Handle edge case where length and n are one:
        if(length == n){
            return head.next;
        }

        // Remove nth node:
        currNode = head;
        int nodeBeforeRemovedIndex = length - n - 1;
        for(int i = 0; i < nodeBeforeRemovedIndex; i++){
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;

        return head;
    }
}
```
* **Approach 2: One Pass Approach:**
  * **Explanation:**
    * **Maintain references** for the **current node**, and a **trailing node `n` steps behind the current node**
    * Remember to **handle the edge case** where **`n`** and the **size of the list, `L`** are **1**
    * Remember that we only need the current node to **iterate to the last node**, so we **stop at `currNode.next
      != null`**
  * **Time Complexity:**
    * `O(L)`
    * The algorithm makes **one traversal** of the list of **`L` nodes**
  * **Space Complexity:**
    * `O(1)` (Constant)
    * For **any size of list, `L`**, we keep track of the **same number of nodes**
```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Move currNode n steps into the list
        ListNode currNode = head;

        for(int i = 0; i < n; i++){
            currNode = currNode.next;
        }

        // Handle edge case where n and length are 1
        if(currNode == null){
            return head.next;
        }

        // Move both pointers until currNode reaches the 
        // last node
        ListNode nodeBeforeRemoved = head;

        while(currNode.next != null){
            currNode = currNode.next;
            nodeBeforeRemoved = nodeBeforeRemoved.next;
        }

        // Remove nth node:
        nodeBeforeRemoved.next = nodeBeforeRemoved.next.next;

        return head;
    }
}
```

### Reverse Linked List:
* Given the `head` of a singly linked list, reverse the list, and return the reversed list
* **Example 1:**
* <img src="images/Linked_List_Interview_Diagram_4.jpeg" width="300">
```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
```
* **Constraints:**
  * The number of nodes in the list is the range `[0, 5000]`
  * -5000 <= `Node.val` <= 5000
* **Follow up:**
  * A linked list can be reversed either iteratively or recursively
  * Could you implement both?
* **Solutions:**
* **Approach 1: Iterative:**
  * **Explanation:**
    * Iterate through the list, setting the current node's pointer from the next to the previous node
    * We need to maintain a reference to the current node's previous node, as well as it's next node
    * Remember to handle edge cases where list is empty, and `n` = 1
  * **Complexity Analysis:**
    * **Time Complexity:**
      * `O(n)`
      * Where `n` is the list's length
    * **Space Complexity:**
      * `O(1)`
      * We are **not creating a copy of data** that's **proportional in size to the list**
```java
class Solution {
    public ListNode reverseList(ListNode head) {
        // Initialize references for the current
        // and previous nodes:
        ListNode currNode = head;
        ListNode prevNode = null;
        
        // Handle edge cases where list is empty,
        // and n = 1
        if(head == null || head.next == null){
            return head;
        }
        
        // Iterate through the list:
        while(currNode != null){
            // Maintain reference to next node:
            ListNode nextNode = currNode.next;
            
            // Set current node's pointer to 
            // previous node:
            currNode.next = prevNode;
            
            // Reassign previous node to current 
            // node, and current node to next node:
            prevNode = currNode;
            currNode = nextNode;
        }
        
        // Return the previous node (last node and 
        // new head):
        return prevNode;
    }
}
```
* **Approach 2: Recursive:**
```java
class Solution {
    public ListNode reverseList(ListNode head) {
        // * Base case indicating that `head` is the last node
        // * Also the edge case for an empty list (`head == null`)
        if (head == null || head.next == null) {
            return head;
        }

        // * Recursively call `reverseList(ListNode head)` with 
        //   `head.next`
        // * After the base case is reached, the last node 
        //   is returned and assigned to `reversedSublistHead`
        ListNode reversedSublistHead = reverseList(head.next);

        // * Set the `head` / second to last node's `next` node's 
        //   `next `reference (the last node) to point to itself
        head.next.next = head;

        // * Set the `head` node's `next` reference to `null`
        head.next = null;

        // * Return the `reversedSublistHead` node to the 
        //   preceding recursive call
        return reversedSublist;
    }
}
```
  * **Explanation:**
    * **Recursively** call **`reverseList(ListNode head)`** with **`head.next`** until the **base case** is reached 
      where **`head.next == null`**
    * When the **base case is reached (`head.next == null`)**, that indicates that **`head`** is the **last node in the 
      list**
    * The **`head`** / **last node** is **returned to the previous stack frame** and **assigned to `ListNode 
      reversedSublistHead`**
    * In the **previous stack frame**, the **`head` references** the **second to last node**
    * Set the **`head` / second to last node's `next` node's `next `reference** (the **last node**) to **point to 
      itself**
    * Set the **`head` node's `next` reference** to **`null`**
    * **Return** the **`reversedSublistHead` node** to the **preceding recursive call**, and **repeat** with **all 
      preceding recursive calls**
    * Note **`reversedSublistHead`** is **assigned only once**, but **`head` moves backwards through the list** with 
      **each return** to the **previous stack frame**
  * **Complexity Analysis:**
    * **Time Complexity:**
      * `O(n)`
      * We have to traverse over every node in the list
    * **Space Complexity:**
      * `O(n)`
      * Each recursive function call takes place on the stack frame
      * For a list of length `n`, we make `n` recursive calls

### Merge Two Sorted Lists:
* You are given the **heads** of **two sorted linked lists** **`list1`** and **`list2`**
* **Merge the two lists** into **one sorted list**
* The list should be made by **splicing together the nodes of the first two lists**
* **Return** the **head** of the **merged linked list**
* **Example 1:**
  * <img src="images/Linked_List_Interview_Diagram_5.jpg" width="400">
```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```
* **Example 2:**
```
Input: list1 = [], list2 = []
Output: []
```
* **Example 3:**
```
Input: list1 = [], list2 = [0]
Output: [0]
```
* **Constraints:**
  * The number of nodes in both lists is in the range `[0, 50]`
  * -100 <= `Node.val` <= 100
  * Both `list1` and `list2` are **sorted** in **non-decreasing order**
* **Solutions:**
* **Recursive Approach:**
```java
class Solution {
    /**
     * Merges two sorted linked lists into a single sorted linked list.
     * This method employs a recursive approach to efficiently merge the lists.
     *
     * @param list1 The head of the first sorted linked list.
     * @param list2 The head of the second sorted linked list.
     * @return The head of the merged sorted linked list.
     *
     * <p>
     * The method compares the values of the heads of the input lists and selects
     * the smaller value as the head of the merged list. It then moves the head
     * of the selected list to the next node. This process is repeated recursively
     * until the end of one of the lists is reached. The merged list is built in
     * reverse order, and the head of each recursive call is returned to construct
     * the final merged list.
     * </p>
     *
     * <p>
     * Base Case: If either list1 or list2 is null, the method returns the rest of
     * the other list. The merged list is constructed by comparing and selecting
     * the smaller values from the heads of the input lists.
     * </p>
     */
    public ListNode mergeTwoLists(ListNode list1, 
                                  ListNode list2) {
        /*
         * * Base Case: If list1 or list2 is null,
         *   return the rest of the other list
         */
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        
        /*
         * * Initialize a new head for each recursive
         *   call to hold the next element in the merged
         *   list
         */
        ListNode head;

        /*
         * * Compare the head of each list, and set head 
         *    to the lesser value
         * * Then move the list containing the lesser 
         *    value's head to the next node
         */
        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        /*
         * * Recursively call mergeTwoLists until the end 
         *   of one of the lists has been reached 
         * * Once the end of one of the lists has been 
         *   reached, the rest of the other list is 
         *   returned, and set as the head's next node
         */
        head.next = mergeTwoLists(list1, list2);

        /* 
         * * The head from each recursive case is returned, 
         *   building the merged list essentially in reverse
         */
        return head;
    }
}
```
  * * **Complexity Analysis:**
    * **Time Complexity:**
      * `O(m + n)`
      * Where `m` and `n` are the **number of nodes** in **each list**
      * In **worst case**, we need to **iterate over all the nodes** in **each list**, and **add them to the returned 
        list**
    * **Space Complexity:**
      * `O(m + n)`
      * Every **recursive function call takes up space** on the **call stack**
      * We have **at most `m + n` calls**, because **for each call** we are **comparing** the **next node of one list** 
        to **a node from the other list**
* **Iterative Approach:**
```java
class Solution {
    public ListNode mergeTwoListsIteratively(ListNode list1,
                                             ListNode list2) {

        /*
         * * Initialize an empty preHead node to maintain
         *   a reference to the head
         * * Initialize another node that points to the 
         *   empty node to maintain a reference to the tail 
         *   of the merged lists
         */
        ListNode preHead = new ListNode();
        ListNode tail = preHead;

        /*
         * * While neither list is null, indicating the end
         *   of a list, compare the heads of each list
         * * Set tail.next to the lesser value, and move
         *   that list's head to the next node
         * * Then point tail to that next node
         */
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        /*
         * * Determine which list has reached its end,
         *   and assign tail.next to the rest of the
         *   other list
         */
        tail.next = list1 == null ? list2 : list1;


        /*
         * * Return the head of the merged list via
         *   the maintained preHead reference
         */
        return preHead.next;
    }
}
```
  * **Complexity Analysis:**
    * **Time Complexity:**
      * `O(m + n)`
      * We are performing the **same comparison operation** on **every node** from **each list**
    * **Space Complexity:**
      * `O(1)` - Constant
      * All we are doing is **manipulating the pointers** that **already exist** with the **nodes in the list provided**
      * At most, **we use memory** for **our pointer's head and tail**, but the **space used by them does not grow in 
        proportion** to the **number of nodes in the list**

* **Palindrome Linked List:**
* **Problem:**
  * Given the **`head`** of a **singly linked list**, **return `true`** if it is a **palindrome** or **`false` 
    otherwise**
* **Example 1:**
* <img src="images/Palindrome_Linked_List_Diagram_1.jpeg" width="300">
```
Input: head = [1,2,2,1]
Output: true
```
* **Example 2:**
* <img src="images/Palindrome_Linked_List_Diagram_2.jpeg" width="150">
```
Input: head = [1,2]
Output: false
```
* **Constraints:**
  * The **number of nodes in the list** is in the **range** `[1, 105]`
  * `0 <= Node.val <= 9`
* **Follow Up:**
  * Could you do it in `O(n)` time and `O(1)` space?
* **Approach 1: Reverse Second Half In-Place:**
```java
class Solution {
  public boolean isPalindromeInPlace(ListNode head) {
    /*
     * * Handle the edge case where list is empty
     */
    if (head == null) {
      return true;
    }

    /*
     * * Find the last node of the first half of
     *   the list using fast and slow pointers (2x)
     * * Note that if the list has an odd number
     *   of elements, the first half will have
     *   the extra element
     */
    ListNode firstHalfEnd = findEndOfFirstHalf(head);

    /*
     * * Reverse the second half of the list, using
     *   the end of the first half's next node as
     *   the head
     */
    ListNode secondHalfStart = 
            reverseList(firstHalfEnd.next);

    /*
     * * Initialize pointers that start at the
     *   head and the second half of the list
     * * The secondHalf pointer is necessary
     *   to return the list to its original
     *   state
     */
    ListNode firstHalf = head;
    ListNode secondHalf = secondHalfStart;

    /*
     * * Initialize a boolean result set to true
     */
    boolean result = true;

    /*
     * * Iterate through the first and second
     *   half of the list, comparing values
     *   for equality
     * * This loop continues until either
     *   an inequality is found, or the
     *   secondHalf pointer is null
     * * The second half pointer is used
     *   because the first half could contain
     *   the middle element, which wouldn't
     *   affect it's reflective state
     */
    while (result && secondHalf != null) {
      if (firstHalf.val != secondHalf.val) {
        result = false;
      }

      firstHalf = firstHalf.next;
      secondHalf = secondHalf.next;
    }

    /*
     * * Restore the second half of the list 
     *   and return the result
     */
    firstHalfEnd.next = 
            reverseList(secondHalfStart);

    return result;
  }

  /**
   * * Finds the end of the first half of a 
   *   linked list using the two-pointer technique
   * * This method uses two pointers, 'fast' (2 
   *   steps) and 'slow' (1 step), to traverse 
   *   the linked list
   * * When the 'fast' pointer reaches the end 
   *   of the list, the 'slow' pointer will be 
   *   at the middle of the list or the end of 
   *   the first half
   */
  private ListNode findEndOfFirstHalf(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }

    return prev;
  }
}
```
* **Explanation:**
  * The **downside of this approach** is that in a **concurrent environment** (**multiple threads** and **processes 
    accessing the same data**), **access to the Linked List** by **other threads or processes** would **have to be 
    locked while this function is running**, because the **Linked List** is **temporarily broken**
  * This is a **limitation** of **many in-place algorithms** though
* **Complexity Analysis:**
  * **Time Complexity:**
    * `O(n)`
    * Where n is the number of nodes in the Linked List
  * **Space Complexity:**
    * `O(1)`
    * We are changing the next pointers for half of the nodes
    * This was all **memory** that had **already been allocated**, so we are **not using any extra memory**
* **Approach 2: Copy into a Stack, Then Use Two-Pointer Technique:**
```java
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode currNode = head;
        ListNode tail = head;
        
        if(head.next == null){
            return true;
        }
        
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        
        while(currNode != null){
            stack.push(currNode);
            currNode = currNode.next;
        }
        
        currNode = head;
        
        for(ListNode stackNode : stack){
            if(stackNode.val != currNode.val){
                return false;
            }
            currNode = currNode.next;
        }
        
        return true;
    }
}
```
* **Complexity Analysis:**
  * **Time Complexity:**
    * **`O(n)`**
    * Where `n` is the **number of nodes** in the **Linked List**
  * **Space Complexity:**
    * **`O(n)`**
    * We need to **create a stack**, and **add `n` values to it**
* **Approach 3: Using Recursion:**
```java
public class LinkedListIsPalindromeRecursive {
    /*
     * * Initialize a frontPointer reference to maintain
     *   a reference to the first node until the end of
     *   the list is reached recursively
     */
    private ListNode frontPointer;

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;

        return recursivelyCheck(head);
    }
    
    private boolean recursivelyCheck(ListNode currentNode) {
      /*
       * * Recursively call recursivelyCheck until the currentNode
       *   is null (end of list)
       * * Return true when currentNode is null, then compare the 
       *   currentNode value with the frontPointer value
       * * Move the frontPointer up one node, then return true
       *   to the previous stack frame, where the currentNode
       *   is moved back
       * * If the frontPointer makes it to the end, and the
       *   currentNode makes it to the beginning without 
       *   any inequalities, true is returned
       */
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)){
                return false;
            }
            if (currentNode.val != frontPointer.val){
                return false;
            }

            frontPointer = frontPointer.next;
        }

        return true;
    }
}
```
* **Complexity Analysis:**
  * **Time Complexity:**
    * **O(n)**
    * where `n` is the number of nodes in the Linked List
    * The **recursive function** is **run once** for **each of the `n` nodes**, and the **body of the recursive 
      function** is **`O(1)`**
    * Therefore, this gives a total of `O(n)`
  * **Space Complexity:**
    * `O(n)`
    * **Each time** a **function is called within a function**, the **computer needs to keep track** of **where it is 
      up to** (and the **values of any local variables**) in the **current function before it goes into the called 
      function**
    * It does this by **putting an entry** on something called the **runtime stack**, called a **stack frame**
    * Once it has created a **stack frame** for the **current function**, it can then **go into the called function**
    * Then once it is **finished with the called function**, it **pops the top stack frame** to **resume the function 
      it had been in before the function call was made**
    * **Before doing any palindrome checking**, the **above recursive function creates `n` of these stack frames** 
      because the **first step of processing a node** is to **process the nodes after it**, which is done with a 
      **recursive call**
    * Then **once it has the `n` stack frames**, it **pops them off one-by-one to process them**
    * So, the **space usage** is **on the runtime stack** because we are **creating `n` stack frames**
    * Not only is this approach **still using `O(n)` space**, it is **worse than the copying, 2 pointer approach** 
      because in **many languages** (such as **Python**), **stack frames are large**, and there's a **maximum runtime 
      stack depth of 1000** (you **can increase it**, but you risk causing **memory errors** with the **underlying 
      interpreter**)
    * With **every node creating a stack frame**, this will **greatly limit** the **maximum Linked List size** the 
      **algorithm can handle**
