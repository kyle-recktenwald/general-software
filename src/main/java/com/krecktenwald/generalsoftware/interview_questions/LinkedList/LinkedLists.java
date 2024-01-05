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
}


