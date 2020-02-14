package lotto;

public class LottoGame {
  public void play() {
    LottoGameMoney lottoGameMoney = LottoGameMoney.from(ConsoleStringInput.getMoneyToPurchase());
    LottoTickets lottoTickets = createLottoTickets();
  }

  private LottoTickets createLottoTickets() {
    LottoTickets lottoTickets = new LottoTickets();
    lottoTickets.add(ManualLottoTicketGenerator.generate());
    return lottoTickets;
  }
}
