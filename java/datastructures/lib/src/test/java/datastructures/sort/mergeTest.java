package datastructures.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class mergeTest {

  @Test
  public void mergeSort() {
    int[] actual = {8,4,23,42,16,15};
    int[] expected = {4,8,15,16,23,42};
    MergeSort.mergeSort(actual, actual.length);
    assertArrayEquals(expected, actual);
  }

}
