package lotto;

import lotto.LottoNumber;
import lotto.LottoTicket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoTicketTest {
  @Test
  void of_ValidInput_ValidOutput() {
    // given
    List<LottoNumber> lottoNumbers = new ArrayList<>();
    lottoNumbers.add(LottoNumber.of(1));
    lottoNumbers.add(LottoNumber.of(2));
    lottoNumbers.add(LottoNumber.of(3));
    lottoNumbers.add(LottoNumber.of(4));
    lottoNumbers.add(LottoNumber.of(5));
    lottoNumbers.add(LottoNumber.of(6));
    lottoNumbers.add(LottoNumber.of(7));

    // then
    assertThat(LottoTicket.of(lottoNumbers).getLottoTicket()).hasSize(7);
    assertThat(LottoTicket.of(lottoNumbers).getLottoTicket()).isEqualTo(lottoNumbers);
  }
}
