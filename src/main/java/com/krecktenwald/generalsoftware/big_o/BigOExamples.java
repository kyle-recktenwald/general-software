package com.krecktenwald.generalsoftware.big_o;

public class BigOExamples {

  public static void main(String[] args) {
    int[] intArray = new int[] {1, 2, 3};
    printUnorderedPairs(intArray);
  }

  static void printUnorderedPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        System.out.println(array[i] + ", " + array[j]);
      }
    }
  }
}
