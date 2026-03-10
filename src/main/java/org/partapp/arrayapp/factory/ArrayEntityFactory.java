package org.partapp.arrayapp.factory;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface ArrayEntityFactory {
  ArrayEntity createEmptyArrayEntity(int size);
  ArrayEntity createArrayEntity(int[] array);
}
