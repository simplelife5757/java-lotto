package lotto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoGameMoneyTest {

    @Test
    void from_ValidInput_ValidOutput() {
        // given
        String money = "2000";
        int intMoney = Integer.parseInt(money);
        // when
        LottoGameMoney lottoGameMoney = LottoGameMoney.from(money);
        // then
        assertThat(lottoGameMoney.getLottoGameMoney()).isEqualTo(intMoney);
    }

    @Test
    void from_NotParsableInput_ThrowException() {
        // given
        String money = "notParsableInput";
        // then
        assertThatThrownBy(() -> LottoGameMoney.from(money)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void from_LessThanLottoTicketPrice_ThrowException() {
        // given
        String money = "900";
        // then
        assertThatThrownBy(() -> LottoGameMoney.from(money)).isInstanceOf(IllegalArgumentException.class);
    }

}