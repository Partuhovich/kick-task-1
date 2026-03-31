package org.partapp.arrayapp.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.partapp.arrayapp.exeption.CustomExeption;
import org.partapp.arrayapp.parser.impl.CustomParserImpl;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

  private CustomParserImpl parser;

  @BeforeEach
  void setUp() {
    parser = new CustomParserImpl();
  }

  @Test
  void testParseStringWithValidNumbers() throws CustomExeption {
    String input = "1 2 3 4 5";
    int[] expected = {1, 2, 3, 4, 5};
    int[] actual = parser.parseString(input);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testParseStringWithNegativeNumbers() throws CustomExeption {
    String input = "-1 -2 -3 -4 -5";
    int[] expected = {-1, -2, -3, -4, -5};
    int[] actual = parser.parseString(input);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testParseStringWithMixedNumbers() throws CustomExeption {
    String input = "5 0 10 15 -20";
    int[] expected = {5, 0, 10, 15, -20};
    int[] actual = parser.parseString(input);

    assertArrayEquals(expected, actual);
  }
}