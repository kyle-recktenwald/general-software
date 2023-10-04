package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.data_structures.model.LinkedList;
import com.krecktenwald.generalsoftware.data_structures.model.Node;

public class LinkedListImpl<T> implements LinkedList<T> {
    private Node<T> headNode;
    private int listSize;

    public LinkedListImpl() {
        headNode = null;
        listSize = 0;
    }

    public void appendNode(T data) {
        Node<T> newNode = new Node<T>(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node<T> currentNode = headNode;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        listSize++;
    }

    public int getListSize() {
        return listSize;
    }

    public void deleteNode(T data) {
        if (headNode == null) {
            return;
        }

        if (headNode.getData().equals(data)) {
            headNode = headNode.getNext();
            listSize--;
            return;
        }

        Node<T> currentNode = headNode;
        Node<T> previousNode = null;

        while (currentNode != null && !currentNode.getData().equals(data)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode != null) {
            assert previousNode != null;
            previousNode.setNext(currentNode.getNext());
            listSize--;
        }
    }

    public boolean searchList(T data) {
        Node<T> currentNode = headNode;

        while (currentNode != null) {
            if (currentNode.getData().equals(data)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public String printList() {
        Node<T> current = headNode;
        StringBuilder stringBuilder = new StringBuilder();
        while (current != null) {
            stringBuilder.append(current.getData()).append(", ");
            current = current.getNext();
        }
        stringBuilder.append("null");

        return stringBuilder.toString();
    }
}
