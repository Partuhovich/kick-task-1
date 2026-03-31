package org.partapp.arrayapp.parser;

import org.partapp.arrayapp.exeption.CustomExeption;

public interface CustomParser {
  int[] parseString(String arrayLine) throws CustomExeption;
}
