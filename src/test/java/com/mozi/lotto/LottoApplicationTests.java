package com.mozi.lotto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class LottoApplicationTests {

	@Test
	void savePayTest() {
		LottoMachine lottoMachine = new LottoMachine();
		InputHandler inputHandler = new InputHandler();
		lottoMachine.savePay(inputHandler);
	}

}