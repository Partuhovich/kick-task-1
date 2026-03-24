package org.partapp.arrayapp.repository;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface ArrayRepository {
  void add(ArrayEntity array);
  void remove(Long id);
}
