package org.partapp.arrayapp.specification.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class SpecificationBySum implements Specification {
  private final int sum;

  public SpecificationBySum(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean isSatisfiedBy(ArrayEntity entity) {
    Warehouse warehouse = Warehouse.getInstance();
    ArrayStats stats = warehouse.getById(entity.getId());
    return  stats.getSum() > sum;
  }
}
