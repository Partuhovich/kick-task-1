package org.partapp.arrayapp.warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayStats {
  private int min;
  private int max;
  private int sum;
  private double average;

  public ArrayStats(int min, int max, int sum, double average) {
    this.min = min;
    this.max = max;
    this.sum = sum;
    this.average = average;
  }

  public int getMin() {
    return min;
  }

  public int getMax() {
    return max;
  }

  public double getAverage() {
    return average;
  }

  public int getSum() {
    return sum;
  }
}
