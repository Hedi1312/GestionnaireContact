package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.ContactService;
import com.app.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userServ;
	
	@PostMapping(value="inscription")
	public void register(@RequestBody User user) {
		userServ.register(user);
	}
}
