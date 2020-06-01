package com.nttdata.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nttdata.dao.BookDao;
import com.nttdata.dao.BorrowDao;
import com.nttdata.model.Book;
import com.nttdata.model.Borrow;

@Controller
public class BookController {

	@Autowired
	BookDao bookdao;
	
	@Autowired
	BorrowDao borrowdao;
	@RequestMapping(value="/listBookbyName",method=RequestMethod.GET)
	public String getBookbyName(@RequestParam String emailid,@RequestParam String bookname ,ModelMap model){
		model.addAttribute("emailid",emailid);
		System.out.println(bookname);
		String bname=bookname;
		System.out.println(bname);
		Book b=bookdao.retrieveBooks(bname);
		System.out.println(b);
		model.addAttribute("bookid",b.getId());
		model.addAttribute("book",bookdao.retrieveBooks(bname));
		return "ViewBook";
	}
	
	
	@RequestMapping(value="returnBorrow",method=RequestMethod.GET)
		public String ReturnBorrow(@RequestParam String emailid,@RequestParam String bookid,ModelMap model){
			borrowdao.returnbook(emailid, bookid);
			model.addAttribute("book",bookdao.getBooks());
			return "ViewBooks";
		}
	
	
	@RequestMapping(value="borrow",method=RequestMethod.GET)
	public String BorrowBook(@RequestParam String emailid,@RequestParam String bookid,ModelMap model){
		
		Date date=new Date();
		 Borrow b=new Borrow(emailid,bookid,date);
		 borrowdao.addBorrow(b);
		 List<Borrow> l=borrowdao.ListBorrow(emailid);
		 model.addAttribute("emailid",emailid);
		 model.addAttribute("myborrow",l);
		return "Success";
	}
	@RequestMapping(value="/listBooks",method=RequestMethod.GET)
	public String getBooks(@RequestParam String emailid,ModelMap model){
		model.addAttribute("emailid",emailid);
		
		
		model.addAttribute("book",bookdao.getBooks());
		return "ViewBooks";
	}
}
