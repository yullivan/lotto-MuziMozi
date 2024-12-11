package com.mozi.lotto;

public class LottoMachine {
    private int pay;
    private int numberOfGames;
    private int manualInputCount;   // 수동 입력 개수 저장

    public LottoMachine(int pay, int manualInputCount) {
        this.pay = pay;
        this.numberOfGames = pay / 1000;
        if (manualInputCount > this.numberOfGames) {
            throw new IllegalArgumentException("[ERROR] 돈이 부족합니다!");
        }
        if (manualInputCount < 0) {
            throw new IllegalArgumentException("[ERROR] 제대로 입력해 주세요!");
        }
        this.manualInputCount = manualInputCount;
    }

    public int getPay() {
        return pay;
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }

    public int getManualInputCount() {
        return manualInputCount;
    }

    public LottoTicket generateManualTicket() {
        LottoTicket lottoTicket = new LottoTicket();
        System.out.println("수동으로 구매할 번호를 입력해 주세요. (1, 2, .. , 6): ");
        for (int i = 0; i < this.manualInputCount; i++) {
            lottoTicket.getTicket().add(InputHandler.getValidatedManualNumber());
        }
        return lottoTicket;
    }

    public LottoTicket generateTicket() {
        LottoTicket lottoTicket = generateManualTicket();
        for (int i = 0; i < this.numberOfGames - this.manualInputCount; i++) {
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
