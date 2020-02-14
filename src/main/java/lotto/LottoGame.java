package lotto;

public class LottoGame {

  private LottoGameMoney lottoGameMoney;

  public LottoGame() {
    this.lottoGameMoney = initializeLottoGameMoney();
  }

  private LottoGameMoney initializeLottoGameMoney() {
    return LottoGameMoney.from(ConsoleStringInput.getMoneyToPurchase());
  }

  public void play() {
    LottoTickets lottoTickets = createLottoTickets();
  }

  private LottoTickets createLottoTickets() {
    LottoTickets lottoTickets = new LottoTickets();

    ManualLottoTicketCount manualLottoTicketCount = ManualLottoTicketCount.of(ConsoleStringInput.getManualLottoTicketCount());
    int manualLottoCount = manualLottoTicketCount.getManualLottoTicketCount();
    lottoTickets.add(ManualLottoTicketGenerator.generate(manualLottoCount));

    int autoLottoCount = lottoGameMoney.calculateAutoLottoTicketCount(manualLottoCount);
    lottoTickets.add(AutoLottoTicketGenerator.generate(autoLottoCount));
    return lottoTickets;
  }
}
