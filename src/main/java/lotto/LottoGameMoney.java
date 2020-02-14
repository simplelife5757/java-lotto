package lotto;

public class LottoGameMoney {

    public static final int LOTTO_TICKET_PRICE = 1000;

    private int lottoGameMoney;

    private LottoGameMoney(String money) {
        validate(money);
        lottoGameMoney = parse(money);
    }

    public static LottoGameMoney from(String money) {
        return new LottoGameMoney(money);
    }

    private void validate(String money) {
        if (isNotParsableToInt(money) || isLessThanLottoTicketPrice(money)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isNotParsableToInt(String money) {
        try {
            Integer.parseInt(money);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private boolean isLessThanLottoTicketPrice(String money) {
        return LOTTO_TICKET_PRICE > Integer.parseInt(money);
    }

    private int parse(String money) {
        return Integer.parseInt(money);
    }

    public int calculateAutoLottoTicketCount(int manualLottoCount) {
        int manualLottoPrice = manualLottoCount * LOTTO_TICKET_PRICE;
        return lottoGameMoney - manualLottoPrice;
    }

    public int getLottoGameMoney() {
        return lottoGameMoney;
    }
}
