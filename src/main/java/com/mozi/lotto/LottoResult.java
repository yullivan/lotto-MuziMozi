package com.mozi.lotto;

import java.util.List;

public class LottoResult {
    private int countOfMatch;
    private boolean matchBonus;
    private double rateOfReturn;    // 수익률

    public LottoResult(LottoTicket lottoTicket, List<Integer> winNumber) {

    }
    public Rank calculateRank(LottoTicket lottoTicket, List<Integer> winNumber) {
        return Rank.valueOf(countOfMatch, matchBonus);
    }
}
