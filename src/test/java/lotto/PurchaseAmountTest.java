package lotto;

import lotto.PurchaseAmount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PurchaseAmountTest {
  @Test
  void of_ValidInput_ValidOutput() {
    // given
    String purchaseAmount = "1400";
    // then
    assertThat(PurchaseAmount.of(purchaseAmount).getPurchaseAmount()).isEqualTo(purchaseAmount);
  }

  @Test
  void of_LessThanMinimumAmount_Throw_Exception() {
    // given
    String purchaseAmount = "600";
    // then
    assertThatThrownBy(() -> PurchaseAmount.of(purchaseAmount)).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void getNumberOfTicketsPurchased_ValidPurchaseAmount_ReturnValidNumber() {
    // given
    PurchaseAmount purchaseAmount = PurchaseAmount.of("4000");
    int numberOfTicketsPurchased = 4;
    // then
    assertThat(purchaseAmount.getNumberOfTicketsPurchased()).isEqualTo(numberOfTicketsPurchased);
  }
}
