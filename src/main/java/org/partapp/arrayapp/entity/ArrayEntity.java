package org.partapp.arrayapp.entity;

import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.observer.impl.ArrayEntityObserverImpl;
import org.partapp.arrayapp.util.IdIncrementor;

import java.util.Arrays;

public class ArrayEntity {
  private final int[] array;
  private final Long id;
  private final ArrayEntityObserverImpl observer = new ArrayEntityObserverImpl();


  public ArrayEntity(int size) {
    this.id = IdIncrementor.getNewId();
    this.array = new int[size];
    observer.create(this);
  }

  public ArrayEntity(int[] array) {
    this.id = IdIncrementor.getNewId();
    this.array = Arrays.copyOf(array, array.length);
    observer.create(this);
  }

  public int getSize() {
    return array.length;
  }

  public int get(int index) throws CustomExeption {
    if (this.isOutOfBounds(index)) {
      throw new CustomExeption("Out of bounds");
    }
    return array[index];
  }

  public void set(int index, int value) throws CustomExeption {
    if (this.isOutOfBounds(index)) {
      throw new CustomExeption("Out of bounds");
    }
    array[index] = value;
    observer.update(this);
  }

  public Long getId() {
    return this.id;
  }

  private boolean isOutOfBounds(int index) {
    return index < 0 || index >= this.getSize();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ArrayEntity that = (ArrayEntity) o;
    return Arrays.equals(array, that.array);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(array);
  }

}
