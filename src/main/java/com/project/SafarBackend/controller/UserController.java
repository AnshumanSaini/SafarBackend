package com.project.SafarBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.SafarBackend.model.User;
import com.project.SafarBackend.service.UserService;


@RestController
@CrossOrigin(origins = "https://safarvoyage.netlify.app/")
@RequestMapping("/api/auth")	
public class UserController {
	
	@Autowired
	private UserService user_serv;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestBody User user) {
		return user_serv.login(user);
	}
	
	@RequestMapping(value = "/getuser", method = RequestMethod.GET)
	public User getUser(@RequestHeader("token") String token) {
		return user_serv.getUser(token);
	}

}
