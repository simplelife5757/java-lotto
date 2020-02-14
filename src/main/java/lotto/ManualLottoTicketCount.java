package lotto;

public class ManualLottoTicketCount {

    private int manualLottoTicketCount;

    private ManualLottoTicketCount(String count) {
        validate(count);
        manualLottoTicketCount = parse(count);
        this.manualLottoTicketCount = manualLottoTicketCount;
    }

    public static ManualLottoTicketCount of(String manualLottoTicketCount) {
        return new ManualLottoTicketCount(manualLottoTicketCount);
    }

    private void validate(String count) {
        if (isNotParsableToInt(count) || isLessThanZero(count)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isNotParsableToInt(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private boolean isLessThanZero(String count) {
        return 0 > Integer.parseInt(count);
    }

    private int parse(String count) {
        return Integer.parseInt(count);
    }

    public int getManualLottoTicketCount() {
        return manualLottoTicketCount;
    }
}
