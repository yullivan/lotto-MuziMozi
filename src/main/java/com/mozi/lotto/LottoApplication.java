package com.mozi.lotto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class LottoApplication {

	public static void main(String[] args) {
		InputHandler inputHandler = new InputHandler();
		inputHandler.savePay();
	}

}
