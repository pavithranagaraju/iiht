package com.nttdata.model;

import java.util.Date;

public class Borrow {
String emailid,bookid;
Date date;
@Override
public String toString() {
	return "Borrow [emailid=" + emailid + ", bookid=" + bookid + ", date=" + date + "]";
}
public Borrow(String emailid, String bookid, Date date) {
	super();
	this.emailid = emailid;
	this.bookid = bookid;
	this.date = date;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getBookid() {
	return bookid;
}
public void setBookid(String bookid) {
	this.bookid = bookid;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
}
