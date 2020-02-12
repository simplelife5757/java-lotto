package lotto;

public class PurchaseAmount {

  public static final int PRICE_PER_TICKET = 1000;

  private int purchaseAmount;

  private PurchaseAmount(String purchaseAmount) {
    validate(purchaseAmount);
    this.purchaseAmount = parse(purchaseAmount);
  }

  public static PurchaseAmount of(String purchaseAmount) {
    return new PurchaseAmount(purchaseAmount);
  }

  private void validate(String purchaseAmount) {
    if (Integer.parseInt(purchaseAmount) < PRICE_PER_TICKET) {
      throw new IllegalArgumentException("최소 금액 이하를 입력하셨습니다.");
    }
  }

  private int parse(String purchaseAmount) {
    return Integer.parseInt(purchaseAmount);
  }

  public int getPurchaseAmount() {
    return purchaseAmount;
  }

  public int getNumberOfTicketsPurchased() {
    return purchaseAmount / PRICE_PER_TICKET;
  }
}
