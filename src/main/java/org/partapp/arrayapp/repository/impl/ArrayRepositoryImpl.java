package org.partapp.arrayapp.repository.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.repository.ArrayRepository;
import org.partapp.arrayapp.warehouse.Warehouse;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepositoryImpl implements ArrayRepository {
  private static final Logger logger = LogManager.getLogger(ArrayRepositoryImpl.class);
  private final List<ArrayEntity> arrays;
  private static ArrayRepositoryImpl instance;

  private ArrayRepositoryImpl() {
    this.arrays = new ArrayList<>();
    logger.info("ArrayRepositoryImpl initialized");
  }

  public static ArrayRepositoryImpl getInstance() {
    if (instance == null) {
      instance = new ArrayRepositoryImpl();
      logger.debug("Created new instance of ArrayRepositoryImpl");
    }
    return instance;
  }

  @Override
  public void add(ArrayEntity array) {
    try {
      if (array == null) {
        throw new CustomExeption("Cannot add null array entity");
      }
      arrays.add(array);
      logger.info("Added array entity with id: {}", array.getId());
    } catch (CustomExeption e) {
      logger.error("Failed to add array entity: {}", e.getMessage(), e);
      throw new RuntimeException(e);
    }
  }

  @Override
  public void remove(Long id) {
    try {
      ArrayEntity arrayToRemove = findById(id);
      if (arrayToRemove == null) {
        throw new CustomExeption("Array entity with id " + id + " not found");
      }
      arrays.remove(arrayToRemove);
      Warehouse.getInstance().remove(id);
      logger.info("Removed array entity with id: {}", id);
    } catch (CustomExeption e) {
      logger.error("Failed to remove array entity with id {}: {}", id, e.getMessage(), e);
      throw new RuntimeException(e);
    }
  }

  private ArrayEntity findById(Long id) throws CustomExeption {
    if (id == null) {
      throw new CustomExeption("ID cannot be null");
    }

    for (ArrayEntity array : arrays) {
      if (array.getId().equals(id)) {
        logger.debug("Found array entity with id: {}", id);
        return array;
      }
    }

    logger.warn("Array entity with id {} not found", id);
    return null;
  }
}