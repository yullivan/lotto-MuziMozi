package com.mozi.lotto;

public class LottoMachine {
    private int pay;
    private int numberOfGames;

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void savePurchaseInfo() {
        this.pay = InputHandler.getValidatedPurchase();
        this.numberOfGames = this.pay / 1000;
        System.out.println(this.numberOfGames + "개를 구매했습니다.");
    }

    public LottoTicket generateTicket() {
        LottoTicket lottoTicket = new LottoTicket();
        for (int i = 0; i < this.numberOfGames; i++) {
            lottoTicket.getTicket().add(new LottoNumbers(NumberGenerator.generateNumber()));
        }
        return lottoTicket;
    }

    public LottoNumbers saveWinNumber() {
        return InputHandler.getValidatedWinNumber();
    }

    public LottoNumber saveBonusNumber() {
        return InputHandler.getValidatedBonusNumber();
    }
}
