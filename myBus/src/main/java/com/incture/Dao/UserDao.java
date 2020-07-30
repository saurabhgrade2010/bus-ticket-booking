package com.incture.Dao;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.incture.model.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void add(User user)
	{
		hibernateTemplate.save(user);
	}
	public void delete(int id)
	{
		User user = new User();
		user.setUser_id(id);
		hibernateTemplate.delete(user);
	}
	public ArrayList<User> showUser()
	{
		ArrayList<User> userList = (ArrayList<User>)hibernateTemplate.loadAll(User.class);
		return userList;
	}
	
}
