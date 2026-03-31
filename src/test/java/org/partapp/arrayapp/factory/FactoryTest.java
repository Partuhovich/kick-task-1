package org.partapp.arrayapp.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.factory.impl.ArrayEntityFactoryImpl;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

  private ArrayEntityFactoryImpl factory;

  @BeforeEach
  void setUp() {
    factory = new ArrayEntityFactoryImpl();
  }

  @Test
  void testCreateEmptyArrayEntity() throws CustomExeption {
    int size = 5;
    ArrayEntity array = factory.createEmptyArrayEntity(size);

    assertEquals(size, array.getSize());
  }

  @Test
  void testCreateArrayEntity() throws CustomExeption {
    int[] inputArray = {1, 2, 3, 4, 5};
    ArrayEntity array = factory.createArrayEntity(inputArray);

    assertEquals(inputArray.length, array.getSize());
    for (int i = 0; i < inputArray.length; i++) {
      assertEquals(inputArray[i], array.get(i));
    }
  }
}