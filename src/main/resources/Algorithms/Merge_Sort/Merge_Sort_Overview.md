# Merge Sort Overview:

### Overview:
* **Merge Sort** is a popular and efficient **sorting algorithm** that falls under the category of **divide and 
  conquer** algorithms
* It works by **recursively dividing** a **list** into **smaller sublists**, **sorting those sublists**, and then 
  **merging them back** together to produce a fully sorted list
* Here's how the Merge Sort algorithm works:
  * **Step 1: Divide:**
    * The **original unsorted list** is **divided** into **two equal-sized sublists**
    * If the list has an **odd number of elements**, **one sublist will have one more element than the other**
  * **Step 2: Conquer:**
    * **Recursively sort both sublists**
    * This step involves **applying the Merge Sort algorithm to each of the sublists until they are fully sorted**
  * **Step 3: Merge:**
    * **Merge** the **two sorted sublists** into a **single sorted list**
    * This merging process involves **comparing elements from both sublists** and placing them in the **correct order** in a 
      **new auxiliary list**
  * **Step 4: Repeat steps 1-3** **until all sublists are merged**, and you have a **single sorted list**
* Merge Sort is a **stable sorting algorithm**, meaning it **maintains the relative order of equal elements**
* It has a time complexity of **O(n log n)** in the **worst, average, and best cases**, making it **efficient** for 
  **sorting large datasets**
* However, it does **require additional space** for the **auxiliary lists** used **during the merging process**, which 
  can make it **less memory-efficient** in comparison to **in-place sorting algorithms**
* * <img src="images/Merge_Sort_Diagram.png" width="300">
  
### Java Implementation:
```java
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return; // Array is already sorted
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Split the array into two halves
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, n - mid);

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int nLeft = left.length;
        int nRight = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nLeft && j < nRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < nLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < nRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
```
* In this Java code, the **`mergeSort` function** sorts an **array** using the **merge sort algorithm**
* It **divides the array** into **two halves**, **recursively sorts each half**, and then **merges the two sorted 
  halves**
* The **`merge` function** is used to **merge two sorted subarrays** back into a **single sorted array**
* It **compares** elements from the **left and right subarrays** and **merges them in ascending order**
* The `main` function demonstrates **how to use the `mergeSort` function** to sort an array
* This code will output the sorted array after applying the merge sort algorithm