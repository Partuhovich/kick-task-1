package org.partapp.arrayapp.service.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.service.ArrayEntityOperation;

public class ArrayEntityOperationImpl implements ArrayEntityOperation {

  @Override
  public int min(ArrayEntity array) {
    int min = array.get(0);
    for (int i = 1; i < array.getSize(); i++) {
      if (min > array.get(i)) {
        min = array.get(i);
      }
    }
    return min;
  }

  @Override
  public int max(ArrayEntity array) {
    int max = array.get(0);
    for (int i = 1; i < array.getSize(); i++) {
      if (max < array.get(i)) {
        max = array.get(i);
      }
    }
    return max;
  }

  @Override
  public int sum(ArrayEntity array) {
    int sum = 0;
    for (int i = 0; i < array.getSize(); i++) {
      sum += array.get(i);
    }
    return sum;
  }

  @Override
  public double average(ArrayEntity array) {
    return (double) sum(array) / array.getSize();
  }
}
