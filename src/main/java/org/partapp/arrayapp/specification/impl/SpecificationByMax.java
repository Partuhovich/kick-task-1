package org.partapp.arrayapp.specification.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class SpecificationByMax implements Specification {
  private final int max;

  public SpecificationByMax(int max) {
    this.max = max;
  }

  @Override
  public boolean isSatisfiedBy(ArrayEntity entity) {
    Warehouse warehouse = Warehouse.getInstance();
    ArrayStats stats = warehouse.getById(entity.getId());
    return  stats.getMax() > max;
  }
}
