package com.ms.faf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.faf.entity.FriendAndFamily;

public interface FriendAndFamilyRepository extends JpaRepository<FriendAndFamily, Long> {

	List<FriendAndFamily> getByPhoneNo(Long phoneNo);
	
	
}
