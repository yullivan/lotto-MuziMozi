package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();
		InputHandler inputHandler = new InputHandler();
		lottoMachine.savePurchaseInfo(inputHandler);
		lottoMachine.saveLastWeekLottoNumber(inputHandler);
	}
}
