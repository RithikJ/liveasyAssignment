package com.example.demo.dao;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.loads.Payload;

public interface Truckdao extends JpaRepository<Payload, UUID>{


}
