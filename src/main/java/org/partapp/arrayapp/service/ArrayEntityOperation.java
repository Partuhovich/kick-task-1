package org.partapp.arrayapp.service;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface ArrayEntityOperation {

  int min(ArrayEntity array);

  int max(ArrayEntity array);

  int sum(ArrayEntity array);
}
