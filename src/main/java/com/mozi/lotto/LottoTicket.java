package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<LottoNumbers> ticket = new ArrayList<>();

    public LottoTicket() {
    }

    public LottoTicket(List<LottoNumbers> ticket) {
        this.ticket = ticket;
    }

    public List<LottoNumbers> getTicket() {
        return ticket;
    }
}
