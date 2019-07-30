package com.demo.banking.objects;

public class Account extends Customers{
	
	public Account(String customerID, String accountType, String dateOfOpening, long currentAmount) {
		super(customerID);
		this.accountType = accountType;
		this.dateOfOpening = dateOfOpening;
		this.currentAmount = currentAmount;
	}

	private String customerID;
	private String accountType;
	private String dateOfOpening;
	private long currentAmount;
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(String dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	public long getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(long currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	
	
	
	
}
