package happinessapplication.tests;

import happinessapplication.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HappinessRecordTest {

  HappinessRecord happinessRecord = new HappinessRecord();

  @Test
  void findTheMostHappyCountry() {
    String actual = "Rank 1 Country Norway Score 7.53700017929077\n" +
        "Rank 2 Country Denmark Score 7.52199983596802\n" +
        "Rank 3 Country Iceland Score 7.50400018692017\n" +
        "Rank 4 Country Switzerland Score 7.49399995803833\n" +
        "Rank 5 Country Finland Score 7.4689998626709";
    String expected = happinessRecord.findTheMostHappyCountry();
    Assertions.assertEquals(expected, actual);
  }
}