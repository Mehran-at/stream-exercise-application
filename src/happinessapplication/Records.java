package happinessapplication;

public class Records {

  private String country;
  private Integer rank;
  private Double score;

  public Records(String country, Integer rank, Double score) {
    this.country = country;
    this.rank = rank;
    this.score = score;
  }

  public String getCountry() {
    return country;
  }

  public int getRank() {
    return rank;
  }

  public Double getScore() {
    return score;
  }
}
