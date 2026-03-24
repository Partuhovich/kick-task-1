package org.partapp.arrayapp.repository.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.repository.ArrayRepository;
import org.partapp.arrayapp.warehouse.Warehouse;
import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepositoryImpl implements ArrayRepository {
  private final List<ArrayEntity> arrays;
  private static ArrayRepositoryImpl instance;

  private ArrayRepositoryImpl() {
    this.arrays = new ArrayList<>();
  }

  public static ArrayRepositoryImpl getInstance() {
    if (instance == null) {
      instance = new ArrayRepositoryImpl();
    }
    return instance;
  }

  @Override
  public void add(ArrayEntity array) throws CustomExeption {
      if (array == null) {
        throw new CustomExeption("Cannot add null array entity");
      }
      arrays.add(array);
  }

  @Override
  public void remove(Long id) throws CustomExeption {
      ArrayEntity arrayToRemove = findById(id);
      if (arrayToRemove == null) {
      }
      arrays.remove(arrayToRemove);
      Warehouse.getInstance().remove(id);
  }

  private ArrayEntity findById(Long id) throws CustomExeption {
    if (id == null) {
      throw new CustomExeption("ID cannot be null");
    }

    for (ArrayEntity array : arrays) {
      if (array.getId().equals(id)) {
        return array;
      }
    }

    return null;
  }
}