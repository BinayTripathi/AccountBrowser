package com.binay.accounts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.binay.accounts.persistence.entity.Account;
import com.binay.accounts.persistence.entity.TransactionDetails;
import com.binay.accounts.persistence.repository.AccountRepository;
import com.binay.accounts.persistence.repository.TransactionDetailsRepository;
@RestController
public class AccountBrowserController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	TransactionDetailsRepository transactionDetailsRepository;
	
	
	@GetMapping("/accounts/{userName}")
	public List<Account> getAccountsForUser(@PathVariable String userName) {
		
		Optional<List<Account>> accountByUserName = accountRepository.getAccountByUserName(userName);
		return accountByUserName.get();
		
	}
	
	@GetMapping("/transactions/{account}")
	public List<TransactionDetails> getTransactionsForAccount(@PathVariable String account) {
		
		Optional<List<TransactionDetails>> transactionDetails = transactionDetailsRepository.getTransactionDetailsByAccountNumber(account);
		return transactionDetails.get();
		
	}

}
