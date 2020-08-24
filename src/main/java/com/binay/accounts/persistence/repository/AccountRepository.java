package com.binay.accounts.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binay.accounts.persistence.entity.Account;
import com.binay.accounts.persistence.entity.TransactionDetails;

public interface AccountRepository extends JpaRepository<Account, String>{
	
	Optional<List<Account>> getAccountByUserName(String userName);

}
