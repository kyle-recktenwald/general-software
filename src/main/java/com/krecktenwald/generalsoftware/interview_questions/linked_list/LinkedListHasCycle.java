package com.krecktenwald.generalsoftware.interview_questions.linked_list;

import com.krecktenwald.generalsoftware.ListNode;

public class LinkedListHasCycle {
    /**
     * Determines whether a linked list has a cycle.
     *
     * This method uses the Floyd's Tortoise and Hare algorithm to detect a cycle in a linked list.
     * It initializes two pointers, slow and fast, initially pointing to the head and the next node,
     * respectively. The slow pointer moves one node at a time, while the fast pointer moves two nodes
     * at a time. If there is a cycle in the linked list, the two pointers will eventually meet.
     *
     * @param head The head of the linked list.
     * @return {@code true} if the linked list has a cycle, {@code false} otherwise.
     *
     * @implNote This algorithm has a time complexity of O(n) and a space complexity of O(1),
     *           where n is the number of nodes in the linked list.
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
