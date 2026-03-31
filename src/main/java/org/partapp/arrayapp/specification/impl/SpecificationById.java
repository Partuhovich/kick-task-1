package org.partapp.arrayapp.specification.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.specification.Specification;

public class SpecificationById implements Specification {
  private final Long id;

  public SpecificationById(Long id) {
    this.id = id;
  }

  @Override
  public boolean isSatisfiedBy(ArrayEntity entity) {
    return entity.getId().equals(id);
  }
}
