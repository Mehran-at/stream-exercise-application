package filmdatabaseapplication.tests;

import filmdatabaseapplication.Film;
import filmdatabaseapplication.FilmDatabaseFilters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HighRankedFilmsTest {

  FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();

  @Test
  void findHighRankedFilmsLonger3Hours() {
    List<Film> result = filmDatabaseFilters.findHighRankedFilms();
    String actual = result.toString();
    String expected = "[\n" +
        "Movie= Stiff Upper Lips, Budget= 0$, Revenue= 0 times, RunTime= 99 minutes, Vote= 1, score= 10.0/10, \n" +
        "Movie= Dancer, Texas Pop. 81, Budget= 0$, Revenue= 565592 times, RunTime= 97 minutes, Vote= 1, score= 10.0/10, \n" +
        "Movie= Me You and Five Bucks, Budget= 1$, Revenue= 0 times, RunTime= 90 minutes, Vote= 2, score= 10.0/10, \n" +
        "Movie= Little Big Top, Budget= 0$, Revenue= 0 times, RunTime= 0 minutes, Vote= 1, score= 10.0/10, \n" +
        "Movie= Sardaarji, Budget= 0$, Revenue= 0 times, RunTime= 0 minutes, Vote= 2, score= 9.5/10, \n" +
        "Movie= One Man's Hero, Budget= 0$, Revenue= 0 times, RunTime= 121 minutes, Vote= 2, score= 9.3/10, \n" +
        "Movie= The Shawshank Redemption, Budget= 25000000$, Revenue= 28341469 times, RunTime= 142 minutes, Vote= 8205, score= 8.5/10, \n" +
        "Movie= There Goes My Baby, Budget= 10500000$, Revenue= 123509 times, RunTime= 99 minutes, Vote= 2, score= 8.5/10, \n" +
        "Movie= The Prisoner of Zenda, Budget= 0$, Revenue= 0 times, RunTime= 101 minutes, Vote= 11, score= 8.4/10, \n" +
        "Movie= The Godfather, Budget= 6000000$, Revenue= 245066411 times, RunTime= 175 minutes, Vote= 5893, score= 8.4/10]";
    Assertions.assertEquals(expected, actual);
  }
}