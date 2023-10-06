package com.krecktenwald.generalsoftware.big_o;

public class BigOExamples {

  public static void main(String[] args) {
    int[] intArray1 = new int[] {1, 2, 3};
    int[] intArray2 = new int[] {1, 2, 3, 4, 5};

    System.out.println("Running...\n");

    //printUnorderedPairs(intArray2);
    //printUnorderedPairs(intArray1, intArray2);
    reverse(intArray2);

    System.out.println("\nFinished Running.");

  }

  static void printUnorderedPairs(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        System.out.println(array[i] + ", " + array[j]);
      }
    }
  }

  static void printUnorderedPairs(int[] arrayA, int[] arrayB) {
    for (int i = 0; i < arrayA.length; i++) {
      for(int j = 0; j < arrayB.length; j++){
        if (arrayA[i] < arrayB[j]) {
          System.out.println(arrayA[i] + ", " + arrayB[j]);
        }
      }
    }
  }

  static void reverse(int[] arrayA) {
    for (int i = 0; i < arrayA.length / 2; i++) {
      int other = arrayA.length - i - 1;
      int temp = arrayA[i];
      System.out.printf("[%s]: Other: %s, Temp: %s%n", i, other, temp);
      arrayA[i] = arrayA[other];
      arrayA[other] = temp;
    }
    System.out.println("Reversed Array:");

    for(int i : arrayA){
      System.out.printf("%s ", i);
    }
  }
}
