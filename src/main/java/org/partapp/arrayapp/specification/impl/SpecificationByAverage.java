package org.partapp.arrayapp.specification.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;
import org.partapp.arrayapp.warehouse.ArrayStats;
import org.partapp.arrayapp.warehouse.Warehouse;

public class SpecificationByAverage implements Specification {
  private final double average;

  public SpecificationByAverage(double average) {
    this.average = average;
  }

  @Override
  public boolean isSatisfiedBy(ArrayEntity entity) {
    Warehouse warehouse = Warehouse.getInstance();
    ArrayStats stats = warehouse.getById(entity.getId());
    return  stats.getAverage() > average;
  }
}
