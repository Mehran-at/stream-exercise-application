package filmdatabaseapplication.tests;

import filmdatabaseapplication.Film;
import filmdatabaseapplication.FilmDatabaseFilters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MostExpensiveFilmsTest {

  FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();
  @Test
  void findMostExpensive() {
    List<Film> result = filmDatabaseFilters.findMostExpensive();
    String actual = result.toString();
    String expected = "[\n" +
        "Movie= Pirates of the Caribbean: On Stranger Tides, Budget= 380000000$, Revenue= 1045713802 times, RunTime= 136 minutes, Vote= 4948, score= 6.4/10, \n" +
        "Movie= Pirates of the Caribbean: At World's End, Budget= 300000000$, Revenue= 961000000 times, RunTime= 169 minutes, Vote= 4500, score= 6.9/10, \n" +
        "Movie= Avengers: Age of Ultron, Budget= 280000000$, Revenue= 1405403694 times, RunTime= 141 minutes, Vote= 6767, score= 7.3/10, \n" +
        "Movie= Superman Returns, Budget= 270000000$, Revenue= 391081192 times, RunTime= 154 minutes, Vote= 1400, score= 5.4/10]";
    Assertions.assertEquals(expected, actual);
  }
}