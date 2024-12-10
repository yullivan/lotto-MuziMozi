package com.mozi.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {

    static List<Integer> generateNumber() {
        List<Integer> allLottoNumbers = new ArrayList<>();
        for (int i = 1; i < 45; i++) {
            allLottoNumbers.add(i);
        }
        Collections.shuffle(allLottoNumbers);
        List<Integer> lottoNumber = new ArrayList<>(allLottoNumbers.subList(0, 6));
        Collections.sort(lottoNumber);
        return lottoNumber;
    }
}
