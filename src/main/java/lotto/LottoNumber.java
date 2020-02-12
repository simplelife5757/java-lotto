package lotto;

public class LottoNumber {

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
      throw new IllegalArgumentException("로또 번호 범위를 벗어났습니다.");
    }
  }

  private boolean isNotInRange(int lottoNumber) {
    return (1 <= lottoNumber) && (lottoNumber <= 45);
  }

  public int getLottoNumber() {
    return lottoNumber;
  }
}
