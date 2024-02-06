package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.ListNode;
import com.krecktenwald.generalsoftware.interview_questions.linked_list.LinkedListIsPalindromeRecursive;
import com.krecktenwald.generalsoftware.interview_questions.linked_list.LinkedListUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListIsPalindromeRecursiveTest {
    LinkedListIsPalindromeRecursive linkedListIsPalindromeRecursive;

    @BeforeEach
    public void setup(){
        linkedListIsPalindromeRecursive = new LinkedListIsPalindromeRecursive();
    }

    @Test
    public void testIsPalindrome() {
        boolean isPalindrome = linkedListIsPalindromeRecursive.isPalindrome(createLinkedList(new int[]{1, 2, 3, 2, 1}));
        assertTrue(isPalindrome);

    }

    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
}
