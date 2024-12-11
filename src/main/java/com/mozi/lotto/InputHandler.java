package com.mozi.lotto;

import java.util.*;
import java.util.stream.Collectors;

public class InputHandler {

    public static int getValidatedPurchase() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("금액을 입력하세요: ");
                int pay = sc.nextInt();

                if (pay < 1000 || pay % 1000 != 0) {
                    System.out.println("제대로 된 금액을 입력해주세요! (1,000원 이상 / 1,000원 단위로 입력)");
                } else {
                    return pay;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다! 숫자를 입력해주세요.");
                sc.next(); // 잘못된 입력 소비
            }
        }
    }

    public static LottoNumbers getValidatedWinNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("지난 주 당첨 번호를 입력해 주세요. (1, 2, .. , 6): ");
                String number = sc.nextLine();
                List<Integer> tmpUserNumbers = Arrays.stream(number.split("\\s*,\\s*"))
                        .map(Integer::parseInt)
                        .distinct()
                        .sorted()
                        .toList();

                return new LottoNumbers(tmpUserNumbers);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 형식입니다!");
            }
        }
    }
}
