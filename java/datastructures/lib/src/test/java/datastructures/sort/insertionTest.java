package datastructures.sort;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class insertionTest {


  @Test
  public void testInsertionSort() {
    int[] input = {8,4,23,42,16,15};
    Insertion.insertionSort(input);
    int[] expected = {4,8,15,16,23,42};
    assertArrayEquals("Sorted!", expected, input);
  }
}
