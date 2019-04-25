package streamapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StreamTest {

  FileReader fileReader = new FileReader();
  private List<String> namesList = fileReader.asList("streamapplication/names.txt");


  @Test
  void testStreams() {

    List<String> shorterThan4 = namesList.stream()
                                         .filter(e -> e.length() < 4)
                                         .collect(Collectors.toList());
    List<String> expected = Arrays.asList("El");
    System.out.println(shorterThan4);
    System.out.println(namesList);
    Assertions.assertEquals(expected, shorterThan4);
  }

  @Test
  void testWordEndsWithm() {
    List<String> endsWithm = namesList.stream()
                                      .map(e -> e.toUpperCase())
                                      .filter(e -> e.endsWith("M"))
                                      .collect(Collectors.toList());
    List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
    Assertions.assertEquals(expected, endsWithm);
  }

  @Test
  void namesContainLettersEandR() {
    List<String> namesWithEandR = namesList.stream()
                                           .map(e -> e.toLowerCase())
                                           .filter(e -> e.contains("e") && e.contains("r"))
                                           .collect(Collectors.toList());
    List<String> expected = Arrays.asList("erika", "mehran", "norbert", "rabie", "serife");
    Assertions.assertEquals(expected, namesWithEandR);
  }

  @Test
  void getLettersExactlyFourCharacters() {
    List<String> lttersWithRequestedConditions = namesList.stream()
                                    .filter(e -> e.length() == 4)
                                    .map(e -> e.toLowerCase())
                                    .filter(e -> e.contains("a") && e.contains("m"))
                                    .map(e -> e.replaceAll("a", "aa"))
                                    .map(e -> e.replaceAll("m", "mm"))
                                    .collect(Collectors.toList());
    List<String> expected = Arrays.asList("mmaarj", "aammin", "ommaar");
    Assertions.assertEquals(expected, lttersWithRequestedConditions);
  }
}
