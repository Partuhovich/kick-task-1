package org.partapp.arrayapp.comparator;

import org.partapp.arrayapp.entity.ArrayEntity;

import java.util.Comparator;

public class SortById implements Comparator<ArrayEntity> {
  @Override
  public int compare(ArrayEntity array1, ArrayEntity array2) {
    return Integer.compare(Math.toIntExact(array1.getId()), Math.toIntExact(array2.getId()));
  }
}
