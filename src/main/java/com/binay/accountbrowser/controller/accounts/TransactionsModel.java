package com.binay.accountbrowser.controller.accounts;

import java.util.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.hateoas.RepresentationModel;

import com.binay.accountbrowser.persistence.entity.CardType;
import com.binay.accountbrowser.persistence.entity.Currency;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TransactionsModel extends RepresentationModel<TransactionsModel> {

	int transactionId;	
	String accountNumber;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	Date valueDate;
	
	String currency;
	
	Double debitAmount;
	
	Double creditAmount;
	
	String cardType;
	
	String transactionNarative;
}
