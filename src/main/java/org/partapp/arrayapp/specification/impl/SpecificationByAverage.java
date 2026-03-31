package org.partapp.arrayapp.specification.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
    ArrayStats stats = Warehouse.getInstance().get(entity.getId());
    return  stats.getAverage() > average;
  }
}
