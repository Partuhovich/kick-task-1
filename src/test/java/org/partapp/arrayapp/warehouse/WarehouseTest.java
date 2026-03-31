package org.partapp.arrayapp.warehouse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {

  private Warehouse warehouse;
  private ArrayEntity arrayEntity;
  private ArrayStats arrayStats;

  @BeforeEach
  void setUp() throws CustomExeption {
    warehouse = Warehouse.getInstance();
    arrayEntity = new ArrayEntity(new int[]{1, 2, 3, 4, 5});
    arrayStats = new ArrayStats(1, 5, 15, 3.0);
  }

  @Test
  void testPut() throws CustomExeption {
    warehouse.put(arrayEntity.getId(), arrayStats);
    assertNotNull(warehouse.get(arrayEntity.getId()));
  }

  @Test
  void testGet() throws CustomExeption {
    warehouse.put(arrayEntity.getId(), arrayStats);
    ArrayStats retrievedStats = warehouse.get(arrayEntity.getId());

    assertNotNull(retrievedStats);
    assertEquals(arrayStats.getMin(), retrievedStats.getMin());
    assertEquals(arrayStats.getMax(), retrievedStats.getMax());
    assertEquals(arrayStats.getSum(), retrievedStats.getSum());
    assertEquals(arrayStats.getAverage(), retrievedStats.getAverage());
  }

  @Test
  void testRemove() throws CustomExeption {
    warehouse.put(arrayEntity.getId(), arrayStats);
    warehouse.remove(arrayEntity.getId());

    assertNull(warehouse.get(arrayEntity.getId()));
  }
}