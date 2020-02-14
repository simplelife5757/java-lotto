package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AutoLottoTicketGenerator {

    public static final int MINIMUM_LOTTO_NUMBER = 1;
    public static final int MAXIMUM_LOTTO_NUMBER = 46;
    public static final int FROM_INDEX = 0;
    public static final int TO_INDEX = 6;

    public static List<LottoTicket> generate(int count) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lottoTickets.add(createLottoTicket());
        }
        return lottoTickets;
    }

    private static LottoTicket createLottoTicket() {
        List<LottoNumber> lottoNumberPool = createLottoNumberPool();
        Collections.shuffle(lottoNumberPool);
        return LottoTicket.of(lottoNumberPool.subList(FROM_INDEX, TO_INDEX));
    }

    private static List<LottoNumber> createLottoNumberPool() {
        List<LottoNumber> lottoNumberPool = new ArrayList<>();
        for (int i = MINIMUM_LOTTO_NUMBER; i <= MAXIMUM_LOTTO_NUMBER; i++) {
            String lottoNumber = String.valueOf(i);
            lottoNumberPool.add(LottoNumber.of(lottoNumber));
        }
        return lottoNumberPool;
    }
}
