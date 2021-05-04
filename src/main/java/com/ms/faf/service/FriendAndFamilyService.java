package com.ms.faf.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.faf.dto.FriendAndFamilyDto;
import com.ms.faf.entity.FriendAndFamily;
import com.ms.faf.repository.FriendAndFamilyRepository;

@Service
public class FriendAndFamilyService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FriendAndFamilyRepository repository;
	
	public void saveFriend(Long phoneNo, FriendAndFamilyDto dto) {
		
		logger.info("Friend creation request ", phoneNo+" - "+ dto);
		dto.setPhoneNo(phoneNo);
		FriendAndFamily faf = dto.createFriend();
		repository.save(faf);		
	}
	
	public List<Long> getSpecificFriend(Long phoneNo){
		logger.info("Friend details request ", phoneNo);
		List<Long> friendList = new ArrayList<>();
		List<FriendAndFamily> friends = repository.getByPhoneNo(phoneNo);
		for(FriendAndFamily f: friends) {
			friendList.add(f.getFriendAndFamily());
		}
		logger.info("Friend List request ", phoneNo, friendList);
		return friendList;
	}
	
	
}
