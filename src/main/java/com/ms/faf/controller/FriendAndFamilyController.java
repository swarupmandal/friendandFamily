package com.ms.faf.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.faf.dto.FriendAndFamilyDto;
import com.ms.faf.service.FriendAndFamilyService;

@RestController
@CrossOrigin
public class FriendAndFamilyController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FriendAndFamilyService service;
	
	@PostMapping(value = "/customers/{phoneNo}/friends")
	public void saveFriend(@PathVariable Long phoneNo, @RequestBody FriendAndFamilyDto dto) {
		logger.info("Friend Creation request " + phoneNo+" - " + dto);
		service.saveFriend(phoneNo, dto);
		
	}
	
	
	@GetMapping(value = "/customers/{phoneNo}/friends")
	public List<Long> getSpecificFriend(@PathVariable Long phoneNo){
		System.out.println("<<<<<<<<<<<<Fetching Friends Data>>>>>>>>>>>>");
		logger.info("Fetching Friend Data request " + phoneNo);
		return service.getSpecificFriend(phoneNo);
	}
	
	
}
