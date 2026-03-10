package org.partapp.arrayapp.factory.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.factory.ArrayEntityFactory;

public class ArrayEntityFactoryImpl implements ArrayEntityFactory {

  @Override
  public ArrayEntity createEmptyArrayEntity(int size){
    return new ArrayEntity(size);
  }

  @Override
  public ArrayEntity createArrayEntity(int[] array){
    return new ArrayEntity(array);
  }
}
