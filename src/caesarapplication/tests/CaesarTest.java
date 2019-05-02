package caesarapplication.tests;

import caesarapplication.Caesar;
import caesarapplication.TextAndKey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CaesarTest {
  Caesar caesar = new Caesar();

  static Stream<Arguments> stringAndIntProvider() {
    return Stream.of(Arguments.of(2, "hello", "hello"),
        Arguments.of(2, "Bar", "dct"),
        Arguments.of(32, "Bar", "hgx"),
        Arguments.of(3, "1ABC", "1ABC"),
        Arguments.of(3, "ABC2", "ABC2"),
        Arguments.of(5, "lLLOO", "lLLOO"));
  }

  @ParameterizedTest
  @MethodSource("stringAndIntProvider")
  void getCipher(int key, String plainText, String actual) {
    TextAndKey textAndKey = new TextAndKey(plainText, key);
    String expected = caesar.getCipher(textAndKey);
    Assertions.assertEquals(expected, actual);
  }
}