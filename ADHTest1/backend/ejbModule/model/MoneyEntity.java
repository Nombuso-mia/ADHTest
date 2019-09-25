package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "digibank_tbl")
public class MoneyEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private String name;
private String sourcePassport;
private String destinationBank;
private String destinatiomCountry;
private Number accountNumber;
private Number amount;
private Number TransactionCode;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
	return TransactionCode;
}
public void setTransactionCode(Number transactionCode) {
	TransactionCode = transactionCode;
}



}
