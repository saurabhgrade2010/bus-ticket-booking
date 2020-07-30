package com.incture.service;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.Dao.BookDao;
import com.incture.model.bookbus;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;
	
	@Transactional
	public void book(int user_id,int bus_id)
	{
		bookDao.bookBus(user_id, bus_id);
	}
	
	@SuppressWarnings("rawtypes")
	@Transactional
	public ArrayList showAll(int user_id)
	{
		return bookDao.showAll(user_id);
	}
}
