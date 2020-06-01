package com.nttdata.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="can't be empty")
String name,address,gender;
long phno;
@NotEmpty(message="Email can't be empty")
@Email(message="Enter valid email")
String emailId;
@Size(min = 6, message = "Enter atleast 6 Characters.")
String password;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User()
{
	
}
public User(String name, String emailId, String password, String address, String gender, long phno) {
	super();
	this.name = name;
	this.emailId = emailId;
	this.password = password;
	this.address = address;
	this.gender = gender;
	this.phno = phno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "User [name=" + name + ", emailId=" + emailId + ", password=" + password + ", address=" + address
			+ ", gender=" + gender + ", phno=" + phno + "]";
}
}
