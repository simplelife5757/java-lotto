package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class WinningLottoTicketTest {

    private List<LottoNumber> lottoNumbers = new ArrayList<>();

    @BeforeEach
    void setUp() {
        lottoNumbers.add(LottoNumber.of("1"));
        lottoNumbers.add(LottoNumber.of("2"));
        lottoNumbers.add(LottoNumber.of("3"));
        lottoNumbers.add(LottoNumber.of("4"));
        lottoNumbers.add(LottoNumber.of("5"));
        lottoNumbers.add(LottoNumber.of("6"));
    }

    @Test
    void of_ValidInput_ValidOutput() {
        // given
        LottoNumber bonusNumber = LottoNumber.of("7");
        // then
        assertThat(WinningLottoTicket.of(lottoNumbers, bonusNumber).getWinningLottoNumbers()).isEqualTo(lottoNumbers);
        assertThat(WinningLottoTicket.of(lottoNumbers, bonusNumber).getBonusLottoNumber()).isEqualTo(bonusNumber);
    }

    @Test
    void of_InvalidInput_ThrowException() {
        // given
        LottoNumber duplicatedNumber = LottoNumber.of("6");
        // then
        assertThatThrownBy(() -> WinningLottoTicket.of(lottoNumbers, duplicatedNumber)).isInstanceOf(IllegalArgumentException.class);
    }


}