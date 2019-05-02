package streamintestapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamapplication.FileReader;

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

//  1. Create the StreamsTest class. Write the next points of this exercise as tests asserting the expectations.
//  2. Use the FileReader to create an attribute called names that is a list of String reading the names.txt file.
//  3. Create a list with the names that are shorter than four characters. Check that the output is correct.
//  4. Create a list with the names that end with the letter “m” and make them upper case. Check that the output is correct.
//  5. Create a list with the names that contain the letters “e” and “r”. Check that the output is correct.
//  6. Create a list with the names that are exactly four characters long, make them lower case, keep those that contain the letters “a” and “m” and duplicate the number of letter “a”s that they have.
//   Notes:
//    . Use the FileReader provided in the reader package. Note that it has the asStream method, because files can be read with Streams as well.
//    . Use the names.txt file provided in the source package.

//---------------------------------------------------------------------------------------------
//Names that are shorter than four characters:
//[El]
//Names that end with m uppercased:
//[HOSAM, TAMMAM]
//Names that contain the letter e and the letter r:
//[Mehran, Norbert, Serife]
//Names that are 4 letters long in lowercase and contain the letter a and m with double a’s:
//[maarj, aamin, omaar]
//----------------------------------------------------------------------------------------------
