package org.partapp.arrayapp.util;

public class IdIncrementor {
  private static Long id = 0L;

  public static Long getNewId() {
    return id++;
  }
}
