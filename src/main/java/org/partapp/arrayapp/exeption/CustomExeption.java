package org.partapp.arrayapp.exeption;

public class CustomExeption extends Exception {

  public CustomExeption(String message) {
    super(message);
  }

  public CustomExeption(String message, Throwable cause) {
    super(message, cause);
  }

  public CustomExeption() {
  }
}
