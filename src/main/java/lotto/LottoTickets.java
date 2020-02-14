package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoTickets {

    private final List<LottoTicket> lottoTickets = new ArrayList<>();

    public void add(List<LottoTicket> lottoTicket) {
        lottoTickets.addAll(lottoTicket);
    }

    public List<LottoTicket> getLottoTickets() {
        return lottoTickets;
    }
}
