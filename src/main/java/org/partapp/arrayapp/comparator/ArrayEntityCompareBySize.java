package org.partapp.arrayapp.comparator;

import org.partapp.arrayapp.entity.ArrayEntity;

import java.util.Comparator;

public class ArrayEntityCompareBySize implements Comparator<ArrayEntity> {
  @Override
  public int compare(ArrayEntity array1, ArrayEntity array2) {
    return Integer.compare(array1.getSize(), array2.getSize());
  }
}
