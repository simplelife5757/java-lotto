package lotto;

import java.util.List;

public class LottoGame {
  public void play() {
    int numberOfTicketsPurchased = PurchaseAmount.of(ConsoleInput.getPurchaseAmount()).getNumberOfTicketsPurchased();

    List<LottoTicket> lottoTickets = LottoTicketGenerator.generate(numberOfTicketsPurchased);
    ConsoleOutput.show(lottoTickets);

    WinningLottoNumbers winningNumbers = WinningLottoNumbers.of(ConsoleInput.getWinningNumbers());

    LottoStatistics lottoStatistics = StatisticService.createStatistics(lottoTickets, winningNumbers);
    ConsoleOutput.showLottoStatistics(lottoStatistics);
  }
}
