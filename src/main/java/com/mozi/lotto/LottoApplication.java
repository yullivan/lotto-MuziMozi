package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();

		lottoMachine.savePurchaseInfo();

		LottoTicket lottoTicket = lottoMachine.generateTicket();

		OutputHandler.printLottoTicket(lottoTicket);
		lottoMachine.saveLastWeekLottoNumber();
	}
}
