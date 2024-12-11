package com.mozi.lotto;

public class LottoGame {
    private LottoNumbers winNumber;
    private LottoNumber bonusNumber;

    public LottoGame(LottoNumbers winNumber, LottoNumber bonusNumber) {
        this.winNumber = winNumber;
        this.bonusNumber = bonusNumber;
    }

    public LottoNumbers getWinNumber() {
        return winNumber;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }

    @Override
    public String toString() {
        return "LottoGame{" +
                "winNumber=" + winNumber +
                ", bonusNumber=" + bonusNumber +
                '}';
    }
}
