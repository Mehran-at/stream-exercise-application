package filmdatabaseapplication.tests;

import filmdatabaseapplication.Film;
import filmdatabaseapplication.FilmDatabaseFilters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilmDatabaseFiltersTest {

  FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();

  @Test
  void findFilmsRatedHigher7Between() {
    List<Film> result = filmDatabaseFilters.findFilmsRatedHigher7Between();
    String actual = result.toString();
    String expected = "[\n" +
        "Movie= Mean Streets, Budget= 500000$, Revenue= 3000000 times, RunTime= 110 minutes, Vote= 345, score= 7.2/10, \n" +
        "Movie= May, Budget= 500000$, Revenue= 150277 times, RunTime= 93 minutes, Vote= 152, score= 6.3/10, \n" +
        "Movie= Kill List, Budget= 500000$, Revenue= 171760 times, RunTime= 95 minutes, Vote= 210, score= 6.0/10, \n" +
        "Movie= Fireproof, Budget= 500000$, Revenue= 33456317 times, RunTime= 122 minutes, Vote= 100, score= 7.0/10]";
    Assertions.assertEquals(expected, actual);
  }
}