package com.binay.accounts.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Data
public class TransactionDetails {

	@Id
	int transactionId;
	
	String accountNumber;
	
	@Temporal(TemporalType.DATE)
	Date valueDate;
	
	@Enumerated(EnumType.STRING)
	Currency currency;
	
	Double debitAmount;
	
	Double creditAmount;
	
	@Enumerated(EnumType.STRING)
	CardType cardType;
	
	String transactionNarative;
	
}
