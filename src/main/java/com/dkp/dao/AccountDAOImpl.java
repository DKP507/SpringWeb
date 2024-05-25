package com.dkp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.dkmedia.entities.Account;

@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Account> getAllAccounts() {
	    List<Account> employees = manager.createQuery("Select a From Account a", Account.class).getResultList();
        return employees;
	}

	@Override
	public void addAccount(Account account) {
	    //Use null checks and handle them
		Account accountadd = new Account();
		accountadd.setAccountNumber(getLatestAccountNumber()+1);
		accountadd.setAccountName(account.getAccountName());
		accountadd.setAccountBalance(account.getAccountBalance());
	    manager.persist(accountadd);		
	}
	
	// This method to get the latest Account number and increment the value.
	private int getLatestAccountNumber() {
		return 0;
	}

	private Account getAccountById(int IdNum) {
		
		Account ac = manager.find(Account.class, IdNum);

		return ac;
	}
	
	/*
	 * public void addEmployee(EmployeeEntity employee) { //Use null checks and
	 * handle them
	 * employee.setDepartment(getDepartmentById(employee.getDepartment().getId()));
	 * manager.persist(employee); }
	 */
}
