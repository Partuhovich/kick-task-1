package org.partapp.arrayapp.repository;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface ArrayRepository {
  void add(ArrayEntity array) throws CustomExeption;
  void remove(Long id) throws CustomExeption;
}
