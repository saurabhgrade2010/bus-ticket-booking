package com.incture.Dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.incture.model.Bus;
import com.incture.model.bookbus;
import com.incture.model.User;

@Repository
public class BookDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void bookBus(int user_id,int bus_id)
	{
		User user = new User();
		user.setUser_id(user_id);
		
		Bus bus = new Bus();
		bus.setBus_id(bus_id);
		
		SessionFactory sf = hibernateTemplate.getSessionFactory();
		Session session = sf.getCurrentSession();
		Query q = session.createNativeQuery("update bus set availableSeats=(select availableSeats from bus where bus_id="+bus_id+")-1 where bus_id="+bus_id);     
		q.executeUpdate();
		bookbus b =new bookbus();
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		b.setUserList(userList);
		List<Bus> busList = new ArrayList<Bus>();
		busList.add(bus);
		b.setBusList(busList);
		
		java.util.Date date = new java.util.Date();
		b.setBookingDate(date);
		hibernateTemplate.save(b);
	}
	
	@SuppressWarnings("rawtypes")
	public ArrayList showAll(int user_id)
	{
		ArrayList list;
		SessionFactory sf = hibernateTemplate.getSessionFactory();
		Session session = sf.getCurrentSession();
		Query q=session.createNativeQuery("select Distinct b.bus_id,u.user_id,u.user_first_name,u.usre_last_name,b.bus_name from users as u,bus as b,bookbus as bs,bookbus_bus as bsb,bookbus_users as bsu where u.user_id = bsu.userlist_user_id and b.bus_id =bsb.buslist_bus_id and bsu.userlist_user_id="+user_id);
		list = (ArrayList)q.getResultList();
		return list;
	}
}
