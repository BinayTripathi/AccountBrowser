package com.binay.accountbrowser.persistence.entity;

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
public class Account {
	
	@Id
	String accountNumber;
	
	String userName;
	
	String accountName;
	
	@Enumerated(EnumType.STRING)
	AccountType accountType;
	
	@Temporal(TemporalType.DATE)
	Date balanceDate;
	
	@Enumerated(EnumType.STRING)
	Currency currency;
	
	Double openingBalance;
	

}
