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

### Reverse Linked List:
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode reversedSublist = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversedSublist;
    }
}
```