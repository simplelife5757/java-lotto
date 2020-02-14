package lotto;

import java.util.List;

public class LottoTicket {

  private final List<LottoNumber> lottoTicket;

  private LottoTicket(List<LottoNumber> lottoTicket) {
    validate(lottoTicket);
    this.lottoTicket = lottoTicket;
  }

  public static LottoTicket of(List<LottoNumber> lottoNumbers) {
    return new LottoTicket(lottoNumbers);
  }

  private void validate(List<LottoNumber> lottoTicket) {
    if (lottoTicket.size() != 6) {
      throw new IllegalArgumentException();
    }
  }

  public List<LottoNumber> getLottoTicket() {
    return lottoTicket;
  }
}
