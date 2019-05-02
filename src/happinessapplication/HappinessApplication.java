package happinessapplication;

public class HappinessApplication {
  public static void main(String[] args) {
    HappinessRecord happinessRecord = new HappinessRecord();
    System.out.println(happinessRecord.findTheMostHappyCountry());
  }
}
//  Winter has arrived. Now that we are surrounded by cold and silence we start thinking about stuff in general, like: is the country where I live one of the bests where I could be? Fortunately we can already answer these questions with our programming skills!
//  Develop the code that displays on the screen the five best countries to live.
//    Follow the points below:
//     . Use the world-happinessapplication-2017.csv file provided in the source package.
//     . Use the FileReader provided in the reader package.
//     . Create the HappinessRecord class that has a country, a rank and a score.
//     . Create the HappinessApplication class.
//    Rules:
//      . You’re not allowed to use a loop.
//      . You’re only allowed to write one semicolon (;) in the main method. Using “;” in the split method doesn’t count.

//    Hints:
//      > You can skip the header of the file by using the “skip(number)” intermediate operation.
//      > You can limit the number of elements of the Stream by using the “limit(number)” intermediate operation.
//      > You can sort the elements of the Stream by using the “.sorted(Comparator.comparing(e -> e.getRank()))” intermediate operation.

// ----------------------------------------------------------
//Rank: 1 | Country: Norway | Score: 7.53700017929077
//Rank: 2 | Country: Denmark | Score: 7.52199983596802
//Rank: 3 | Country: Iceland | Score: 7.50400018692017
//Rank: 4 | Country: Switzerland | Score: 7.49399995803833
//Rank: 5 | Country: Finland | Score: 7.4689998626709
// ----------------------------------------------------------
