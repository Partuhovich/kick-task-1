package org.partapp.arrayapp.specification.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class SpecificationByMin implements Specification {
  private final int min;

  public SpecificationByMin(int min) {
    this.min = min;
  }

  @Override
  public boolean isSatisfiedBy(ArrayEntity entity) {
    Warehouse warehouse = Warehouse.getInstance();
    ArrayStats stats = warehouse.getById(entity.getId());
    return  stats.getMin() > min;
  }
}
