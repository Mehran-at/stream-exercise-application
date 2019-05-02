package filmdatabaseapplication.tests;

import filmdatabaseapplication.Film;
import filmdatabaseapplication.FilmDatabaseFilters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HighRankedFilmsLonger3HourTest {

  FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();

  @Test
  void findHighRankedFilmsTest() {
    List<Film> result = filmDatabaseFilters.findHighRankedFilmsLonger3Hours();
    String expected = result.toString();
    String actual = "[\n" +
        "Movie= Schindler's List, Budget= 22000000$, Revenue= 321365567 times, RunTime= 195 minutes, Vote= 4329, score= 8.3/10, \n" +
        "Movie= The Godfather: Part II, Budget= 13000000$, Revenue= 47542841 times, RunTime= 200 minutes, Vote= 3338, score= 8.3/10, \n" +
        "Movie= The Green Mile, Budget= 60000000$, Revenue= 284600000 times, RunTime= 189 minutes, Vote= 4048, score= 8.2/10]";
    Assertions.assertEquals(expected, actual);
  }
}