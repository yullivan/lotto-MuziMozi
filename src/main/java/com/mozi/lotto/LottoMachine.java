package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    private int pay;
    private int numberOfGames;
    private List<Integer> winNumber = new ArrayList<>();
    private LottoTicket lottoTicket = new LottoTicket();

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }
    public List<Integer> getWinNumber() {
        return winNumber;
    }

    public LottoTicket getLottoTicket() {
        return lottoTicket;
    }

    public void savePurchaseInfo() {
        this.pay = InputHandler.getValidatedPurchase();
        this.numberOfGames = this.pay / 1000;
        System.out.println(this.numberOfGames + "개를 구매했습니다.");
    }

    public void saveLastWeekLottoNumber() {
        this.winNumber = InputHandler.getValidatedWinNumber();
    }

    public void generateTicket() {
        for (int i = 0; i < this.numberOfGames; i++) {
            this.lottoTicket.getTicket().add(new LottoNumbers(NumberGenerator.generateNumber()));
        }
    }
}
