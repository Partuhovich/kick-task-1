package org.partapp.arrayapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.factory.impl.ArrayEntityFactoryImpl;
import org.partapp.arrayapp.service.impl.ArrayEntitySortImpl;

import static org.junit.jupiter.api.Assertions.*;

public class SortServiceTest {

  private ArrayEntitySortImpl arraySort;
  private ArrayEntity array;

  @BeforeEach
  void setUp() throws CustomExeption {
    ArrayEntityFactoryImpl factory = new ArrayEntityFactoryImpl();
    arraySort = new ArrayEntitySortImpl();
    array = factory.createArrayEntity(new int[]{4, 5, 8, 2, 7, 3});
  }

  @Test
  void testBubbleSort() throws CustomExeption {
    arraySort.bubbleSort(array);

    int[] expected = {2, 3, 4, 5, 7, 8};
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], array.get(i));
    }
  }

  @Test
  void testSelectionSort() throws CustomExeption {
    arraySort.selectionSort(array);

    int[] expected = {2, 3, 4, 5, 7, 8};
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], array.get(i));
    }
  }
}