package com.websystique.springboot.model;

import java.io.Serializable;

public class Beneficiary implements Serializable {
private String beneficiaryId;
private String name;
private String account;
private String customerId;
private String phone;
private String bankName;




public String getBeneficiaryId() {
	return beneficiaryId;
}
public void setBeneficiaryId(String beneficiaryId) {
	this.beneficiaryId = beneficiaryId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
}
