package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();

		lottoMachine.savePurchaseInfo();

		LottoTicket lottoTicket = lottoMachine.generateTicket();

		OutputHandler.printLottoTicket(lottoTicket);

		LottoNumbers winNumber = lottoMachine.saveWinNumber();
		LottoNumber bonusNumber = lottoMachine.saveBonusNumber();

		LottoGame lottoGame = new LottoGame(winNumber, bonusNumber);
		System.out.println(lottoGame);
	}
}
