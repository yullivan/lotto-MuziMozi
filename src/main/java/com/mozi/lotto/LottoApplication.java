package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {

		OutputHandler.printOpeningMent();
		System.out.println();

		LottoMachine lottoMachine = new LottoMachine(InputHandler.getValidatedPurchase(), InputHandler.getValidatedManulInputCount());
		System.out.println();

		LottoTicket lottoTicket = lottoMachine.generateTicket();
		System.out.println();

		OutputHandler.printPurchaseMessage(lottoMachine);
		OutputHandler.printLottoTicket(lottoTicket);
		System.out.println();

		LottoNumbers winNumber = lottoMachine.saveWinNumber();
		LottoNumber bonusNumber = lottoMachine.saveBonusNumber();
		System.out.println();

		LottoGame lottoGame = new LottoGame(winNumber, bonusNumber);

		LottoResult lottoResult = new LottoResult(lottoTicket, lottoGame);

		OutputHandler.printEndingMent();
		System.out.println();
		OutputHandler.printResult(lottoMachine, lottoResult);
	}
}
