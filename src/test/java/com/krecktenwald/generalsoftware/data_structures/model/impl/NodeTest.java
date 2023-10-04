package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.data_structures.model.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest<T> {
    private Node<T> node;

    @BeforeEach
    void setUp() {
        node = new Node<>(null);
    }

    @Test
    void testGetData() {
        T testData = (T) "Test Data";
        node.setData(testData);
        assertEquals(testData, node.getData());
    }

    @Test
    void testSetData() {
        T testData = (T) "Test Data";
        node.setData(testData);
        assertEquals(testData, node.getData());
    }

    @Test
    void testGetNext() {
        Node<T> nextNode = new Node<>(null);
        node.setNext(nextNode);
        assertEquals(nextNode, node.getNext());
    }

    @Test
    void testSetNext() {
        Node<T> nextNode = new Node<>(null);
        node.setNext(nextNode);
        assertEquals(nextNode, node.getNext());
    }
}
