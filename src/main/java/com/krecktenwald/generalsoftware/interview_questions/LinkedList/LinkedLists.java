package com.krecktenwald.generalsoftware.interview_questions.LinkedList;

import com.krecktenwald.generalsoftware.ListNode;

public class LinkedLists {
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
     public ListNode reverseList(ListNode head) {
         if(head == null || head.next == null) {
             return head;
         }

         ListNode reversedSublist = reverseList(head.next);
         head.next.next = head;
         head.next = null;

         return reversedSublist;
    }

    public ListNode mergeTwoListsRecursively(ListNode list1,
                                  ListNode list2) {
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }

        ListNode head;

        if(list1.val < list2.val){
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        head.next = mergeTwoListsRecursively(list1, list2);

        return head;
    }

    public ListNode mergeTwoListsIteratively(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // At least one of l1 and l2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}


