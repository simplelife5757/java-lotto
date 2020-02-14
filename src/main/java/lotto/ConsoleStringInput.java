package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleStringInput {

  private static final Scanner scanner = new Scanner(System.in);

  public static String getMoneyToPurchase() {
    System.out.println("구입금액을 입력해 주세요.");
    return scanner.nextLine();
  }

  public static String getManualLottoTicketCount() {
    System.out.println("수동으로 구매할 로또 수를 입력해 주세요.");
    return scanner.nextLine();
  }

  public static List<String> getManualLottoTickets(int num) {
    System.out.println("수동으로 구매할 번호를 입력해 주세요.");
    List<String> manualLottos = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      manualLottos.add(scanner.nextLine());
    }
    return manualLottos;
  }
}
