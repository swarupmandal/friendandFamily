package com.ms.faf.dto;

import com.ms.faf.entity.FriendAndFamily;

public class FriendAndFamilyDto {

	long phoneNo;
	
	long friendAndFamily;
	
	public FriendAndFamilyDto() {
		super();
	}	

	public FriendAndFamilyDto(long phoneNo, long friendAndFamily) {
		super();
		this.phoneNo = phoneNo;
		this.friendAndFamily = friendAndFamily;
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
	
	public FriendAndFamily createFriend() {
		
		FriendAndFamily faf = new FriendAndFamily();
		faf.setPhoneNo(this.getPhoneNo());
		faf.setFriendAndFamily(this.getFriendAndFamily());
		
		return faf;
	}
	
	
	@Override
	public String toString() {
		return "FriendAndFamilyDto [phoneNo=" + phoneNo + ", friendAndFamily=" + friendAndFamily + "]";
	}
	
	
}
