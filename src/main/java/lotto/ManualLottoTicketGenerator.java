package lotto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ManualLottoTicketGenerator {
    public static List<LottoTicket> generate(int count) {
        List<String> manualStringLottoTickets = ConsoleStringInput.getManualLottoTickets(count);
        return manualStringLottoTickets.stream().map(stringLottoTicket -> createLottoTicket(stringLottoTicket)).collect(Collectors.toList());
    }

    private static LottoTicket createLottoTicket(String stringLottoTicket) {
        List<LottoNumber> lottoNumbers = Arrays.asList(stringLottoTicket.split(",")).stream()
                .map(number -> LottoNumber.of(number)).collect(Collectors.toList());
        return LottoTicket.of(lottoNumbers);
    }
}
