package lotto;

import java.util.List;

public class StatisticService {
  public static LottoStatistics createStatistics(List<LottoTicket> lottoTickets, WinningLottoNumbers winningLottoNumbers) {
    for (LottoTicket lottoTicket: lottoTickets) {
      createStatistic(lottoTicket, winningLottoNumbers);
    }
  }

  private static void createStatistic(LottoTicket lottoTicket, WinningLottoNumbers winningLottoNumbers) {
  }
}
