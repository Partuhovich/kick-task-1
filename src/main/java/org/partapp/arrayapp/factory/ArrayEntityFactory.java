package org.partapp.arrayapp.factory;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

public interface ArrayEntityFactory {
  ArrayEntity createEmptyArrayEntity(int size) throws CustomExeption;
  ArrayEntity createArrayEntity(int[] array) throws CustomExeption;
}
