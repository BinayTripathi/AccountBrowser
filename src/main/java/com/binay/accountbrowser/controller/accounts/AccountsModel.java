package com.binay.accountbrowser.controller.accounts;

import java.util.Date;

import org.springframework.hateoas.RepresentationModel;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class AccountsModel extends RepresentationModel<AccountsModel> {

String accountNumber;
	
	String userName;
	
	String accountName;
	
	String accountType;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	Date balanceDate;
	
	String currency;
	
	Double openingBalance;
}
