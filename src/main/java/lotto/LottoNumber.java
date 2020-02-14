package lotto;

import java.util.Objects;

public class LottoNumber {

  public static final int MINIMUM_LOTTO_NUMBER = 1;
  public static final int MAXIMUM_LOTTO_NUMBER = 46;

  private int lottoNumber;

  private LottoNumber(String lottoNumber) {
    validate(lottoNumber);
    this.lottoNumber = parse(lottoNumber);
  }

  public static LottoNumber of(String lottoNumber) {
    return new LottoNumber(lottoNumber);
  }

  private void validate(String lottoNumber) {
    if (isNotParsableToInt(lottoNumber) || isNotInRange(lottoNumber)) {
      throw new IllegalArgumentException();
    }
  }

  private boolean isNotParsableToInt(String money) {
    try {
      Integer.parseInt(money);
    } catch (NumberFormatException e) {
      return true;
    }
    return false;
  }

  private boolean isNotInRange(String StringLottoNumber) {
    int lottoNumber = Integer.parseInt(StringLottoNumber);
    return (MINIMUM_LOTTO_NUMBER > lottoNumber) || (lottoNumber > MAXIMUM_LOTTO_NUMBER);
  }

  private int parse(String lottoNumber) {
    return Integer.parseInt(lottoNumber);
  }

  public int getLottoNumber() {
    return lottoNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LottoNumber that = (LottoNumber) o;
    return lottoNumber == that.lottoNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(lottoNumber);
  }
}
