package caesarapplication;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Caesar {

  private static final int LOWERCASE_A_ASCII = 97;

  private static Character apply(Integer e) {return (char) e.intValue();}

  public String getCipher(TextAndKey textAndKey) {

    String plainText = textAndKey.getPlainText();
    int key = textAndKey.getKey();

    if (!isUpperCase(plainText) || isNotAlphabeticLetter(plainText)) {
      return plainText;
    }

    return Stream.of(plainText
        .split(""))
                 .map(String::toLowerCase)
                 .map(e -> e.charAt(0))
                 .map(Object::hashCode)
                 .map(e -> (e + key - LOWERCASE_A_ASCII) % 26 + LOWERCASE_A_ASCII)
                 .map(Caesar::apply)
                 .map(Object::toString)
                 .collect(Collectors.joining());
  }

  private boolean isNotAlphabeticLetter(String plainText) {
    if (IntStream.range(0, plainText.length()).anyMatch(position -> !Character.isAlphabetic(plainText.charAt(position)))) return true;
    return false;
  }

  private boolean isUpperCase(String firstLetter) {
    return Character.isUpperCase(firstLetter.charAt(0));
  }
}