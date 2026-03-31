package org.partapp.arrayapp.comparator;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.Comparator;

public class ArrayEntityCompareByFirstElement implements Comparator<ArrayEntity> {
  @Override
  public int compare(ArrayEntity array1, ArrayEntity array2) {
    return Integer.compare(array1.getArray()[0], array2.getArray()[0]);
  }
}
