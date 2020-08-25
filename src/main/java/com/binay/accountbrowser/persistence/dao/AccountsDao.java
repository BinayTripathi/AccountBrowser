package com.binay.accountbrowser.persistence.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.binay.accountbrowser.persistence.entity.Account;
import com.binay.accountbrowser.persistence.entity.AccountType;
import com.binay.accountbrowser.persistence.entity.Currency;
import com.binay.accountbrowser.persistence.repository.AccountRepository;

@Component
public class AccountsDao {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	public void createNewAccount( ) {
		Account account = new Account();
		account.setAccountName("account1");
		account.setAccountNumber("1");
		account.setAccountType(AccountType.CURRENT);
		account.setBalanceDate(new Date());
		account.setCurrency(Currency.AUD);
		account.setOpeningBalance(100.00);
		account.setUserName("user1");
		
		accountRepository.save(account);
	}

}
