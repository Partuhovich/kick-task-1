package org.partapp.arrayapp.reader.impl;

import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.reader.ArrayReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {

  @Override
  public List<String> readLines(String filePath) throws CustomExeption {

    Path path = Paths.get(filePath);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      throw new CustomExeption("Failed to read file: " + filePath);
    }

    return lines;
  }

}
