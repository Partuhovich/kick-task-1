package org.partapp.arrayapp.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.validator.impl.StringValidatorImpl;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

  private StringValidatorImpl validator;

  @BeforeEach
  void setUp() {
    validator = new StringValidatorImpl();
  }

  @Test
  void testIsStringValidWithValidNumbers() {
    String input = "1 2 3 4 5";
    assertTrue(validator.isStringValid(input));
  }

  @Test
  void testIsStringValidWithNegativeNumbers() {
    String input = "-1 -2 -3 -4 -5";
    assertTrue(validator.isStringValid(input));
  }

  @Test
  void testIsStringValidWithNull() {
    assertFalse(validator.isStringValid(null));
  }

  @Test
  void testIsStringValidWithBlankString() {
    assertFalse(validator.isStringValid("   "));
  }
}