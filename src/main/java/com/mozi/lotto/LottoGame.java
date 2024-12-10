package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoGame {
    List<Integer> lottoNumber = new ArrayList<>();

    public LottoGame() {
        this.lottoNumber = NumberGenerator.generateNumber();
    }

    public List<Integer> getLottoNumber() {
        return lottoNumber;
    }
}
