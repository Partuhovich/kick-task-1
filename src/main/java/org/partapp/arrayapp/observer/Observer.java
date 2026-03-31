package org.partapp.arrayapp.observer;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface Observer {
  void update(ArrayEntity array) throws CustomExeption;
}
