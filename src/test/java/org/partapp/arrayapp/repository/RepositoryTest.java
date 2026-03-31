package org.partapp.arrayapp.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

import static org.junit.jupiter.api.Assertions.*;

public class RepositoryTest {

  private ArrayEntityRepository repository;
  private ArrayEntity arrayEntity;

  @BeforeEach
  void setUp() throws CustomExeption {
    repository = ArrayEntityRepository.getInstance();
    arrayEntity = new ArrayEntity(new int[]{1, 2, 3, 4, 5});
  }

  @Test
  void testAdd() throws CustomExeption {
    repository.add(arrayEntity);
    assertNotNull(arrayEntity.getId());
  }

  @Test
  void testRemove() throws CustomExeption {
    repository.add(arrayEntity);
    repository.remove(arrayEntity.getId());
  }
}