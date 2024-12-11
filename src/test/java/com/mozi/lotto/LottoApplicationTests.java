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
		LottoNumbers lottoNumbers1 = new LottoNumbers(List.of(1,2,3,4,8,6));
		LottoNumbers lottoNumbers2 = new LottoNumbers(List.of(1,2,3,4,7,8));
		LottoNumbers lottoNumbers3 = new LottoNumbers(List.of(1,2,3,4,8,11));
		LottoNumbers winNumbers = new LottoNumbers(List.of(1,2,3,4,8,11));
		LottoNumber bonusNumber = new LottoNumber(7);
		LottoTicket lottoTicket = new LottoTicket(List.of(lottoNumbers1, lottoNumbers2, lottoNumbers3));
		LottoGame lottoGame = new LottoGame(winNumbers, bonusNumber);
		LottoResult lottoResult = new LottoResult(lottoTicket, lottoGame);
		System.out.println(lottoResult.getCountOfRank().toString());

	}
}
