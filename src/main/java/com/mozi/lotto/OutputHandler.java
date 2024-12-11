package com.mozi.lotto;

public class OutputHandler {

    public static void printLottoTicket(LottoTicket lottoTicket) {
        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
            System.out.println(lottoNumbers.toString());
        }
    }
}
