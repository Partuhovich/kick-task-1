package org.partapp.arrayapp.observer;

import org.partapp.arrayapp.exeption.CustomExeption;

public interface Observable {
  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers() throws CustomExeption;
}
