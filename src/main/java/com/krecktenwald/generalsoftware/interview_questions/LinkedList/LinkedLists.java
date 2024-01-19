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
}


