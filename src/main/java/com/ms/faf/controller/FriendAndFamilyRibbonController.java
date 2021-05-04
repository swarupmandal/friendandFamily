package com.ms.faf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ms.faf.service.FriendAndFamilyService;

@RestController
public class FriendAndFamilyRibbonController {

	@Autowired
	private FriendAndFamilyService service;
	
	
	
}
