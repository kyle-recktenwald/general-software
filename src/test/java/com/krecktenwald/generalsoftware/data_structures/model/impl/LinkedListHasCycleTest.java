package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.ListNode;
import com.krecktenwald.generalsoftware.interview_questions.linked_list.LinkedListHasCycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListHasCycleTest {
    LinkedListHasCycle linkedListHasCycle;

    @BeforeEach
    public void setup(){
        linkedListHasCycle = new LinkedListHasCycle();
    }

    @Test
    public void testHasCycleWithCyclicList() {
        LinkedListHasCycle solution = new LinkedListHasCycle();
        assertTrue(solution.hasCycle(createCyclicLinkedList()));
    }

    @Test
    public void testHasCycleWithNonCyclicList() {
        LinkedListHasCycle solution = new LinkedListHasCycle();
        assertFalse(solution.hasCycle(createNonCyclicLinkedList()));
    }

    @Test
    public void testHasCycleWithEmptyList() {
        LinkedListHasCycle solution = new LinkedListHasCycle();
        assertFalse(solution.hasCycle(null));
    }

    private ListNode createCyclicLinkedList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;

        return head;
    }

    private ListNode createNonCyclicLinkedList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;

        return head;
    }
}
