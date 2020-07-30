package com.incture.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Saurabh Rajput";
	}
	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestParam int user_id,int bus_id)
	{
		try
		{
		bookService.book(user_id, bus_id);
		return new ResponseEntity<>("Booking successful for user id: "+user_id+" and busid: "+bus_id,HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>("Error :"+e.toString(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping("/showBook")
	public ArrayList showAll(@RequestParam int user_id)
	{
		ArrayList b=bookService.showAll(user_id);
		return b;
	}
}
