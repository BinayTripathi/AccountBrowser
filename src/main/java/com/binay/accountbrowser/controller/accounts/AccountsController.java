package com.binay.accountbrowser.controller.accounts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.binay.accountbrowser.exception.AccountNotFoundException;
import com.binay.accountbrowser.exception.TrancationNotFoundException;
import com.binay.accountbrowser.persistence.entity.Account;
import com.binay.accountbrowser.persistence.entity.TransactionDetails;
import com.binay.accountbrowser.persistence.repository.AccountRepository;
import com.binay.accountbrowser.persistence.repository.TransactionDetailsRepository;

import lombok.Setter;


@RestController
@Setter
public class AccountsController {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	TransactionDetailsRepository transactionDetailsRepository;
	
	@Autowired
	AccountModelAssembler accountModelAssembler;
	
	
	@GetMapping("/accounts/user/{userName}")
	public ResponseEntity<CollectionModel<AccountsModel>> getAccountsForUser(@PathVariable String userName) {
		
		Optional<List<Account>> accountByUserName = accountRepository.getAccountByUserName(userName);
		if(!accountByUserName.isPresent()) {
			throw new AccountNotFoundException("No accounts found for user " + userName);
		}
		
		 CollectionModel<AccountsModel> accountModel = accountModelAssembler.toAccountModel(userName,accountByUserName.get());
		 return new ResponseEntity<>(accountModel,HttpStatus.OK);
		
		
	}
	
	
	@GetMapping("/transactions/account/{account}")
	public ResponseEntity<List<TransactionDetails>> getTransactionsForAccount(@PathVariable String account) {
		
		Optional<List<TransactionDetails>> transactionDetails = transactionDetailsRepository.getTransactionDetailsByAccountNumber(account);
		if(!transactionDetails.isPresent()) {
			throw new TrancationNotFoundException("No transactions found for the account " + account);
		}
		
		return new ResponseEntity<>(transactionDetails.get(),HttpStatus.OK);
		
	}

}
