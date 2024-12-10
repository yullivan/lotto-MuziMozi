package com.mozi.lotto;

public class LottoMachine {
    private int pay;

    public void savePay(InputHandler inputHandler) {
        this.pay = inputHandler.getValidatedPay();
        System.out.println(this.pay / 1000 + "개를 구매했습니다.");
    }

    public int getPay() {
        return pay;
    }
}
