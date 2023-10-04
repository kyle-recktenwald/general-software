package com.krecktenwald.generalsoftware.data_structures.model.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListImplTest {
    private LinkedListImpl<Integer> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedListImpl<>();
    }

    @Test
    void testAppendNode() {
        linkedList.appendNode(42);
        assertEquals(1, linkedList.getListSize());
        assertEquals("42, null", linkedList.printList());
    }

    @Test
    void testDeleteNode() {
        linkedList.appendNode(10);
        linkedList.appendNode(20);
        linkedList.appendNode(30);

        linkedList.deleteNode(20);

        assertEquals(2, linkedList.getListSize());
        assertEquals("10, 30, null", linkedList.printList());

        linkedList.deleteNode(10);

        assertEquals(1, linkedList.getListSize());
        assertEquals("30, null", linkedList.printList());

        linkedList.deleteNode(30);

        assertEquals(0, linkedList.getListSize());
        assertEquals("null", linkedList.printList());
    }

    @Test
    void testSearchList() {
        linkedList.appendNode(5);
        linkedList.appendNode(10);
        linkedList.appendNode(15);

        assertTrue(linkedList.searchList(10));
        assertFalse(linkedList.searchList(7));
    }
}
