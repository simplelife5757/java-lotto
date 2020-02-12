package lotto;

import java.util.List;

public class ConsoleOutput {
  public static final String PRE_FIX = "[";
  public static final String POST_FIX = "]";

  public static void show(List<LottoTicket> lottoTickets) {
    lottoTickets.forEach(ConsoleOutput::show);
  }

  public static void show(LottoTicket lottoTicket) {
    List<LottoNumber> lottoNumbers = lottoTicket.getLottoTicket();
    StringBuilder ticket = new StringBuilder();
    for (LottoNumber lottoNumber: lottoNumbers) {
      ticket.append(lottoNumber.getLottoNumber());
    }
    System.out.println(PRE_FIX + ticket.toString() + POST_FIX);
  }
}
