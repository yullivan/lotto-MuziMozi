package com.mozi.lotto;

public class LottoMachine {
    private int pay;
    private int numberOfGames;

    public LottoMachine(int pay) {
        this.pay = pay;
        this.numberOfGames = pay / 1000;
    }

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
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

    public double calculateRateOfReturn(LottoResult lottoResult) {
        return (double) lottoResult.getRewardMoney() / this.pay;
    }
}
