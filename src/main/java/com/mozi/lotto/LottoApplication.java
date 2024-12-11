package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine(InputHandler.getValidatedPurchase());
		OutputHandler.printPurchaseMessage(lottoMachine);

		LottoTicket lottoTicket = lottoMachine.generateTicket();

		OutputHandler.printLottoTicket(lottoTicket);

		LottoNumbers winNumber = lottoMachine.saveWinNumber();
		LottoNumber bonusNumber = lottoMachine.saveBonusNumber();

		LottoGame lottoGame = new LottoGame(winNumber, bonusNumber);

		LottoResult lottoResult = new LottoResult(lottoTicket, lottoGame);

		OutputHandler.printResult(lottoMachine, lottoResult);
	}
}
