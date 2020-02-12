package lotto;

import java.util.List;

public class LottoTicket {

  private List<LottoNumber> lottoTicket;

  private LottoTicket(List<LottoNumber> lottoTicket) {
    this.lottoTicket = lottoTicket;
  }

  public static LottoTicket of(List<LottoNumber> lottoNumbers) {
    return new LottoTicket(lottoNumbers);
  }

  public List<LottoNumber> getLottoTicket() {
    return lottoTicket;
  }
}
