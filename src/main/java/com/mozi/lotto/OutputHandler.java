package com.mozi.lotto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class OutputHandler {
    public static void printOpeningMent() {
        System.out.println("============================================================");
        System.out.println("                        [ 모지 복권 ]");
        System.out.println("     - 1000원으로 20억의 주인이 될 기회! 지금 시작해볼까요? -");
        System.out.println("============================================================");
    }

    public static void printEndingMent() {
        System.out.println("============================================================");
        System.out.println("                        [ 당첨 확인 ]");
        System.out.println("              당첨 번호와 당신의 번호를 비교합니다!");
        System.out.println("                과연 행운의 주인공은 누구일까요?");
        System.out.println("                  결과를 지금 바로 확인하세요!");
        System.out.println("============================================================");
    }

    public static void printPurchaseMessage(LottoMachine lottoMachine) {
        System.out.println("수동으로 " + lottoMachine.getManualInputCount() + "장, "
                + "자동으로 " +(lottoMachine.getNumberOfGames()- lottoMachine.getManualInputCount())+ "장을 구매했습니다.");
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
        if (rateOfReturn == 0.0) System.out.println("낙첨되셨습니다. 다음 기회에...");
        System.out.println();
        System.out.println("====================================");
        System.out.println("총 수익률은 " + rateOfReturn + "입니다.");
        System.out.println("====================================");
    }
}
