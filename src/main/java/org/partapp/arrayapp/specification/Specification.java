package org.partapp.arrayapp.specification;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface Specification {
  boolean isSatisfiedBy(ArrayEntity entity);
}
