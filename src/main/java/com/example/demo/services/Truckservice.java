package com.example.demo.services;

import java.util.List;

/*import java.util.UUID;*/
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Truckdao;
import com.example.demo.loads.Payload;

@Service
public class Truckservice implements Services {

	@Autowired
	private Truckdao truckDao;
	
	@Override
	public List<Payload> getPayload() {
		// TODO Auto-generated method stub
		return truckDao.findAll();
	}

	@Override
	public Payload getPayload(UUID shipperId) {
		// TODO Auto-generated method stub
		
		return truckDao.findById(shipperId).get();
	}
	
	@Override
	public Payload addPayload(Payload payload)
	{
		truckDao.save(payload);
		return payload;
	}
	@Override
	public Payload updatePayload(Payload payload)
	{
		truckDao.save(payload);
		return payload;
	}
	@Override

	public Payload deletePayload(UUID shipperId)
	{
		Payload p = truckDao.findById(shipperId).get();
		truckDao.delete(p);
		return p;
	}
}
