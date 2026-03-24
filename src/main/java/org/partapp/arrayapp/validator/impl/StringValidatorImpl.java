package org.partapp.arrayapp.validator.impl;

import org.partapp.arrayapp.entity.ArrayEntity;
import org.partapp.arrayapp.validator.ArrayValidator;

public class ArrayValidatorImpl implements ArrayValidator {

  private static final String NUMBER_REGEX = "^-?\\d+$";
  private static final String DELIMITER_REGEX = "\\s*[;,]\\s*|(?<=\\d)\\s*-\\s*(?=\\d)|\\s+";

  @Override
  public boolean isArrayValid(String line) {
    if (line == null || line.isBlank()) {
      return false;
    }

    String[] tokens = line.strip().split(DELIMITER_REGEX);

    for (String token : tokens) {
      if (token.trim().isEmpty()) {
        continue;
      }
      if (!token.trim().matches(NUMBER_REGEX)) {
        return false;
      }
    }

    return true;
  }

  @Override
  public String getDelimeter() {
    return DELIMITER_REGEX;
  }
}
