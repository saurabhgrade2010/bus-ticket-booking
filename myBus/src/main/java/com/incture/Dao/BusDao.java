package com.incture.Dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.incture.model.Bus;

@Repository
public class BusDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void add(Bus bus)
	{
		hibernateTemplate.save(bus);
	}
	public void delete(int id)
	{
		Bus bus = new Bus();
		bus.setBus_id(id);
		hibernateTemplate.delete(bus);
	}
	public ArrayList<Bus> showBus()
	{
		ArrayList<Bus> bus = (ArrayList<Bus>)hibernateTemplate.loadAll(Bus.class);
		return bus;
	}
	public ArrayList<Bus> showbusbysource(String source,String destination)
	{
		ArrayList<Bus> bus = (ArrayList<Bus>)hibernateTemplate.loadAll(Bus.class);
		try{
		SessionFactory sf = hibernateTemplate.getSessionFactory();
		Session session = sf.getCurrentSession();
		Query q=session.createNativeQuery("select bus_id,bus_name from bus where source="+source);
		ArrayList list = (ArrayList)q.getResultList();
		System.out.println(list);
	    }catch(Exception e)
		{
		System.out.println("hello "+e);
		}
		return bus;
		//return bus;
	}
}
