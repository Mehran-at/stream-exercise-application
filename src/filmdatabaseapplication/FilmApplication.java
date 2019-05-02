package filmdatabaseapplication;

public class FilmApplication {
  public static void main(String[] args) {

    FilmDatabaseFilters filmDatabaseFilters = new FilmDatabaseFilters();

    System.out.println("\n  High ranked films: " + filmDatabaseFilters.findHighRankedFilms());
    System.out.println("\n  Most expensive films shorter than 3 hours: " + filmDatabaseFilters.findHighRankedFilmsLonger3Hours());
    System.out.println("\n  Most expensive films: " + filmDatabaseFilters.findMostExpensive());
    System.out.println("\n  Most expensive films shorter than 1.5 hours: " + filmDatabaseFilters.findMostExpensiveShorterThanOneAndHalf());
    System.out.println("\n  Ranked over 7 films with budget between 50000$ and 500000$: " + filmDatabaseFilters.findFilmsRatedHigher7Between());
  }
}

//   We have a film database with more than 5.000 films. Let’s see what curiosities we can find out from the film industry!
//    Develop the following code:
//      Use the films.csv file provided in the source package.
//      Use the FileReader provided in the reader package.
//      Create the Film class that has a title, a score, a vote count, a runtime, a budget and a revenue.
//      Create the FilmReader class. It has the method getFilms that returns a list with all the films in films.csv.
//      Create the FilmSummarizer class. Each of the following questions will be answered with a method in this class.
//    Questions:
//      Which are the three films with the highest rating, sorted by rating?
//      Which are the three films with the highest rating that are longer than three hours, sorted by rating?
//      Which are the four most expensive films, sorted by budget?
//      Which are the four most expensive films that are shorter than one hour and a half, sorted by budget?
//      Which are the four most rated films with a rating higher than 7 and a budget between 50.000 and 500.000 dollars, sorted by budget?
//      Ask two additional questions that you might find interesting.
//    Rules:
//      . You’re not allowed to use a loop.
//      . Every method of the FilmSummarizer class starts with the return keyword.
//    Hints:
//      . You can avoid reading the movies.csv file constantly in the FilmSummarizer if you have them as an attribute.
//      . You can skip the header of the file by using the “skip(number)” intermediate operation.
//      . You can limit the number of elements of the Stream by using the “limit(number)” intermediate operation.
//      . You can sort the elements of the Stream by using the “.sorted(Comparator.comparing(Film::getScore).reversed())” intermediate operation.
//---------------------------------------------------------------------------------------
//Top 3 with highest rating, sorted by rating:
//[“Stiff Upper Lips”, “Dancer, Texas Pop. 81”, “Me You and Five Bucks”]
//
//Top 3 with highest rating longer than 3 hours, sorted by rating:
//[“Schindler's List”, “The Godfather: Part II”, “The Green Mile”]
//
//Top 4 most expensive, sorted by budget:
//[“Pirates of the Caribbean: On Stranger Tides”, “Pirates of the Caribbean: At World's End”, “Avengers: Age of Ultron”, “Superman Returns”]
//
//Top 4 most expensive shorter than 90 minutes, sorted by budget:
//[“Madagascar: Escape 2 Africa”, “G-Force”, “Mars Needs Moms”, “Chicken Little”]
//
//Top 4 most rated over 7 and budget between 50.000 and 500.000, sorted by budget:
//[“Monty Python and the Holy Grail”, “Intolerance”, “The Evil Dead”, “12 Angry Men”]
//-----------------------------------------------------------------------------------------
