package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    private int pay;
    private int numberOfGames;
    private List<Integer> winNumber = new ArrayList<>();

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }
    public List<Integer> getWinNumber() {
        return winNumber;
    }

    public void savePurchaseInfo(InputHandler inputHandler) {
        this.pay = inputHandler.getValidatedPurchase();
        this.numberOfGames = this.pay / 1000;
        System.out.println(this.numberOfGames + "개를 구매했습니다.");
    }

    public void saveLastWeekLottoNumber(InputHandler inputHandler) {
        this.winNumber = inputHandler.getValidatedWinNumber();
        System.out.println("지난주 당첨 번호: " + this.winNumber);
    }
}
