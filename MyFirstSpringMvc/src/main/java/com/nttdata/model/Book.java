package com.nttdata.model;

public class Book {
String id,name,author;
float price;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
}
public Book(String id, String name, String author, float price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}
}
