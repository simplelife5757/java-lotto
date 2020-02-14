package lotto;

import lotto.LottoNumber;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LottoNumberTest {
  @Test
  void of_ValidInput_ValidOutput() {
    // given
    String lottoNumber = "5";
    // then
    assertThat(LottoNumber.of(lottoNumber).getLottoNumber()).isEqualTo(lottoNumber);
  }

  @Test
  void of_OutOfRange_ThrowException() {
    // given
    String outOfRangeNumber = "47";
    // then
    assertThatThrownBy(() -> LottoNumber.of(outOfRangeNumber)).isInstanceOf(IllegalArgumentException.class);
  }
}
