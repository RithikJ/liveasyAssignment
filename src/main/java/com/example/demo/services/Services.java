package com.example.demo.services;

import java.util.List;

/*import java.util.UUID;*/
import java.util.UUID;

import com.example.demo.loads.Payload;

public interface Services {
	public List<Payload> getPayload();
	
	public Payload getPayload(UUID shipperId);
	
	public Payload addPayload(Payload payload);
	
	public Payload updatePayload(Payload payload);
	
	public Payload deletePayload(UUID shipperId);
	
	
}
