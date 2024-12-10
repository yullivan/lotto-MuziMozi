package com.mozi.lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private List<NumberGenerator> lottoNumbers = new ArrayList<>();

    public List<NumberGenerator> getLottoNumbers() {
        return lottoNumbers;
    }

    public void generateTicket(int numberOfGames) {
        for (int i = 0; i < numberOfGames; i++) {
            NumberGenerator numberGenerator = new NumberGenerator();
            numberGenerator.generateNumber();
            lottoNumbers.add(numberGenerator);
        }
    }
}
