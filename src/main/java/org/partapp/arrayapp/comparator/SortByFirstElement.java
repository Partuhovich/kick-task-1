package org.partapp.arrayapp.comparator;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.Comparator;

public class SortByFirstElement implements Comparator<ArrayEntity> {

  @Override
  public int compare(ArrayEntity array1, ArrayEntity array2) {
      return Integer.compare(array1.get(0), array2.get(0));
  }
}
