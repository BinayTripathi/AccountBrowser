package com.binay.accountbrowser.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binay.accountbrowser.persistence.entity.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, String> {
	
	Optional<List<TransactionDetails>> getTransactionDetailsByAccountNumber(String accountNumber);

}
