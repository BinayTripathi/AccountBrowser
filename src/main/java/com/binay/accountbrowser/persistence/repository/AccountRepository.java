package com.binay.accountbrowser.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binay.accountbrowser.persistence.entity.Account;
import com.binay.accountbrowser.persistence.entity.TransactionDetails;

public interface AccountRepository extends JpaRepository<Account, String>{
	
	Optional<List<Account>> getAccountByUserName(String userName);
	
	Optional<Account> getAccountByAccountNumber(String accountNumber);

}
