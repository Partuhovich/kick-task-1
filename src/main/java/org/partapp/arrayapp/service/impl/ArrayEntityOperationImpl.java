package org.partapp.arrayapp.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.service.ArrayEntityOperation;

public class ArrayEntityOperationImpl implements ArrayEntityOperation {
  private static final Logger logger = LogManager.getLogger(ArrayEntityOperationImpl.class);

  @Override
  public int min(ArrayEntity array) throws CustomExeption {
    logger.info("Get min");
    int min = array.get(0);
    for (int i = 1; i < array.getSize(); i++) {
      if (min > array.get(i)) {
        min = array.get(i);
      }
    }
    return min;
  }

  @Override
  public int max(ArrayEntity array) throws CustomExeption {
    logger.info("Get max");
    int max = array.get(0);
    for (int i = 1; i < array.getSize(); i++) {
      if (max < array.get(i)) {
        max = array.get(i);
      }
    }
    return max;
  }

  @Override
  public int sum(ArrayEntity array) throws CustomExeption {
    logger.info("Get sum");
    int sum = 0;
      for (int i = 0; i < array.getSize(); i++) {
        sum += array.get(i);
      }
    return sum;
  }

  @Override
  public double average(ArrayEntity array) throws CustomExeption {
    logger.info("Get average");
    return (double) sum(array) / array.getSize();
  }
}
