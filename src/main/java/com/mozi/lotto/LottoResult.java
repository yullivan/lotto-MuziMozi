package com.mozi.lotto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LottoResult {
    private HashMap<Rank, Integer> countOfRank;
    private int rewardMoney;    // 당첨금

    public LottoResult(LottoTicket lottoTicket, LottoGame lottoGame) {
        HashMap<Rank, Integer> map = new HashMap<>();
        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
            Rank rank = calculateRank(lottoNumbers, lottoGame.getWinNumber(), lottoGame.getBonusNumber());
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }
        this.countOfRank = map;

        int moneySum = 0;
        for (Map.Entry<Rank, Integer> entry : map.entrySet()) {
            moneySum += entry.getKey().getWinningMoney() * entry.getValue();
        }
        this.rewardMoney = moneySum;
    }

    public HashMap<Rank, Integer> getCountOfRank() {
        return countOfRank;
    }

    public int getRewardMoney() {
        return rewardMoney;
    }

    private Rank calculateRank(LottoNumbers lottoNumbers, LottoNumbers winNumber, LottoNumber bonusNumber) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LottoResult that = (LottoResult) o;
        return rewardMoney == that.rewardMoney && Objects.equals(countOfRank, that.countOfRank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfRank, rewardMoney);
    }

    @Override
    public String toString() {
        return "LottoResult{" +
                "countOfRank=" + countOfRank +
                ", rewardMoney=" + rewardMoney +
                '}';
    }
}
