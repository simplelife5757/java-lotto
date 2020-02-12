package lotto;

import lotto.LottoNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoNumberTest {
  @Test
  void of_ValidInput_ValidOutput() {
    // given
    int lottoNumber = 5;
    // then
    assertThat(LottoNumber.of(lottoNumber).getLottoNumber()).isEqualTo(lottoNumber);
  }

  @Test
  void of_OutOfRange_ThrowException() {
    // given
    int lottoNumber = 46;
    // then
    assertThatThrownBy(() -> LottoNumber.of(lottoNumber)).isInstanceOf(IllegalArgumentException.class);
  }
}
