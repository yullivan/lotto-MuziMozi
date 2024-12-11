package com.mozi.lotto;

import java.util.HashMap;
import java.util.List;

public class LottoResult {
    private HashMap<Integer, Integer> countOfRank;
    private double rateOfReturn;    // 수익률

    public Rank calculateRank(LottoNumbers lottoNumbers, LottoNumbers winNumber, LottoNumber bonusNumber) {
        int countOfMatch = 0;
        boolean matchBonus = false;
        for (LottoNumber number : winNumber.getNumbers()) {
            if (lottoNumbers.getNumbers().contains(number)) {
                countOfMatch++;
            }
            if (lottoNumbers.getNumbers().contains(bonusNumber)) {
                matchBonus = true;
            }
        }
        return Rank.valueOf(countOfMatch, matchBonus);
    }
}
