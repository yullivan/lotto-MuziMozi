package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<LottoGame> ticket = new ArrayList<>();

    public List<LottoGame> getTicket() {
        return ticket;
    }

    public void generateTicket(int numberOfGames) {
        for (int i = 0; i < numberOfGames; i++) {
            ticket.add(new LottoGame());
        }
    }
}
