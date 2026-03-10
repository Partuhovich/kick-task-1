package org.partapp.arrayapp.service;

import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.service.impl.ArrayEntityOperationImpl;

import static org.junit.jupiter.api.Assertions.*;

public class MinMaxSumServiceTest {

  private final ArrayEntityOperationImpl arrayOperation = new ArrayEntityOperationImpl();
  private final int[] testData = {5, 2, 8, 1, 9, 3};
  private final ArrayEntity testArray = new ArrayEntity(testData);

  @Test
  void findMin() {
    int min = arrayOperation.min(testArray);
    assertEquals(1, min);
  }

  @Test
  void findMax() {
    int max = arrayOperation.max(testArray);
    assertEquals(9, max);
  }

  @Test
  void findSum() {
    int sum = arrayOperation.sum(testArray);
    assertEquals(28, sum);
  }

}
