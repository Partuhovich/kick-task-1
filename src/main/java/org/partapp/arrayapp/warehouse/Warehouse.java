package org.partapp.arrayapp.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static Warehouse instance;
  private final Map<Long, ArrayStats> arrayStatsMap;

  private Warehouse(){
    this.arrayStatsMap = new HashMap<>();
  }

  public static Warehouse getInstance() {
    if (instance == null) {
      instance = new Warehouse();
    }
    return instance;
  }

  public void change(Long id, ArrayStats newArrayStats){
    arrayStatsMap.replace(id, newArrayStats);
  }

  public void put(Long id, ArrayStats arrayStats) {
    arrayStatsMap.put(id, arrayStats);
  }

  public void remove(Long id) {
    arrayStatsMap.remove(id);
  }

  public ArrayStats getById(Long id){
    return arrayStatsMap.get(id);
  }
}
