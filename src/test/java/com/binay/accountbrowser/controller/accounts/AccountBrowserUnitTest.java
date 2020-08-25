package com.binay.accountbrowser.controller.accounts;


import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.binay.accountbrowser.persistence.entity.CardType;
import com.binay.accountbrowser.persistence.entity.Currency;
import com.binay.accountbrowser.persistence.entity.TransactionDetails;
import com.binay.accountbrowser.persistence.repository.TransactionDetailsRepository;


@SpringBootTest
public class AccountBrowserUnitTest {
	
	
	@MockBean
	private TransactionDetailsRepository transactionRepository;
	
	@InjectMocks
	private AccountsController accountController = new AccountsController();
	
	@BeforeEach
	public void setup() {
		
		//accountController = new AccountsController();
		accountController.setTransactionDetailsRepository(transactionRepository);
		
	}
	
	

	@Test
	public void getTransactionsForAccount_should_return_valid_transaction() {
		
		TransactionDetails td = new TransactionDetails();
		td.setAccountNumber("AN1");
		td.setCardType(CardType.CREDIT);
		td.setCreditAmount(100.0);
		td.setCurrency(Currency.AUD);
		td.setDebitAmount(0.0);
		td.setTransactionId("TX1");
		td.setTransactionNarative("Test transaction");
		td.setValueDate(new Date());
		List<TransactionDetails> txnList = new ArrayList<TransactionDetails>();
		txnList.add(td);
		
		
		Mockito.when(transactionRepository.getTransactionDetailsByAccountNumber(any())).thenReturn(Optional.of(txnList));
		
		ResponseEntity<List<TransactionDetails>> transactionsForAccount = accountController.getTransactionsForAccount("AN1");
		Assertions.assertTrue(transactionsForAccount.getStatusCode() == HttpStatus.OK);
	}

}
