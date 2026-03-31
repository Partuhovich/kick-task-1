package org.partapp.arrayapp.factory.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.factory.ArrayEntityFactory;

public class ArrayEntityFactoryImpl implements ArrayEntityFactory {

  @Override
  public ArrayEntity createEmptyArrayEntity(int size) throws CustomExeption {
    if(size < 0) {
      throw new CustomExeption("Array size cannot be negative");
    }
    return new ArrayEntity(size);
  }

  @Override
  public ArrayEntity createArrayEntity(int[] array) throws CustomExeption {
    return new ArrayEntity(array);
  }
}
