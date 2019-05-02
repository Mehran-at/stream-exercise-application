package filmdatabaseapplication;

import streamapplication.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

  private static Film apply(String[] column) {
    return new Film(column[8],
        Long.valueOf(column[0]),
        Long.valueOf(column[5]),
        Integer.valueOf(column[6]),
        Long.valueOf(column[10]),
        Double.valueOf(column[9]));
  }

  List<Film> getFilms(String filePath) {
    return new FileReader().asStream(filePath)
                           .skip(1)
                           .map(line -> line.split(";"))
                           .map(FilmReader::apply)
                           .collect(Collectors.toList());
  }
}
