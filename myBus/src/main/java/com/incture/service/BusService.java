package com.incture.service;

import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.incture.Dao.BusDao;
import com.incture.model.Bus;

@Service
public class BusService {

	@Autowired
	private BusDao busDao;
	
	@Transactional
	public void add(Bus bus)
	{
		busDao.add(bus);
	}
	@Transactional
	public void delete(int id)
	{
		busDao.delete(id);
	}
	@Transactional
	public ArrayList<Bus> showBus()
	{
		return busDao.showBus();
	}
	@Transactional
	public ArrayList<Bus> showbusbysource(String source,String destination)
	{
		return busDao.showbusbysource(source,destination);
	}
}
