package com.nttdata.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nttdata.dao.UserDao;
import com.nttdata.dao.UserValidation;
import com.nttdata.model.User;

@Controller
@SessionAttributes("emailid")
public class LoginController {
	@Autowired
UserValidation user;
User u;
	@Autowired
	UserDao userdao;
	@RequestMapping(value="/home")
	
	public String LoginUser(@RequestParam String emailid,@RequestParam String Password,ModelMap model){
		
List<User> l=userdao.getUsers();
		
		
		for (User u1 : l) {
			System.out.println(u1);
			if (u1.getPassword().equals(Password)&&u1.getEmailId().equals(emailid))
			{
				model.put("emailid",emailid);
				model.put("password",Password);
				
				return "welcome";
			}
		}
		model.put("errorMessage","Invalid Credentials");
		
		return "Login";
		
		
	}
	
@RequestMapping(value="/")
	
	public String logPage(){
		
		return "Login";
	}
	/*
	@RequestMapping(value="/")
	public String welcomePage(ModelMap model){
		model.put("emailid", userdao.retriveLoggedinUser());
		return "welcome";
	}*/
@RequestMapping(value="/Register")

public String RegisterPage(ModelMap model){
	model.addAttribute("user",new User());
	return "Register";
}

@RequestMapping(value="/register")

public String RegisterUser(ModelMap model,@Valid User user , BindingResult result){
	if(result.hasErrors())
		return "Register";
	
	userdao.adduser(user);
	
	List<User> l=	userdao.getUsers();
	for(User u:l){
		System.out.println(u);
	}
		return "redirect:/Login";
	
}
}