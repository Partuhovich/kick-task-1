package org.partapp.arrayapp.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;
import org.partapp.arrayapp.warehouse.Warehouse;
import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayEntityRepository {
  private static final Logger logger = LogManager.getLogger();
  private final List<ArrayEntity> arrayEntitys;
  private static ArrayEntityRepository instance;

  private ArrayEntityRepository() {
    this.arrayEntitys = new ArrayList<>();
  }

  public static ArrayEntityRepository getInstance() {
    if (instance == null) {
      instance = new ArrayEntityRepository();
    }
    return instance;
  }

  public void add(ArrayEntity array) throws CustomExeption {
    logger.info("Add element to repository");
    if (array == null) {
      logger.warn("Cannot add null array entity");
      throw new CustomExeption("Cannot add null array entity");
    }
    arrayEntitys.add(array);
  }

  public void remove(Long id) throws CustomExeption {
    logger.info("Remove element from repository");
    ArrayEntity arrayToRemove = get(id);
    if (arrayToRemove == null) {
      logger.warn("Array with this id not found");
      throw new CustomExeption("Array with this id not found");
    }
    arrayEntitys.remove(arrayToRemove);
    Warehouse.getInstance().remove(id);
  }

  private ArrayEntity get(Long id) throws CustomExeption {
    logger.info("Get element from repository");
    if (id == null) {
      logger.warn("ID cannot be null");
      throw new CustomExeption("ID cannot be null");
    }

    for (ArrayEntity array : arrayEntitys) {
      if (array.getId().equals(id)) {
        return array;
      }
    }

    return null;
  }

  public List<ArrayEntity> query(Specification specification) {
    logger.info("Query from repository");
    List<ArrayEntity> result = new ArrayList<>();
    for (ArrayEntity array : arrayEntitys) {
      if (specification.isSatisfiedBy(array)) {
        result.add(array);
      }
    }
    return result;
  }

  public List<ArrayEntity> sort(Comparator<ArrayEntity> comparator) {
    logger.info("Sort repository with comparator");
    return arrayEntitys.stream()
            .sorted(comparator)
            .collect(Collectors.toList());
  }

}