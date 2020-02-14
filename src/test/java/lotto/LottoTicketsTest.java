package lotto;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static lotto.LottoTicketTest.getLottoTicketFixture;
import static org.assertj.core.api.Assertions.assertThat;

public class LottoTicketsTest {
    @Test
    void add_ValidInput_ValidOutput() {
        // given
        LottoTickets tickets = new LottoTickets();
        List<LottoTicket> lottoTickets = new ArrayList<>();
        LottoTicket lottoTicket = getLottoTicketFixture();
        lottoTickets.add(lottoTicket);
        // when
        tickets.add(lottoTicket);
        // then
        assertThat(tickets.getLottoTickets()).contains(lottoTicket);
    }

}
