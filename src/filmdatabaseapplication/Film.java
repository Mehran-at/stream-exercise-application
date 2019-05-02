package filmdatabaseapplication;

public class Film {

  private String title;
  private Long budget;
  private Long revenue;
  private Integer runTime;
  private Long voteCount;
  private Double score;

  public Film(String title, Long budget, Long revenue, Integer runTime, Long voteCount, Double score) {
    this.title = title;
    this.budget = budget;
    this.revenue = revenue;
    this.runTime = runTime;
    this.voteCount = voteCount;
    this.score = score;
  }

  protected String getTitle() {
    return title;
  }

  protected Double getScore() {
    return score;
  }

  protected Long getVoteCount() {
    return voteCount;
  }

  protected Integer getRunTime() {
    return runTime;
  }

  protected Long getBudget() {
    return budget;
  }

  protected Long getRevenue() {
    return revenue;
  }

  @Override
  public String toString() {
    return
            "\nMovie= " + title +
            ", Budget= " + budget + "$" +
            ", Revenue= " + revenue +" times" +
            ", RunTime= " + runTime + " minutes" +
            ", Vote= " + voteCount +
            ", score= " + score + "/10";
  }
}
