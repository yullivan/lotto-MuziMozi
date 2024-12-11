package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    private int pay;
    private int numberOfGames;
    private LottoNumbers winNumber;

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }
    public LottoNumbers getWinNumber() {
        return winNumber;
    }

    public void savePurchaseInfo() {
        this.pay = InputHandler.getValidatedPurchase();
        this.numberOfGames = this.pay / 1000;
        System.out.println(this.numberOfGames + "개를 구매했습니다.");
    }

    public void saveLastWeekLottoNumber() {
        this.winNumber = InputHandler.getValidatedWinNumber();
    }

    public LottoTicket generateTicket() {
        LottoTicket lottoTicket = new LottoTicket();
        for (int i = 0; i < this.numberOfGames; i++) {
            lottoTicket.getTicket().add(new LottoNumbers(NumberGenerator.generateNumber()));
        }
        return lottoTicket;
    }
}
