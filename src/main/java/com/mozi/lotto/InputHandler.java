package com.mozi.lotto;

import java.util.*;
import java.util.stream.Collectors;

public class InputHandler {

    public int getValidatedPurchase() {
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

    public List<Integer> getValidatedWinNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("지난 주 당첨 번호를 입력해 주세요. (1, 2, .. , 6): ");
                String number = sc.nextLine();
                List<Integer> numbers = Arrays.stream(number.split("\\s*,\\s*"))
                        .map(Integer::parseInt)
                        .distinct()
                        .sorted()
                        .toList();

                if (numbers.size() != 6 || numbers.stream().anyMatch(n -> n < 1 || n > 45)) {
                    System.out.println("번호는 1~45 사이의 6개 숫자를 입력해야 합니다.");
                } else {
                    return numbers;
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 형식입니다! 번호는 숫자만 입력해야 합니다.");
            }
        }
    }
}
