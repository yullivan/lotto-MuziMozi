package com.mozi.lotto;

public class OutputHandler {

    public void printLottoTicket(LottoTicket lottoTicket) {
        for (LottoGame lottoGame : lottoTicket.getTicket()) {
            System.out.println(lottoGame.getLottoNumber());
        }
    }
}
