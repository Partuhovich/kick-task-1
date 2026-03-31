package org.partapp.arrayapp.service;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface ArrayEntityOperation {

  int min(ArrayEntity array) throws CustomExeption;

  int max(ArrayEntity array) throws CustomExeption;

  int sum(ArrayEntity array) throws CustomExeption;

  double average(ArrayEntity array) throws CustomExeption;
}
