package com.mozi.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {
    List<Integer> lottoNumber = new ArrayList<>();

    public List<Integer> getLottoNumber() {
        return lottoNumber;
    }

    public void generateNumber() {
        List<Integer> allLottoNumbers = new ArrayList<>();
        for (int i = 1; i < 45; i++) {
            allLottoNumbers.add(i);
        }
        Collections.shuffle(allLottoNumbers);
        this.lottoNumber.addAll(allLottoNumbers.subList(0, 6));
        Collections.sort(this.lottoNumber);
    }
}
