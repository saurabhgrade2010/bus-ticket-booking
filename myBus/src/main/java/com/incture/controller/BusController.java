package com.incture.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.incture.model.Bus;
import com.incture.service.BusService;


@RestController
@RequestMapping("bus")
public class BusController {

	@Autowired
	private BusService busService;
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "Hello Saurabh Rajput";
	}
	
	@PostMapping(value="/add",consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<String> add(@RequestBody Bus bus)
	{
		bus.toString();
		busService.add(bus);
		return new ResponseEntity<>(bus.toString()+" added ",HttpStatus.OK);
	}
	
	@PostMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestBody Bus bus)
	{
		busService.delete(bus.getBus_id());
		return new ResponseEntity<>("deleted",HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@PostMapping(value="/showbusbysource")
	public ArrayList<Bus> showbusbysource(@RequestBody String source,String destination)
	{
		try {
		ArrayList<Bus> b= busService.showbusbysource(source,destination);
		if(b.isEmpty())
		{
			System.out.println("No bus Found");
		}
		return b;
		}catch(Exception e)
		{
			System.out.println(e);
			return new ArrayList<Bus>();
		}
	}
	
	@GetMapping(value="showBus")
	public ArrayList<Bus> showBus()
	{
		ArrayList<Bus> bus = busService.showBus();
		if(bus.isEmpty())
		{
			System.out.println("No Data Found");
		}
		return bus;
	}
	
	
}
