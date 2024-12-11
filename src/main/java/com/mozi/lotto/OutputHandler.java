package com.mozi.lotto;

public class OutputHandler {

    public static void printPurchaseMessage(LottoMachine lottoMachine) {
        System.out.println(lottoMachine.getNumberOfGames() + "개를 구매했습니다.");
    }
    public static void printLottoTicket(LottoTicket lottoTicket) {
        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
            System.out.println(lottoNumbers.toString());
        }
    }
}
