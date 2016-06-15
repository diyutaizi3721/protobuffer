package com.bhan.services;

import java.util.List;

import com.bhan.pojo.Users;


/**
 * 
 * @author bhan
 *
 */
public interface IUserServices {

	public void addUsers(Users user);
	
	public List<Users> getAllUsers();
	
	
	
}
