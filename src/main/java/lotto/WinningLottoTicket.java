package lotto;

import java.util.List;

public class WinningLottoTicket {

    private List<LottoNumber> winningLottoNumbers;
    private LottoNumber bonusLottoNumber;

    private WinningLottoTicket(List<LottoNumber> winningLottoNumbers, LottoNumber bonusLottoNumber) {
        validate(winningLottoNumbers, bonusLottoNumber);
        this.winningLottoNumbers = winningLottoNumbers;
        this.bonusLottoNumber = bonusLottoNumber;
    }

    public static WinningLottoTicket of(List<LottoNumber> winningLottoNumbers, LottoNumber bonusLottoNumber) {
        return new WinningLottoTicket(winningLottoNumbers, bonusLottoNumber);
    }

    private void validate(List<LottoNumber> winningLottoNumbers, LottoNumber bonusLottoNumber) {
        if (winningLottoNumbers.contains(bonusLottoNumber)) {
            throw new IllegalArgumentException();
        }
    }

    public List<LottoNumber> getWinningLottoNumbers() {
        return winningLottoNumbers;
    }

    public LottoNumber getBonusLottoNumber() {
        return bonusLottoNumber;
    }
}
