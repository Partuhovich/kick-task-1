package org.partapp.arrayapp.service;

import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.service.impl.ArrayEntitySortImpl;

import static org.junit.jupiter.api.Assertions.*;

public class SortServiceTest {

  private final ArrayEntitySortImpl arraySort = new ArrayEntitySortImpl();
  private final int[] testData = {5, 2, 8, 1, 9, 3};
  private final int[] sortedData = {1, 2, 3, 5, 8, 9};
  private final ArrayEntity testArray = new ArrayEntity(testData);
  private final ArrayEntity sortedArray = new ArrayEntity(sortedData);

  @Test
  void bubble() throws CustomExeption {
    arraySort.bubbleSort(testArray);
    assertEquals(sortedArray, testArray);
  }

  @Test
  void selection() throws CustomExeption {
    arraySort.selectionSort(testArray);
    assertEquals(sortedArray, testArray);
  }
}
