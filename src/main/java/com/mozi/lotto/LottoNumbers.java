package com.mozi.lotto;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
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

    @Override
    public String toString() {
        return numbers + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumbers that = (LottoNumbers) o;
        return Objects.equals(numbers, that.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numbers);
    }
}
