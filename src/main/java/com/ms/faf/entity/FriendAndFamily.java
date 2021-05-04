package com.ms.faf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FriendAndFamily {

	@Id
	@GeneratedValue
	Long id;
	
	long phoneNo;
	
	long friendAndFamily;
	
	public FriendAndFamily() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public long getFriendAndFamily() {
		return friendAndFamily;
	}

	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	
	
}
