package com.mozi.lotto;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoApplicationTests {

	@Test
	void generateNumberTest() {
//		NumberGenerator numberGenerator = new NumberGenerator();
//		numberGenerator.generateNumber();
//		System.out.println(numberGenerator.getLottoNumber());
	}

	@Test
	void generateTicketTest() {
		LottoTicket lottoTicket = new LottoTicket();
//		lottoTicket.generateTicket(14);
//		for (NumberGenerator lottoNumber : lottoTicket.getTicket()) {
//			System.out.println(lottoNumber.getLottoNumber());
//		}
	}

	@Test
	void getValidatedBonusNumberTest() {
		LottoNumber bonusNumber = InputHandler.getValidatedBonusNumber();
		System.out.println(bonusNumber);
	}

	@Test
	void compareLottoNumbersTest() {
		LottoNumber n1 = new LottoNumber(1);
		LottoNumber n2 = new LottoNumber(1);
		assertThat(n1.equals(n2)).isTrue();
	}

	@Test
	void compareContainTest() {
		LottoNumbers lottoNumbers = new LottoNumbers(List.of(1,2,3,4,5,6));
		LottoNumber lottoNumber = new LottoNumber(1);
		assertThat(lottoNumbers.getNumbers().contains(lottoNumber)).isTrue();
	}

	@Test
	void calculateRankTest() {
		LottoResult lottoResult = new LottoResult();
		LottoNumbers lottoNumbers = new LottoNumbers(List.of(1,2,3,4,5,6));
		LottoNumbers winNumbers = new LottoNumbers(List.of(1,5,6,7,8,9));
		LottoNumber bonusNumber = new LottoNumber(2);
		System.out.println(lottoResult.calculateRank(lottoNumbers, winNumbers, bonusNumber).getWinningMoney());
		System.out.println(lottoResult.calculateRank(lottoNumbers, winNumbers, bonusNumber).getCountOfMatch());
	}
}
