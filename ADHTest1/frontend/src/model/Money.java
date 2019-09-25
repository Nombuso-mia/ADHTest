package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "money")
@SessionScoped
public class Money {
	
	private String name;
	private String sourcePassport;
	private String destinationBank;
	private String destinatiomCountry;
	private Number accountNumber;
	private Number amount;
	private Number transactionCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinatiomCountry() {
		return destinatiomCountry;
	}
	public void setDestinatiomCountry(String destinatiomCountry) {
		this.destinatiomCountry = destinatiomCountry;
	}
	public Number getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Number accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Number getAmount() {
		return amount;
	}
	public void setAmount(Number amount) {
		this.amount = amount;
	}
	public Number getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Number transactionCode) {
		this.transactionCode = transactionCode;
	} 
	
	public MoneyEntity getEntity() {
		MoneyEntity moneyentity = new MoneyEntity();
		moneyentity.setName(name);
		moneyentity.setAccountNumber(accountNumber);
		moneyentity.setAmount(amount);
		moneyentity.setDestinatiomCountry(destinatiomCountry);
		moneyentity.setDestinationBank(destinationBank);
		moneyentity.setSourcePassport(sourcePassport);
		moneyentity.setTransactionCode(transactionCode);
		
		return moneyentity;
	}
	

}
