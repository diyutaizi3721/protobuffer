package com.bhan.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author bhan
 *
 */
public class Users implements Serializable {

	//User ID
	private int userId;
	//User Name
	private String userName;
	//User gender
	private int userAge;
	//
	private String userAddress;

	
	public Users(){}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	

}
