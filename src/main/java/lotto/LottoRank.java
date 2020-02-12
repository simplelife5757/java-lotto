package lotto;

public enum LottoRank {

  FIST(6, 2000000000),
  SECOND(5, 30000000),
  THIRD(5, 1500000),
  FOURTH(4, 50000),
  FIFTH(3, 5000),
  NONE(0, 0);

  private int matchingCount;
  private long prize;

  LottoRank(int matchingCount, long prize) {
    this.matchingCount = matchingCount;
    this.prize = prize;
  }

  public int getMatchingCount() {
    return matchingCount;
  }

  public long getPrize() {
    return prize;
  }
}
