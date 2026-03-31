package org.partapp.arrayapp.observer.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.observer.Observer;
import org.partapp.arrayapp.service.impl.ArrayEntityOperationImpl;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class ArrayEntityObserverImpl implements Observer {
  private final ArrayEntityOperationImpl arrayOperation = new ArrayEntityOperationImpl();

  @Override
  public void update(ArrayEntity array) throws CustomExeption {
    Warehouse.getInstance().put(array.getId(), getStats(array));
  }

  private ArrayStats getStats(ArrayEntity array) throws CustomExeption {
    int min = arrayOperation.min(array);
    int max = arrayOperation.max(array);
    int sum = arrayOperation.sum(array);
    double average = arrayOperation.average(array);

    return new ArrayStats(min, max, sum, average);
  }
}
