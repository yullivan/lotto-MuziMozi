package com.mozi.lotto;

public class LottoNumber {
    private final int number;

    public LottoNumber(int number) {
        if (number < 1 || number > 45) {
            throw new IllegalArgumentException("[ERROR] 로또 숫자는 1이상 45이하의 정수만 가능");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + "";
    }
}
