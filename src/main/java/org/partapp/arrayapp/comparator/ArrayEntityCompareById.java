package org.partapp.arrayapp.comparator;

import org.partapp.arrayapp.entity.ArrayEntity;

import java.util.Comparator;

public class ArrayEntityCompareById implements Comparator<ArrayEntity> {
  @Override
  public int compare(ArrayEntity array1, ArrayEntity array2) {
    return Long.compare(array1.getId(), array2.getId());
  }
}
