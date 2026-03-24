package org.partapp.arrayapp.service;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface ArrayEntitySort {

  void bubbleSort(ArrayEntity array) throws CustomExeption;

  void selectionSort(ArrayEntity array) throws CustomExeption;
}
