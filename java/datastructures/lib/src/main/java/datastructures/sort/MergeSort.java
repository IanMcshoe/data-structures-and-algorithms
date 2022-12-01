package datastructures.sort;

public class MergeSort {
  public static void mergeSort(int[] arr, int length) {
    if (length < 2) {
      return;
    }
    int mid = length / 2;
    int[] left = new int[mid];
    int[] right = new int[length - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }
    for (int i = mid; i < length; i++) {
      right[i - mid] = arr[i];
    }
    mergeSort(left, mid);
    mergeSort(right, length - mid);

    merge(arr, left, right, mid, length - mid);
  }

  public static void merge(int[] arr, int[] left2, int[] right2, int left, int right) {
    int i = 0, j = 0;
    while (i < left && j < right) {
      if (left2[i] <= right2[j]) {
        arr[i + j] = left2[i];
        i++;
      } else {
        arr[i + j] = right2[j];
        j++;
      }
    }
    while (i < left) {
      arr[i + j] = left2[i];
      i++;
    }
    while (j < right) {
      arr[i + j] = right2[j];
      j++;
    }
  }
}
