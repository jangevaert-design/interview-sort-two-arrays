public class MergeTwoSorted {
/*
merge array1[0.. n1 - 1] and array2[0...n2 - 1]
to array3[0.. n1 + n2 - 1]
 */

  public static void mergeArrays(int[] array1, int[] array2, int n1, int n2, int[] array3) {
    int i = 0, j = 0, k = 0;

    //traverse both arrays
    while (i < n1 && j < n2) {
      /*
      check whether current element of the first array is smaller than the current element of the
      second array. If yes, store element of first array and increment first array index. Otherwise
      do the same for the second array.
       */
      if (array1[i] < array2[j]) {
        array3[k] = array1[i];
        i++;
        k++;
      } else {
        array3[k] = array2[j];
        j++;
        k++;
      }
    }
    // store remaining elements of array1
    while (i < n1) {
      array3[k] = array1[i];
      i++;
      k++;
    }
    // store remaining elements of array2
    while (j < n2) {
      array3[k] = array2[j];
      j++;
      k++;
    }
  }


  public static void main(String[] args) {
    int[] array1 = {1, 3, 5, 7};
    int n1 = array1.length;

    int[] array2 = {2, 4, 6, 8};
    int n2 = array2.length;

    int[] array3 = new int[n1 + n2];

    mergeArrays(array1, array2, n1, n2, array3);

    System.out.println("Array 3 after merging: ");
    for (int i = 0; i < n1 + n2; i++) {
      System.out.print(array3[i]);
    }
  }
}
