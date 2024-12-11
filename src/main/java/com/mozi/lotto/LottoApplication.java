package com.mozi.lotto;

public class LottoApplication {

	public static void main(String[] args) {
		LottoMachine lottoMachine = new LottoMachine();

		lottoMachine.savePurchaseInfo();
		lottoMachine.generateTicket();

//		LottoTicket lottoTicket = new LottoTicket();
//		lottoTicket = lottoMachine.generateTicket();

		OutputHandler.printLottoTicket(lottoMachine.getLottoTicket());
		lottoMachine.saveLastWeekLottoNumber();
	}
}
