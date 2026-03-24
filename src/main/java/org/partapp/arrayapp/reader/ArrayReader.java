package org.partapp.arrayapp.reader;

import org.partapp.arrayapp.exeption.CustomExeption;

import java.util.List;

public interface ArrayReader {
  List<String> readLines(String filePath) throws CustomExeption;
}
