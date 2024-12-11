package com.mozi.lotto;

import org.junit.jupiter.api.Test;

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

}
