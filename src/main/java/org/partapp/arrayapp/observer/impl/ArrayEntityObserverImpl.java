package org.partapp.arrayapp.observer.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.observer.ArrayEntityObserver;
import org.partapp.arrayapp.repository.impl.ArrayRepositoryImpl;
import org.partapp.arrayapp.service.ArrayEntityOperation;
import org.partapp.arrayapp.service.impl.ArrayEntityOperationImpl;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class ArrayEntityObserverImpl implements ArrayEntityObserver {
  Warehouse warehouseObserver = Warehouse.getInstance();
  ArrayRepositoryImpl repositoryObserver = ArrayRepositoryImpl.getInstance();
  ArrayEntityOperationImpl arrayOperation = new ArrayEntityOperationImpl();

  @Override
  public void create(ArrayEntity array) {
    repositoryObserver.add(array);
    warehouseObserver.put(array.getId(), getStats(array));
  }

  @Override
  public void update(ArrayEntity array) {
    warehouseObserver.change(array.getId(), getStats(array));
  }

  private ArrayStats getStats(ArrayEntity array) {
    int min = arrayOperation.min(array);
    int max = arrayOperation.max(array);
    int sum = arrayOperation.sum(array);
    double average = arrayOperation.average(array);

    return new ArrayStats(min, max, sum, average);
  }
}
