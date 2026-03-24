package org.partapp.arrayapp.warehouse;

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

  public void setMin(int min) {
    this.min = min;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public double getAverage() {
    return average;
  }

  public void setAverage(double average) {
    this.average = average;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }
}
