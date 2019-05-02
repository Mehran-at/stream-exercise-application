package happinessapplication;

import streamapplication.FileReader;

import java.util.Comparator;
import java.util.stream.Collectors;

public class HappinessRecord {

  public String findTheMostHappyCountry() {
    return new FileReader().asStream("happinessapplication/world-happiness-2017.csv")
                           .skip(1)
                           .map(line -> line.split(";"))
                           .map(column -> new Records(column[0], Integer.valueOf(column[1]), Double.valueOf(column[2])))
                           .sorted(Comparator.comparing(Records::getRank))
                           .limit(5)
                           .map(e -> "Rank " + e.getRank() + " Country " + e.getCountry() + " Score " + e.getScore())
                           .collect(Collectors.joining("\n"));
  }
}
