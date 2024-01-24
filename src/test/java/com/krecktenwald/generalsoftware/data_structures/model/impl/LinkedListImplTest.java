package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.ListNode;
import com.krecktenwald.generalsoftware.interview_questions.LinkedList.LinkedLists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListImplTest {

    LinkedLists linkedLists;

    @BeforeAll
    public void setup(){
        linkedLists = new LinkedLists();
    }

    @Test
    public void testReverseList() {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode reversedList1 = linkedLists.reverseList(head1);
        assertListValues(reversedList1, 3, 2, 1);
    }

    @Test
    public void testMergeTwoListsRecursively_Simple() {
        ListNode list1 = new ListNode(1, new ListNode(2, null));
        ListNode list2 = new ListNode(1, null);
        ListNode mergedList = linkedLists.mergeTwoListsRecursively(list1, list2);
        assertListValues(mergedList, 1, 1, 2);
    }

    @Test
    public void testMergeTwoListsRecursively() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        ListNode list2 = new ListNode(1, new ListNode(3, null));
        ListNode mergedList = linkedLists.mergeTwoListsRecursively(list1, list2);
        assertListValues(mergedList, 1, 1, 2, 3, 3, 4);
    }

    private void assertListValues(ListNode head, int... expectedValues) {
        for (int expectedValue : expectedValues) {
            assertNotNull(head, "Unexpected end of the list");
            assertEquals(expectedValue, head.val, "Unexpected value in the list");
            head = head.next;
        }
        assertNull(head, "Expected end of the list");
    }

    @Test
    public void testMergeTwoListsIteratively() {
        // Create two sorted linked lists
        ListNode l1 = createLinkedList(new int[]{1, 3, 5});
        ListNode l2 = createLinkedList(new int[]{2, 4, 6});

        // Expected merged result: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode expectedResult = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});

        // Call the method to merge the lists
        ListNode result = linkedLists.mergeTwoListsIteratively(l1, l2);

        // Compare the merged result with the expected result
        assertLinkedListEquals(expectedResult, result);
    }

    // Helper method to create a linked list from an array of values
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to compare two linked lists for equality
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected, "Expected list has more elements");
        assertNull(actual, "Actual list has more elements");
    }

}
