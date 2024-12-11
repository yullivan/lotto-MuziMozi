package com.mozi.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberGenerator {

    static List<Integer> generateNumber() {
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            allNumbers.add(i);
        }
        Collections.shuffle(allNumbers);
        List<Integer> sixNumbers = allNumbers.subList(0, 6);
        Collections.sort(sixNumbers);

        return sixNumbers;
    }
}
