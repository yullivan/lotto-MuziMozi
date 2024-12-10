package com.mozi.lotto;

import org.junit.jupiter.api.Test;

class LottoApplicationTests {

	@Test
	void savePayTest() {
		LottoMachine lottoMachine = new LottoMachine();
		InputHandler inputHandler = new InputHandler();
		lottoMachine.savePay(inputHandler);
	}

	@Test
	void generateNumberTest() {
		NumberGenerator numberGenerator = new NumberGenerator();
		numberGenerator.generateNumber();
		System.out.println(numberGenerator.getLottoNumber());
	}

	@Test
	void generateTicketTest() {
		LottoTicket lottoTicket = new LottoTicket();
		lottoTicket.generateTicket(14);
		for (NumberGenerator lottoNumber : lottoTicket.getLottoNumbers()) {
			System.out.println(lottoNumber.getLottoNumber());
		}
	}

}
