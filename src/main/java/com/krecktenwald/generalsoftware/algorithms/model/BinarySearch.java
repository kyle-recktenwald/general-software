package com.krecktenwald.generalsoftware.algorithms.model;

public class BinarySearch {
  public int runBinarySearch(int[] array, int target) {
    int leftBoundary = 0;
    int rightBoundary = array.length - 1;

    while (leftBoundary <= rightBoundary) {
      int middle = leftBoundary + (rightBoundary - leftBoundary) / 2;

      if (array[middle] == target) {
        return middle;
      } else if (array[middle] < target) {
        leftBoundary = middle + 1;
      } else {
        rightBoundary = middle - 1;
      }
    }

    return -1;
  }
}
