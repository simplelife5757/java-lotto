package lotto;

public class LottoNumber {

  public static final int MINIMUM_LOTTO_NUMBER = 1;
  public static final int MAXIMUM_LOTTO_NUMBER = 46;

  private int lottoNumber;

  private LottoNumber(int lottoNumber) {
    validate(lottoNumber);
    this.lottoNumber = lottoNumber;
  }

  public static LottoNumber of(int lottoNumber) {
    return new LottoNumber(lottoNumber);
  }

  private void validate(int lottoNumber) {
    if (isNotInRange(lottoNumber)) {
      throw new IllegalArgumentException();
    }
  }

  private boolean isNotInRange(int lottoNumber) {
    return (MINIMUM_LOTTO_NUMBER > lottoNumber) || (lottoNumber > MAXIMUM_LOTTO_NUMBER);
  }

  public int getLottoNumber() {
    return lottoNumber;
  }
}
