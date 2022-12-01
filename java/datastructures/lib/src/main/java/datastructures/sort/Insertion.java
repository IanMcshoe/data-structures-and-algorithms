package datastructures.sort;

public class Insertion {
  public static void insertionSort(int[] input) {
    for(int i = 1; i < input.length; i++) {
      int temp = input[i];
      int j = i-1;

      while (j >= 0 && input[j] > temp) {
        input[j + 1] = input[j];
        j = j-1;
      }
      input[j + 1] = temp;
    }
  }

}
