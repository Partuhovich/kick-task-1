package org.partapp.arrayapp.parser.impl;

import org.partapp.arrayapp.parser.CustomParser;
import org.partapp.arrayapp.validator.StringValidator;
import org.partapp.arrayapp.validator.impl.StringValidatorImpl;

public class CustomParserImpl implements CustomParser {

  StringValidator validator = new StringValidatorImpl();

  @Override
  public int[] parseString(String arrayLine) {

    if (validator.isStringValid(arrayLine)) {
      String[] tokens = arrayLine.strip().split(validator.getDelimeter());
      int[] intArray = new int[tokens.length];

      for (int i = 0; i < intArray.length; i++) {
        intArray[i] = Integer.parseInt(tokens[i].strip());
      }

      return intArray;
    }
    return new int[0];
  }
}
