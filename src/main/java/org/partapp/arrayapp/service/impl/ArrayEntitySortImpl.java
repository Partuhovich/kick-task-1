package org.partapp.arrayapp.service.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.service.ArrayEntitySort;

public class ArrayEntitySortImpl implements ArrayEntitySort {

  @Override
  public void bubbleSort(ArrayEntity array) {

    if (array == null || array.getSize() == 0) {
      return;
    }

    for (int i = 0; i < array.getSize(); i++) {
      boolean swapped = false;

      for (int j = 0; j < array.getSize() - i - 1; j++) {
        if (array.get(j) > array.get(j + 1)) {
          int temp = array.get(j);
          array.set(j, array.get(j + 1));
          array.set(j + 1, temp);
          swapped = true;
        }
      }

      if (!swapped) {
        break;
      }
    }
  }

  @Override
  public void selectionSort(ArrayEntity array) {
    if (array == null || array.getSize() == 0) {
      return;
    }

    for (int i = 0; i < array.getSize() - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.getSize(); j++) {
        if (array.get(j) < array.get(minIndex)) {
          minIndex = j;
        }
      }

      if (minIndex != i) {
        int temp = array.get(i);
        array.set(i, array.get(minIndex));
        array.set(minIndex, temp);
      }
    }
  }
}
