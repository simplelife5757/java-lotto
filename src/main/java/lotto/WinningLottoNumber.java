package lotto;

public class WinningLottoNumber {

  private int winningLottoNumber;

  private WinningLottoNumber(String winningLottoNumber) {
    this.winningLottoNumber = parse(winningLottoNumber);
  }

  public static WinningLottoNumber of(String number) {
    return new WinningLottoNumber(number);
  }

  private int parse(String winningLottoNumber) {
    return Integer.parseInt(winningLottoNumber);
  }

  public int getWinningLottoNumber() {
    return winningLottoNumber;
  }
}
