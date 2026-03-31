package org.partapp.arrayapp.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.observer.Observable;
import org.partapp.arrayapp.observer.Observer;
import org.partapp.arrayapp.util.IdIncrementor;
import org.partapp.arrayapp.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEntity implements Observable {
  private static final Logger logger = LogManager.getLogger(ArrayEntity.class);
  private final int[] array;
  private final Long id;
  List<Observer> observers = new ArrayList<>();



  public ArrayEntity(int size) throws CustomExeption {
    this.id = IdIncrementor.getNewId();
    this.array = new int[size];
    notifyObservers();
    logger.info("Empty ArrayEntity created");
  }

  public ArrayEntity(int[] array) throws CustomExeption {
    this.id = IdIncrementor.getNewId();
    this.array = Arrays.copyOf(array, array.length);
    notifyObservers();
    logger.info("ArrayEntity created");
  }

  public int getSize() {
    logger.info("Get size");
    return array.length;
  }

  public int get(int index) throws CustomExeption {
    logger.info("Get element");
    if (this.isOutOfBounds(index)) {
      throw new CustomExeption("Out of bounds");
    }
    return array[index];
  }

  public void set(int index, int value) throws CustomExeption {
    if (this.isOutOfBounds(index)) {
      logger.warn("Index is out of bound");
      throw new CustomExeption("Out of bounds");
    }
    logger.info("Set id");
    array[index] = value;
    notifyObservers();
  }

  public Long getId() {
    logger.info("Get id");
    return this.id;
  }

  public int[] getArray() {
    logger.info("Get array");
    return array.clone();
  }

  @Override
  public void addObserver(Observer observer) {
    logger.info("Add Observer");
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    logger.info("Remove Observer");
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() throws CustomExeption {
    logger.info("Notify Observers");
    for (Observer observer : observers) {
      observer.update(this);
    }
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
