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







