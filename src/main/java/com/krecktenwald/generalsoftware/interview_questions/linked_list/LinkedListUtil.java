package com.krecktenwald.generalsoftware.interview_questions.linked_list;

import com.krecktenwald.generalsoftware.ListNode;

public class LinkedListUtil {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode reversedSublist = reverseListIteratively(head.next);
        head.next.next = head;
        head.next = null;

        return reversedSublist;
    }

    public ListNode mergeTwoListsRecursively(ListNode list1,
                                             ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode head;

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        head.next = mergeTwoListsRecursively(list1, list2);

        return head;
    }

    public ListNode mergeTwoListsIteratively(ListNode list1,
                                             ListNode list2) {

        /*
         * * Initialize an empty preHead node to maintain
         *   a reference to the head, and initialize another
         *   node that points to it to maintain a reference
         *   to the tail
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
         * * Reverse the second half of the list
         */
        ListNode secondHalfStart = reverseListIteratively(firstHalfEnd.next);

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
         * * Restore the second half of the list and return the result
         */
        firstHalfEnd.next = reverseListIteratively(secondHalfStart);

        return result;
    }

    /**
     * Finds the end of the first half of a linked list using the two-pointer technique.
     *
     * This method uses two pointers, 'fast' and 'slow', to traverse the linked list. The 'fast'
     * pointer moves two steps at a time, while the 'slow' pointer moves one step at a time.
     * As a result, when the 'fast' pointer reaches the end of the list, the 'slow' pointer
     * will be at the middle of the list or the end of the first half, depending on the length
     * of the list.
     *
     * @param head The head of the linked list.
     * @return The node representing the end of the first half of the linked list.
     *         If the linked list has an odd number of nodes, this will be the middle node.
     *         If the linked list has an even number of nodes, this will be the last node of the first half.
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

    private ListNode reverseListIteratively(ListNode head) {
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


