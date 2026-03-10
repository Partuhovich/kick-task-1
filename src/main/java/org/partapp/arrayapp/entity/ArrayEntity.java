package org.partapp.arrayapp.entity;

import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.Arrays;

public class ArrayEntity {

  private final int[] array;

  public ArrayEntity(int size) {
    this.array = new int[size];
  }

  public ArrayEntity(int[] array) {
    this.array = Arrays.copyOf(array, array.length);
  }

  public int getSize() {
    return array.length;
  }

  public int get(int index) {
    if (this.isOutOfBounds(index)) {
      throw new CustomExeption("Out of bounds");
    }
    return array[index];
  }

  public void set(int index, int value) {
    if (this.isOutOfBounds(index)) {
      throw new CustomExeption("Out of bounds");
    }
    array[index] = value;
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
