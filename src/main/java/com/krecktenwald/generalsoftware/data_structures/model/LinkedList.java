package com.krecktenwald.generalsoftware.data_structures.model;

public interface LinkedList<T> {
  void appendNode(T data);

  int getListSize();

  void deleteNode(T data);

  boolean searchList(T data);

  String printList();
}
