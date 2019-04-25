package caesarapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

  List<String> cipherText = new ArrayList<>();


  public String getCipher(TextAndKey textAndKey) {

    String plainText = textAndKey.getPlainText();
    int key = textAndKey.getKey();
//    if (isNotAlphabeticLetter(plainText)) {
//      return plainText;
//    }

    Long collect = Stream.of(plainText.split(""))
                         .map(e -> e.toLowerCase())
                         .map(e -> e.toUpperCase())
                         .map(e -> e.charAt(0))
                         .map(e -> ((e.charValue() + key) % 26))
                         .collect(Collectors.counting());

    Stream.of(collect.intValue())
          .map(e -> (char) collect.intValue())
          .collect(Collectors.joining();

    return collect;
  }

  private boolean isNotAlphabeticLetter(String plainText) {
    return !Character.isAlphabetic(plainText.charAt(0));
  }
}
