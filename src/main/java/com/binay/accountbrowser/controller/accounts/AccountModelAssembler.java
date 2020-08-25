package com.binay.accountbrowser.controller.accounts;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import com.binay.accountbrowser.persistence.entity.Account;

@Component
public class AccountModelAssembler extends RepresentationModelAssemblerSupport<Account,AccountsModel>{
	public AccountModelAssembler() {
		super(AccountsController.class, AccountsModel.class);
	
	}

	@Override
	public AccountsModel toModel(Account entity) {
		AccountsModel accountModel = instantiateModel(entity);
		
		//accountModel.add(linkTo(AccountsController.class).slash(entity.getUserName()).withSelfRel());
		
		accountModel.add(linkTo(
				methodOn(AccountsController.class)
				.getAccountsForUser(entity.getUserName()))
				.withSelfRel());
		
		accountModel.setAccountName(entity.getAccountName());
		accountModel.setAccountNumber(entity.getAccountNumber());
		accountModel.setAccountType(entity.getAccountType().toString());
		accountModel.setBalanceDate(entity.getBalanceDate());
		accountModel.setCurrency(entity.getCurrency().toString());
		accountModel.setOpeningBalance(entity.getOpeningBalance());
		accountModel.setUserName(entity.getUserName());
		
		
		return accountModel;
	}
	
	/*@Override
	public CollectionModel<AccountsModel> toCollectionModel(Iterable<? extends Account> entities) 
	{
		CollectionModel<AccountsModel> actorModels = super.toCollectionModel(entities);
		
		actorModels.add(linkTo(methodOn(AccountsController.class).getAccountsForUser(entity.getUserName())).withSelfRel());
		
		return actorModels;
	}*/
	

	public static CollectionModel<AccountsModel> toAccountModel(String userName, List<Account> accounts) {
		if (accounts.isEmpty())
			return null;

		 List<AccountsModel> accountModels = accounts.stream()
				.map(acc -> AccountsModel.builder()
						.accountName(acc.getAccountName())
						.accountNumber(acc.getAccountNumber())
						.accountType(acc.getAccountType().toString())
						.balanceDate(acc.getBalanceDate())
						.currency(acc.getCurrency().toString())
						.openingBalance(acc.getOpeningBalance())
						.userName(acc.getUserName())
						.build()
						.add(linkTo(
								methodOn(AccountsController.class)
								.getTransactionsForAccount(acc.getAccountNumber()))
								.withSelfRel()))					
						.collect(Collectors.toList());
		
		
		Link link =linkTo(AccountsController.class).slash(userName).withSelfRel();
		CollectionModel<AccountsModel> result = new CollectionModel<>(accountModels, link);
	    return result;
	}
	
	

	
	
}

