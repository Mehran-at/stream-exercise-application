package filmdatabaseapplication.tests;

import filmdatabaseapplication.Film;
import filmdatabaseapplication.FilmDatabaseFilters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MostExpensiveShorterThanOneAndHalfTest {

  FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();

  @Test
  void findMostExpensiveShorterThanOneAndHalf() {
    List<Film> result = filmDatabaseFilters.findMostExpensiveShorterThanOneAndHalf();
    String actual = result.toString();
    String expected = "[\n" +
        "Movie= Madagascar: Escape 2 Africa, Budget= 150000000$, Revenue= 603900354 times, RunTime= 89 minutes, Vote= 1810, score= 6.2/10, \n" +
        "Movie= G-Force, Budget= 150000000$, Revenue= 292817841 times, RunTime= 88 minutes, Vote= 510, score= 5.1/10, \n" +
        "Movie= Mars Needs Moms, Budget= 150000000$, Revenue= 38992758 times, RunTime= 88 minutes, Vote= 199, score= 5.5/10, \n" +
        "Movie= Chicken Little, Budget= 150000000$, Revenue= 314432665 times, RunTime= 81 minutes, Vote= 944, score= 5.6/10]";
    Assertions.assertEquals(expected, actual);
  }
}