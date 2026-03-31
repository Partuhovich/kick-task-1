package org.partapp.arrayapp.warehouse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static final Logger logger = LogManager.getLogger(Warehouse.class);
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

  public void changeArrayStats(ArrayEntity array) {
    ArrayStats stats = arrayStatsMap.get(array.getId());
  }

  public ArrayStats get(Long id){
    logger.info("Get stats from warehouse");
    return arrayStatsMap.get(id);
  }

  public void put(Long id, ArrayStats stats ) throws CustomExeption {
    logger.info("Put stats into warehouse");
    arrayStatsMap.put(id, stats);
  }

  public void remove(Long id) {
    logger.info("Remove stats from warehouse");
    arrayStatsMap.remove(id);
  }
}
