package org.partapp.arrayapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.factory.impl.ArrayEntityFactoryImpl;
import org.partapp.arrayapp.service.impl.ArrayEntityOperationImpl;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

  private ArrayEntityOperationImpl arrayOperation;
  private ArrayEntity testArrayEntity ;

  @BeforeEach
  void setUp() throws CustomExeption {
    ArrayEntityFactoryImpl factory = new ArrayEntityFactoryImpl();
    arrayOperation = new ArrayEntityOperationImpl();
    testArrayEntity = factory.createArrayEntity(new int[]{4, 5, 8, 2, 7, 3});
  }

  @Test
  void testMin() throws CustomExeption {
    int expectedMin = 2;
    int actualMin = arrayOperation.min(testArrayEntity);
    assertEquals(expectedMin, actualMin);
  }

  @Test
  void testMax() throws CustomExeption {
    int expectedMax = 8;
    int actualMax = arrayOperation.max(testArrayEntity);
    assertEquals(expectedMax, actualMax);
  }

  @Test
  void testSum() throws CustomExeption {
    int expectedSum = 29;
    int actualSum = arrayOperation.sum(testArrayEntity);
    assertEquals(expectedSum, actualSum);
  }

  @Test
  void testAverage() throws CustomExeption {
    double expectedAverage = 29.0 / 6.0;
    double actualAverage = arrayOperation.average(testArrayEntity);
    assertEquals(expectedAverage, actualAverage, 0.0001);
  }
}
