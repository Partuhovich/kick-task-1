package org.partapp.arrayapp.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.parser.CustomParser;
import org.partapp.arrayapp.validator.StringValidator;
import org.partapp.arrayapp.validator.impl.StringValidatorImpl;

public class CustomParserImpl implements CustomParser {
  private static final Logger logger = LogManager.getLogger(CustomParserImpl.class);
  StringValidator validator = new StringValidatorImpl();

  private static final String DELIMITER_REGEX = "[\\s,;\\-]+";
  private static final String NUMBER_REGEX = "^-?\\d+$";

  @Override
  public int[] parseString(String arrayLine) throws CustomExeption {
    logger.info("Parsing file");

    if (validator.isStringValid(arrayLine)) {

      String[] tokens = arrayLine.strip().split(DELIMITER_REGEX);
      int[] intArray = new int[tokens.length];

      for (int i = 0; i < intArray.length; i++) {
        if(tokens[i].strip().matches(NUMBER_REGEX)){
          intArray[i] = Integer.parseInt(tokens[i].strip());
        } else {
          logger.warn("Parsing failed, invalid token");
          throw new CustomExeption("Parsing failed, invalid token");
        }

      }

      return intArray;
    } else {
      logger.info("Parsing failed, string is not valid");
      throw new CustomExeption("String is not valid to parse");
    }
  }
}
