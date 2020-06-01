package com.nttdata.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.model.Book;
@Service
public class BookDao {
	private static List<Book> books = new ArrayList<Book>();
	public static List<Book> getBooks() {
		return books;
	}

	public static void setBooks(List<Book> books) {
		BookDao.books = books;
	}

	private static int bookCount = 3;

	static {
		books.add(new Book("10001","Java","anu",23l));
		books.add(new Book("10002","ML","manu",93l));
		books.add(new Book("10003","AI","janu",53l));
		}

	public Book retrieveBooks(String name) {
		for (Book book :books) {
			if (book.getName().equals(name)){
				return book;}
		}
		return null;
	}

	public void adduser(Book b) {
		books.add(b);
	}
	

	public void deletebook(String bookid) {
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (book.getId().equals(bookid) ){
				iterator.remove();
			}
		}
	}

}
