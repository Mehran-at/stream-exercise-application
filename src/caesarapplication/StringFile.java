package caesarapplication;

import streamapplication.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StringFile {
  FileReader fileReader = new FileReader();

  public String convertStreamFileToString() {
    List<String> strings = fileReader.asList("streamapplication/names.txt");
    String string = strings.stream()
                           .collect(Collectors.joining())
                           .toUpperCase();
    return string;

  }
}
