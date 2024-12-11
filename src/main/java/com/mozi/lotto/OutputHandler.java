package com.mozi.lotto;

public class OutputHandler {

    public static void printLottoTicket(LottoTicket lottoTicket) {
//        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
//            for (LottoNumber number : lottoNumbers.getNumbers()) {
//                System.out.print(number.getNumber());
//            }
//            System.out.println();
//        }
        for (LottoNumbers lottoNumbers : lottoTicket.getTicket()) {
            for (LottoNumber number : lottoNumbers.getNumbers()) {
                if (lottoNumbers.getNumbers().indexOf(number)== 0) {
                    System.out.print("[" + number.getNumber() + ", ");
                }
                else if (lottoNumbers.getNumbers().indexOf(number)== lottoNumbers.getNumbers().size() - 1) {
                    System.out.print(number.getNumber() + "]");
                }
                else {
                    System.out.print(number.getNumber() + ", ");
                }
            }
            System.out.println();
        }
    }
}
