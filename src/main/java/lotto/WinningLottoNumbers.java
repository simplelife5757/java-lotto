package lotto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningLottoNumbers {

  public static final String DELIMITER = ",";

  private List<WinningLottoNumber> winningLottoNumbers;

  private WinningLottoNumbers(String winningLottoNumbers) {
    this.winningLottoNumbers = parse(winningLottoNumbers);
  }

  public static WinningLottoNumbers of(String winningNumbers) {
    return new WinningLottoNumbers(winningNumbers);
  }

  private List<WinningLottoNumber> parse(String winningLottoNumbers) {
    List<String> numbers = Arrays.asList(winningLottoNumbers.split(DELIMITER));
    return numbers.stream().map(WinningLottoNumber::of).collect(Collectors.toList());
  }

  public List<WinningLottoNumber> getWinningLottoNumbers() {
    return winningLottoNumbers;
  }
}
