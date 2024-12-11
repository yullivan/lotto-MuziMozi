package com.mozi.lotto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LottoNumbers {
    private final List<LottoNumber> numbers;

    public LottoNumbers(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("로또 번호는 반드시 6개여야 합니다.");
        }
        List<LottoNumber> lottoNumbers = numbers.stream()
                .map(number -> new LottoNumber(number))
                .distinct()
                .toList();

        if (lottoNumbers.size() != 6) {
            throw new IllegalArgumentException("로또 번호는 중복되지 않아야 합니다.");
        }

        this.numbers = lottoNumbers;
    }

    public List<LottoNumber> getNumbers() {
        return numbers;
    }
}
