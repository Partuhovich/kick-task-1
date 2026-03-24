package org.partapp.arrayapp.validator;

import org.partapp.arrayapp.entity.ArrayEntity;

public interface ArrayValidator {
  boolean isArrayValid(String line);

  String getDelimeter();
}
