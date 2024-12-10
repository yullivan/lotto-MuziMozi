package com.mozi.lotto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private int pay;

    public InputHandler() {
    }

    public int getPay() {
        return pay;
    }

    void savePay() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("금액을 입력하세요: ");
                int pay = sc.nextInt();

                if (pay < 1000 || pay % 1000 != 0) {
                    System.out.println("제대로 된 금액을 입력해주세요! (1,000원 이상 / 1,000원 단위로 입력)");
                } else {
                    this.pay = pay;
                    System.out.println(this.pay / 1000 + "개를 구매했습니다.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다! 숫자를 입력해주세요.");
                sc.next();
            }
        }

        sc.close();
    }
}
