package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();
		InputHandler inputHandler = new InputHandler();
		OutputHandler outputHandler = new OutputHandler();
		LottoTicket lottoTicket = new LottoTicket();

		lottoMachine.savePurchaseInfo(inputHandler);
		lottoTicket.generateTicket(lottoMachine.getNumberOfGames());
		outputHandler.printLottoTicket(lottoTicket);
		lottoMachine.saveLastWeekLottoNumber(inputHandler);
	}
}
