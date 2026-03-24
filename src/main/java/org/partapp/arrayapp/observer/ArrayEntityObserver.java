package org.partapp.arrayapp.observer;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface ArrayEntityObserver {

  void create(ArrayEntity array) throws CustomExeption;
  void update(ArrayEntity array);
}
