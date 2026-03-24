package org.partapp.arrayapp.reader;

import java.util.List;

public interface FileReader {
  List<String> readAllLines(String filePath);
}
