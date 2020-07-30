package com.incture.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.model.User;
import com.incture.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Saurabh Rajput";
	}
	
	@PostMapping(value="/add", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
     public ResponseEntity<String> add(@RequestBody User user)
     {
		user.toString();
		userService.add(user);
		return new ResponseEntity<>(user.toString()+"added",HttpStatus.OK);
     }
	
	@PostMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestBody User user)
	{
		userService.delete(user.getUser_id());
		return new ResponseEntity("deleted",HttpStatus.OK);
	}
	
	@GetMapping(value="/showUser")
	public ArrayList<User> showUser()
	{
		return userService.showUser();
	}
}
