package org.partapp.arrayapp.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.exeption.CustomExeption;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayEntityTest {

  private ArrayEntity arrayEntity;

  @BeforeEach
  void setUp() throws CustomExeption {
    arrayEntity = new ArrayEntity(new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void testGetSize() throws CustomExeption {
    assertEquals(5, arrayEntity.getSize());
  }

  @Test
  void testGet() throws CustomExeption {
    assertEquals(1, arrayEntity.get(0));
    assertEquals(3, arrayEntity.get(2));
    assertEquals(5, arrayEntity.get(4));
  }

  @Test
  void testSet() throws CustomExeption {
    arrayEntity.set(2, 10);
    assertEquals(10, arrayEntity.get(2));
  }

  @Test
  void testGetId() {
    assertNotNull(arrayEntity.getId());
  }

  @Test
  void testGetArray() throws CustomExeption {
    int[] expected = {1, 2, 3, 4, 5};
    int[] actual = arrayEntity.getArray();

    assertArrayEquals(expected, actual);
  }
}