package org.partapp.arrayapp.exeption;

public class CustomExeption extends Exception {

  public CustomExeption() {
  }

  public CustomExeption(String message) {
    super(message);
  }

  public CustomExeption(Throwable cause) {
    super(cause);
  }

  public CustomExeption(String message, Throwable cause) {
    super(message, cause);
  }
}
