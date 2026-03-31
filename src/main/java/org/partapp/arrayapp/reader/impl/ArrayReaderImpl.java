package org.partapp.arrayapp.reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.reader.ArrayReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {
  private static final Logger logger = LogManager.getLogger(ArrayReaderImpl.class);

  @Override
  public List<String> readLines(String filePath) throws CustomExeption {
    logger.info("Read file");
    List<String> lines = new ArrayList<>();
    try {
      Path path = Paths.get(filePath);
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      logger.warn("Failed to read file");
      throw new CustomExeption("Failed to read file: " + filePath);
    }

    return lines;
  }

}
