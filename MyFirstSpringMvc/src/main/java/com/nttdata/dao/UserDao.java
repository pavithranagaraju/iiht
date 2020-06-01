package com.nttdata.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.nttdata.model.User;
@Service
public class UserDao {
	private static List<User> users = new ArrayList<User>();
	private static int userCount = 3;

	static {
		getUsers().add(new User("Anu","anu@gmail.com","anu123","Banglore","Female",9087563423l));
		getUsers().add(new User("Janu","anu@gmail.com","janu123","Banglore","Female",8977563423l));
		getUsers().add(new User("Manu","manu@gmail.com","manu123","Banglore","male",8967124365l));
	}
	public boolean isUserValid(String emailid,String password){
		
		List<User> l=getUsers();
		
		
		for (User u1 : l) {
			if (u1.getPassword().equals(password)&&u1.getEmailId().equals(emailid))
			return true;
		}
		return false;
	}
/*public String retriveLoggedinUser(){
	
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}

	public List<User> retrieveusers(String name) {
		List<User> filteredusers = new ArrayList<User>();
		for (User user : getUsers()) {
			if (user.getPassword().equals(name))
				filteredusers.add(user);
		}
		return filteredusers;
	}*/

	public void adduser(User u) {
		users.add(u);
	}

	public void deleteuser(String emailid) {
		Iterator<User> iterator = getUsers().iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getEmailId().equals(emailid) ){
				iterator.remove();
			}
		}
	}

	public static List<User> getUsers() {
		return users;
	}

	
}
