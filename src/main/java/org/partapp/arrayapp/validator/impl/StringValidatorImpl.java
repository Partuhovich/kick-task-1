package org.partapp.arrayapp.validator.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.partapp.arrayapp.validator.StringValidator;
import org.partapp.arrayapp.warehouse.Warehouse;

public class StringValidatorImpl implements StringValidator {
  private static final Logger logger = LogManager.getLogger(StringValidatorImpl.class);

  String VALID_NUMERIC_STRING_REGEX= "^(?!.*-\\D)[\\d\\s,-]*$";

  @Override
  public boolean isStringValid(String arrayLine) {
    logger.info("Validate string");
    if (arrayLine == null || arrayLine.isBlank()) {
      logger.warn("String is null or blank");
      return false;
    }

    return arrayLine.matches(VALID_NUMERIC_STRING_REGEX);
  }
}
