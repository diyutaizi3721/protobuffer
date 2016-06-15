package com.bhan.dao.mapper;

import java.util.List;

import com.bhan.pojo.Users;

/**
 * 
 * @author bhan
 *
 */
public interface UserMapper extends BaseMapper{

	public List<Users> getUsersList();
	public void addUser(Users user);
	public void removeUser(Users user);
	public void modifyUser(Users user);
	public Users getUserById(int id);
	
}
