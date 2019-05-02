package filmdatabaseapplication;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmDatabaseFilters {

  private static Integer FILMS_DURATION_180_MINUTES = 180;
  private static Integer FILMS_DURATION_90_MINUTES = 90;
  private static Integer FILMS_RANK_MORE_THAN = 7;
  private static Integer FILMS_BUDGET_MIN = 50000;
  private static Integer FILMS_BUDGET_MAX = 500000;
  private final String FILE_PATH = "filmdatabaseapplication/films.csv";

  private List<Film> films = getFilmsList();

  private static boolean isLonger3h(Film e) {return e.getRunTime() > FILMS_DURATION_180_MINUTES;}

  private static boolean isShorterThaneOneAndHalf(Film e) {return e.getRunTime() < FILMS_DURATION_90_MINUTES;}

  private static boolean isScoreHigherThan7(Film e) {return e.getVoteCount() > FILMS_RANK_MORE_THAN;}

  private static boolean isBudgetBetween(Film e) {return e.getBudget() >= FILMS_BUDGET_MIN && e.getBudget() <= FILMS_BUDGET_MAX;}

  private List<Film> getFilmsList() {
    return new FilmReader().getFilms(FILE_PATH);
  }


  public List<Film> findHighRankedFilms() {
    return films.stream()
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(10)
                .collect(Collectors.toList());
  }

  public List<Film> findHighRankedFilmsLonger3Hours() {
    return films.stream()
                .filter(FilmDatabaseFilters::isLonger3h)
                .sorted(Comparator.comparing(Film::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());
  }

  public List<Film> findMostExpensive() {
    return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());

  }

  public List<Film> findMostExpensiveShorterThanOneAndHalf() {
    return films.stream()
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .filter(FilmDatabaseFilters::isShorterThaneOneAndHalf)
                .limit(4)
                .collect(Collectors.toList());
  }

  public List<Film> findFilmsRatedHigher7Between() {
    return films.stream()
                .filter(FilmDatabaseFilters::isScoreHigherThan7)
                .filter(FilmDatabaseFilters::isBudgetBetween)
                .sorted(Comparator.comparing(Film::getBudget).reversed())
                .limit(4)
                .collect(Collectors.toList());
  }
}