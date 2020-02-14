package lotto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningLottoTicketGenerator {
    public static WinningLottoTicket generate() {
        List<LottoNumber> winningLottoNumbers = createWinningLottoNumbers();
        LottoNumber bonusNumber = createBonusLottoNumber();
        return WinningLottoTicket.of(winningLottoNumbers, bonusNumber);
    }

    private static List<LottoNumber> createWinningLottoNumbers() {
        List<String> winningLottoNumbers = Arrays.asList(ConsoleStringInput.getWinningLottoTicket().split(","));
        return winningLottoNumbers.stream()
                .map(number -> LottoNumber.of(number)).collect(Collectors.toList());
    }

    private static LottoNumber createBonusLottoNumber() {
        return LottoNumber.of(ConsoleStringInput.getBonusLottoNumber());
    }
}
