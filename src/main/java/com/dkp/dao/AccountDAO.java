package com.dkp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dkmedia.entities.Account;

@Repository
public interface AccountDAO {

	  public List<Account> getAllAccounts();
	  public void addAccount(Account employee);
}
