package lotto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ManualLottoTicketCountTest {
    @Test
    void of_ValidInput_ValidOutput() {
        // given 
        String manualLottoTicketCount = "3";
        // then
        assertThat(ManualLottoTicketCount.of(manualLottoTicketCount));
    }
    
}
