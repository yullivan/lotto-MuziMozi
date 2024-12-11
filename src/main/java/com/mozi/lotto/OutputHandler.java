package com.mozi.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OutputHandler {

    public static void printPurchaseMessage(LottoMachine lottoMachine) {
        System.out.println(lottoMachine.getNumberOfGames() + "개를 구매했습니다.");
    }

    public static void printLottoTicket(LottoTicket lottoTicket) {
        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
            System.out.println(lottoNumbers.toString());
        }
    }

    public static void printResult(LottoMachine lottoMachine, LottoResult lottoResult) {
        List<Map.Entry<Rank, Integer>> entries = new ArrayList<>(lottoResult.getCountOfRank().entrySet());

        // countOfMatch 기준으로 정렬
        // comparintInt는 객체의 정수 값 속성을 기준으로 정렬하고 싶을 때 사용할 수 있음
        entries.sort(Comparator.comparingInt(entry -> entry.getKey().getCountOfMatch()));

        System.out.println("당첨 통계");
        System.out.println("________");

        for (Map.Entry<Rank, Integer> entry : entries) {
            int countOfMatch = entry.getKey().getCountOfMatch();
            int allMatches = entry.getValue();
            int reward = entry.getKey().getWinningMoney();

            if (countOfMatch < 3) continue;
            if (entry.getKey() == Rank.SECOND) {
                System.out.println(countOfMatch + "개 일치, 보너스 볼 일치 (" + reward + "원) - " + allMatches + "개");
            } else {
                System.out.println(countOfMatch + "개 일치 (" + reward + "원) - " + allMatches + "개");
            }
        }
        double rateOfReturn = lottoMachine.calculateRateOfReturn(lottoResult);
        System.out.println("총 수익률은 " + rateOfReturn + "입니다.");
    }
}
