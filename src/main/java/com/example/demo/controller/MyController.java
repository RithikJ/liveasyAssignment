package com.example.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.loads.Payload;
import com.example.demo.services.Services;

@RestController
public class MyController {
	
	@Autowired
	private Services services;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to home page";
	}
	
	@GetMapping("/load")
	public List<Payload> getPayload()
	{
		return this.services.getPayload();
	}
	
	@GetMapping("/load/{shipperId}")
	public Payload getPayloads(@PathVariable UUID shipperId)
	{
		return this.services.getPayload(shipperId);
	}
	
	@PostMapping("/load")
	public Payload addPayload( @RequestBody Payload payload)
	{
		return this.services.addPayload(payload);
	}
	
	@PutMapping("/load")
	public Payload updatePayload(@RequestBody Payload payload)
	{
		return this.services.updatePayload(payload);
	}
	@DeleteMapping("/load/{shipperId}")
	public Payload deletePayload(@PathVariable UUID shipperId)
	{
		return this.services.deletePayload(shipperId);
	}
}
