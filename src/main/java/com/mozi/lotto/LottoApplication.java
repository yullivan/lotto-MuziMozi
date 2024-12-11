package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();
		InputHandler inputHandler = new InputHandler();
		OutputHandler outputHandler = new OutputHandler();

		lottoMachine.savePurchaseInfo(inputHandler);
//		lottoTicket.generateTicket(lottoMachine.getNumberOfGames());
		lottoMachine.generateTicket();
		outputHandler.printLottoTicket(lottoMachine.getLottoTicket());
		lottoMachine.saveLastWeekLottoNumber(inputHandler);
	}
}
