package com.incture.service;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.incture.Dao.UserDao;
import com.incture.model.User;


@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void add(User user)
	{
		userDao.add(user);
	}
	
	@Transactional
	public void delete(int id)
	{
		userDao.delete(id);
	}
	
	@Transactional
	public ArrayList<User> showUser()
	{
		ArrayList<User> l = userDao.showUser();
		return l;
	}
	
}
