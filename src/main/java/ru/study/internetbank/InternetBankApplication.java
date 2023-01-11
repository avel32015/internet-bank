package ru.study.internetbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.study.internetbank.services.BankDao;

import java.math.BigDecimal;

@SpringBootApplication
public class InternetBankApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(InternetBankApplication.class, args);

		BankDao bankDao = context.getBean(BankDao.class);

		BigDecimal balance = bankDao.getBalance("test");

		System.out.println("balance: " + balance.toString());
	}
}
