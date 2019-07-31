package com.demo.banking.objects;

import java.util.Random;

import org.joda.time.DateTime;

public class Account extends Customers{

	public Account(String customerID, String accountID, long currentAmount, long amount, long initDeposit) {
		super(customerID);
		this.accountID = accountID;
		this.currentAmount = currentAmount;
		this.amount = amount;
		this.initDeposit = initDeposit;
	}
	
	private String accountID;
	private String customerID;
	private long currentAmount;
	private long amount;
	private long initDeposit;
	
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public long getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(long currentAmount) {
		this.currentAmount = currentAmount;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getInitDeposit() {
		return initDeposit;
	}
	public void setInitDeposit(long initDeposit) {
		this.initDeposit = initDeposit;
	}
	
	// Deposit
	public long generateInitDepositAmount() {
		DateTime now = new DateTime();
		Random rand = new Random(now.getMillis());
		int randomNum = rand.nextInt(999999);
		String randomDeposit = String.valueOf(randomNum);
		long initDeposit = Long.parseLong(randomDeposit);
		this.setInitDeposit(initDeposit);;
		return this.getInitDeposit();
	} 
	
	// Current amount after create account
	public long getCurrentAmountAfterCreateAccount(long deposit) {
		deposit = this.getInitDeposit();
		this.setCurrentAmount(deposit);
		long currentAmount = this.getCurrentAmount();
		return currentAmount;
	}
	
	// Current amount after deposit
	public long getCurrentAmountAfterDeposit(long currentAmount, long depositAmount) {
		currentAmount = this.getCurrentAmount();
		if (depositAmount <= currentAmount) {
			long updatedCurrentAmount = currentAmount - depositAmount;
			this.setCurrentAmount(updatedCurrentAmount);
			return this.getCurrentAmount();
		} else {
			this.setCurrentAmount(currentAmount);
			return this.getCurrentAmount();
		}
		
	}
	
}
