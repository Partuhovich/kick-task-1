package org.partapp.arrayapp.validator.impl;

import org.partapp.arrayapp.validator.StringValidator;

public class StringValidatorImpl implements StringValidator {

  private static final String NUMBER_REGEX = "^-?\\d+$";
  private static final String DELIMITER_REGEX = "\\s*[;,]\\s*|(?<=\\d)\\s*-\\s*(?=\\d)|\\s+";

  @Override
  public boolean isStringValid(String arrayLine) {
    if (arrayLine == null || arrayLine.isBlank()) {
      return false;
    }

    String[] tokens = arrayLine.strip().split(DELIMITER_REGEX);

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
