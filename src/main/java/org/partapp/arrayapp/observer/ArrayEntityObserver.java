package org.partapp.arrayapp.observer;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface ArrayEntityObserver {

  void create(ArrayEntity array);
  void update(ArrayEntity array);
}
