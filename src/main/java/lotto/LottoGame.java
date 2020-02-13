package lotto;

public class LottoGame {
  public void play() {
    LottoGameMoney lottoGameMoney = LottoGameMoney.from(ConsoleStringInput.getMoneyToPurchase());
  }
}
