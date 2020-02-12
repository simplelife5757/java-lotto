package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoTicketGenerator {

  public static final int MIN = 1;
  public static final int MAX = 45;
  public static final int COUNT_OF_LOTTO_NUMBERS = 7;

  public static List<LottoTicket> generate(int numOfLottoTickets) {
    List<LottoTicket> lottoTickets = new ArrayList<>();

    for (int i = 0; i < numOfLottoTickets; i++) {
      lottoTickets.add(generateLottoTicket());
    }
    return lottoTickets;
  }

  private static LottoTicket generateLottoTicket() {
    List<Integer> consecutiveNumsList = generateConsecutiveNumsList(MIN, MAX);
    Collections.shuffle(consecutiveNumsList);
    int fromIndex = 0;
    int toIndex = fromIndex + COUNT_OF_LOTTO_NUMBERS;
    List<LottoNumber> lottoNumbers = consecutiveNumsList.subList(fromIndex, toIndex)
                                                            .stream()
                                                            .map(LottoNumber::of)
                                                            .collect(Collectors.toList());
    return LottoTicket.of(lottoNumbers);
  }

  private static List<Integer> generateConsecutiveNumsList(int min, int max) {
    List<Integer> consecutiveNumsList = new ArrayList<>();
    for (int i = min; i < ++max; i++) {
      consecutiveNumsList.add(i);
    }
    return consecutiveNumsList;
  }
}
