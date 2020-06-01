package com.nttdata.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nttdata.model.Borrow;
@Service
public class BorrowDao {
	private static List<Borrow> borrow = new ArrayList<Borrow>();
	public static List<Borrow> getBorrow() {
		return borrow;
	}
	public List<Borrow> ListBorrow(String emailid){
		List<Borrow> l=new ArrayList<Borrow>();
		for(Borrow b:borrow)
			if(b.getEmailid().equals(emailid))
				l.add(b);		
		
		return l;
	}
	public void addBorrow(Borrow b){
		borrow.add(b);
	}
public void returnbook(String emailid,String bookid){
	if(borrow.isEmpty()){
		
	}
	else{
		
	List<Borrow> l=borrow;
	Borrow b1=null;
	for(Borrow b:l)
		if(b.getEmailid().equals(emailid)&b.getBookid().equals(bookid))
			b1=b;
	if(b1!=null)
		borrow.remove(b1);
	}
	}
}
